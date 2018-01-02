package com.example.cavamura.cvvsdrk;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by cavamura on 25/12/2017.
 */

public class VVLogger {
    private static final Logger log = Logger.getLogger("ProfileMatrix");

    public static void logInfo(String msg)
    {
        log.info(msg);
    }

    public static void logSevereError(String msg)
    {
        log.severe(msg);
    }

    public static void LogLauncher()
    {
        try
        {
            FileHandler h = new FileHandler("profilematrix.log", true);
            h.setFormatter(new SimpleFormatter());
            log.addHandler(h);
            log.setUseParentHandlers(true);
        } catch (SecurityException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
