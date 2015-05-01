/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

import static morse.SignalDecoder.States.*;

/**
 * @author Russell
 */
public class SignalDecoder implements Runnable {

    private static final Logger LOG = Logger.getLogger(SignalDecoder.class.getName());

    /**
     * After this many ms, the last signal is a dash
     */
    public static final long DASH_TIMEOUT = 500;

    /**
     * Minimum time so that the signal can be considered valid. If between
     * DOT_TIMEOUT and DASH_TIMEOUT, the signal is a dot.
     */
    public static final long DOT_TIMEOUT = 20;

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private final ExecutorService es = Executors.newSingleThreadExecutor();
    private final ScheduledExecutorService sexService = Executors.newScheduledThreadPool(1);

    private final AtomicLong lastSignal = new AtomicLong(Long.MAX_VALUE);
    private volatile ScheduledFuture signalCallback;

    private States state = NONE_READ;

    public SignalDecoder() {

    }

    public void start() {
        this.es.submit(this);
    }

    public void stop() {
        this.es.shutdown();
    }

    public void gotSignal() {
        final long thisSignal = System.currentTimeMillis();
        final long delta = thisSignal - lastSignal.get();
        lastSignal.set(thisSignal);

        LOG.log(Level.FINE, "Before state is {0}", state);
        switch (state) {
            case NONE_READ:
                state = SIGNAL_READ;

                this.signalCallback = sexService.schedule(new TimeOutDash(),
                        DASH_TIMEOUT,
                        TimeUnit.MILLISECONDS);
                break;
            case SIGNAL_READ:

                /*  
                 * We've already read one valid signal, so the next signal must
                 * produce a valid symbol. If delta is less than DASH_TIMEOUT the
                 * symbol is a dot
                 */
                if (delta > DOT_TIMEOUT && delta < DASH_TIMEOUT) {
                    addDot();
                } else {
                    /* this would signify that it is a dash, but the timer
                     * should take care of this, instead. So, ideally, this should
                     * never happen.
                     */
                }
                break;
            case CONSUME_REST:
                LOG.log(Level.FINE, "consumed");
                if (delta > DOT_TIMEOUT) {
                    LOG.log(Level.FINE, "finished consuming");
                    this.state = NONE_READ;
                }
                break;
        }

        LOG.log(Level.FINE, "State changed to {0}", state);
    }

    public void resetTimer() {
        if (signalCallback != null) {
            LOG.log(Level.FINE, "Resetting timer");
            signalCallback.cancel(false);
        } else {
            LOG.log(Level.WARNING, "Previous timer is null...");
        }
    }

    public synchronized void addDot() {
        resetTimer();
        queue.add(".");
        state = States.CONSUME_REST;
    }

    public synchronized void addDash() {
        resetTimer();
        queue.add("-");
        state = States.CONSUME_REST;
    }

    /**
     * @return bq
     */
    public BlockingQueue<String> getQueue() {
        return queue;
    }

    @Override
    public void run() {
        String input;
        try {
            while ((input = queue.take()) != null) {
                System.out.print(input);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(SignalDecoder.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            stop();

        }
    }

    private class TimeOutDash implements Runnable {

        @Override
        public void run() {
            addDash();
            LOG.log(Level.FINE, "Timer: state changed to {0}", state);

        }
    }

    static enum States {

        NONE_READ, SIGNAL_READ, CONSUME_REST;
    }
}
