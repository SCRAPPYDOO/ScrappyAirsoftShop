/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.databaseStruct.TableStructInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import sqlconnector.Sql;
import sqlconnector.SqlConnector;

/**
 *
 * @author User
 */
public class DatabaseMenager {
    
    
    
    public static void updateItemActualAmount() {
        //Pobierz Liste Kodow z Tabeli Towary
        List<String> productCodeList = new ArrayList();
        String sql = "";
        SqlConnector.doSelectQuery(sql, productCodeList);
        
        //Policz ilosc dla  kazdego kodu z tabeli przyjscia     
        
        List<Map<String, String>> listaStanowTowaru = new ArrayList();
        
        /*for(int i=0; i<productCodeList.size(); i++) {
            int iloscEwidencjaIn = SqlConnector.doCountSelectQuery(Sql.getSelectCountQuery("ewidencja_in", "ilosc", productCodeList.get(i)));
            int iloscEwidencjaOut = SqlConnector.doCountSelectQuery(Sql.getSelectCountQuery("ewidencja_out", "ilosc", productCodeList.get(i)));
            Map<String, String> tmp = new HashMap(); 
            tmp.put("KOD", productCodeList.get(i));
            tmp.put("ILOSC_IN", ""+iloscEwidencjaIn);
            tmp.put("ILOSC_OUT", ""+iloscEwidencjaOut);
            listaStanowTowaru.add(tmp);   
        }


        String sql = Sql.getReplaceIntoSqlQuery("item_actual_amount", values);
        // Zapisz do tabeli item_actual_amount
        SqlConnector.doReplaceIntoQuery(sql);*/
    }

    public static void getTableByName(String tableName, DefaultTableModel model, TableStructInterface[] struct) {        
        String sql = Sql.getSelectQuery(tableName, struct);
        SqlConnector.doSelectQuery(sql, struct, model);
    }
}
