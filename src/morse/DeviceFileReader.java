/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Russell
 */
public class DeviceFileReader implements Runnable {

    final SignalDecoder handler;
    private InputStream in;

    public DeviceFileReader(Path deviceFile) throws FileNotFoundException {

        this(new FileInputStream(deviceFile.toFile()));

    }

    public DeviceFileReader(InputStream in) {
        this.in = in;
        this.handler = new SignalDecoder();
        this.handler.start();

    }

    public DeviceFileReader() throws FileNotFoundException {

        this(Paths.get("TestInput.txt"));
    }

    @Override
    public void run() {
        try {
            while (in.read() != -1) {
                handler.gotSignal();
            }
        } catch (IOException ex) {
            Logger.getLogger(DeviceFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.handler.stop();
        }
    }

}
