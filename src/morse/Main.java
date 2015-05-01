/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Russell
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
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
