/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import global.GlobalParameters;

/**
 *
 * @author User
 */
public class Log {
   
    private static boolean logEnabled = true;
    public static void log(String log) {
        if(logEnabled) {
            System.out.println(log);
        }        
    }

    public static void email(String log) {
        if(GlobalParameters.LOGGER_EMAIL) {
            log("EMAIL SENDER: " + log);
        }
    }
}
