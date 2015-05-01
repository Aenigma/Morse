/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import edu.frostburg.compclub.morse.morsecompiler.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Russell
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {

        if (true) {
            withCompiler(args);
        } else {
            final DeviceFileReader read;
            if (args.length > 0) {
                read = new DeviceFileReader(Paths.get(args[0]));
            } else {
                read = new DeviceFileReader(System.in);
            }

            ExecutorService es = Executors.newSingleThreadExecutor();
            es.submit(read);
        }
    }

    public static void withCompiler(String... args) throws IOException {
        final DeviceFileReader read;
        if (args.length > 0) {
            read = new DeviceFileReader(Paths.get(args[0]));
        } else {
            read = new DeviceFileReader(System.in);
        }

        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(read);


        //
        // ANTLRInputStream input = new ANTLRInputStream(new QueueStream(read.handler.getQueue()));

        UnbufferedCharStream input = new UnbufferedCharStream(new QueueStream(read.handler.getQueue()));
//        UnbufferedCharStream input = new UnbufferedCharStream(System.in);

        MorseCodeLexer mcl = new MorseCodeLexer(input);
        mcl.setTokenFactory(new CommonTokenFactory(true));

        /*Token t;

        System.out.println("Starting lex loop");
        while ((t = mcl.nextToken()).getType() != Token.EOF) {
            if (t.getText().trim().length() == 0) {
                System.out.println("-> " + MorseCodeParser.VOCABULARY.getDisplayName(t.getType()));
            } else {
                System.out.println("-> " + t.getText());
            }
        }
        System.out.println("End lex loop");
        */
        MorseCodeParser mcp = new MorseCodeParser(new UnbufferedTokenStream<CommonToken>(mcl));
        mcp.addParseListener(new MorseCodeBaseListener() {
            /**
             * {@inheritDoc}
             * <p>
             * <p>The default implementation does nothing.</p>
             *
             * @param node
             */
            @Override
            public void visitTerminal(@NotNull TerminalNode node) {
                super.visitTerminal(node);
            }
        });

        mcp.sequence();

        // CommonTokenStream cts = new CommonTokenStream(mcl);
/*        UnbufferedTokenStream cts = new UnbufferedTokenStream(mcl);

        MorseCodeParser mcp = new MorseCodeParser(cts);

        mcp.setBuildParseTree(false);

        final ParseTree sequence = mcp.sequence();

        ParseTreeWalker ptw = new ParseTreeWalker();

        ptw.walk(new MorseCodeBaseListener(), sequence);*/
    }

    static class QueueStream extends InputStream {

        private final BlockingQueue<String> queue;
        int count = 0;

        QueueStream(BlockingQueue<String> queue) {
            this.queue = queue;
        }


        /**
         * Reads the next byte of data from the input stream. The value byte is
         * returned as an <code>int</code> in the range <code>0</code> to
         * <code>255</code>. If no byte is available because the end of the stream
         * has been reached, the value <code>-1</code> is returned. This method
         * blocks until input data is available, the end of the stream is detected,
         * or an exception is thrown.
         * <p>
         * <p> A subclass must provide an implementation of this method.
         *
         * @return the next byte of data, or <code>-1</code> if the end of the
         * stream is reached.
         * @throws java.io.IOException if an I/O error occurs.
         */
        @Override
        public int read() throws IOException {

            // i have no idea why i need to do this
            // but next time, don't use antlr...
            if (++count % 2 == 0) {
                return -1;
            }
            try {
                final byte b = (byte) queue.take().charAt(0);
                System.out.println((char) b);
                return b;
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
        }
    }

}
