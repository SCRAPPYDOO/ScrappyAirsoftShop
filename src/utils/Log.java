/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

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
}
