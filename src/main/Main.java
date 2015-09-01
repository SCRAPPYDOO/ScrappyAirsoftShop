/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.Menu;
import sqlconnector.SqlConnector;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AllegroApi allegro = new AllegroApi();
        //allegro.doGetSellFormFieldsExt();
        
        //Database check
        if(SqlConnector.connectToDataBase(null, null, null)) {
            
        }

        
        Menu menu = new Menu();
        

    }
}
