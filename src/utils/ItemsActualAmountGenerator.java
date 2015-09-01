/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import gui.items.ItemsInStruct;
import database.databaseStruct.OutcomesStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sqlconnector.Sql;
import sqlconnector.SqlConnector;
import sqlconnector.SqlUpdateStruct;

/**
 *
 * @author User
 */
public class ItemsActualAmountGenerator {
    
    public static boolean generateActualAmountIncomeTable() {
        return true;
    }
    
    public static boolean updateRecord() { 
        ItemsInStruct[] incomesSelectList = { ItemsInStruct.ITEM_ID, ItemsInStruct.ITEM_CODE, ItemsInStruct.ITEM_AMOUNT, ItemsInStruct.ITEM_ACTUAL_AMOUNT, ItemsInStruct.ITEM_PRICE };
        String selectIcomes = Sql.getSelectQuery(ItemsInStruct.getTableName(), incomesSelectList);    
        List<List<Object>> incomesTable = SqlConnector.doSelectQuery(selectIcomes, incomesSelectList); 
        
        for(List<Object> row : incomesTable) {
            int id = (int)row.get(0);
            int iloscIncome = (int)row.get(2);
            String kod = (String)row.get(1); 
            row.set(3, iloscIncome);
            int iloscZaktualizowana = (int)row.get(3);            
            Map record = new HashMap();
            record.put(SqlUpdateStruct.SET_COLUMN, ItemsInStruct.ITEM_ACTUAL_AMOUNT.toString());
            record.put(SqlUpdateStruct.SET_VALUE, iloscZaktualizowana);
            
            SqlConnector.doUpdateQuery(Sql.getUpdateQuery(ItemsInStruct.getTableName(), record, Sql.getWhereMap(ItemsInStruct.ITEM_ID.toString(), ""+id, "=", "")));   
        }    
        
        System.out.println("updateRecord DONE"); 
        return true;
    }
    
    private static boolean updateRecord(int id, int amount) { 
        Map record = Sql.getUpdateMap(ItemsInStruct.ITEM_ACTUAL_AMOUNT.toString(), "" + amount);

        return SqlConnector.doUpdateQuery(Sql.getUpdateQuery(ItemsInStruct.getTableName(), record, Sql.getWhereMap(ItemsInStruct.ITEM_ID.toString(), ""+id, "=", "")));                   
    }
    
    public static boolean generateActualAmount() {
        OutcomesStruct[] outcomesSelectList = { OutcomesStruct.KOD_PRODUKTU, OutcomesStruct.ILOSC, OutcomesStruct.CENA_HURTOWA, OutcomesStruct.ID }; 
        String selectOutcomes = Sql.getSelectQuery(OutcomesStruct.getTableName(), outcomesSelectList);    
        List<List<Object>> outcomesTable = SqlConnector.doSelectQuery(selectOutcomes, outcomesSelectList);

        ItemsInStruct[] incomesSelectList = { ItemsInStruct.ITEM_ID, ItemsInStruct.ITEM_CODE, ItemsInStruct.ITEM_AMOUNT, ItemsInStruct.ITEM_ACTUAL_AMOUNT, ItemsInStruct.ITEM_PRICE, ItemsInStruct.ITEM_STOCK_TAKING_AMOUNT};
        String selectIcomes = Sql.getSelectQuery(ItemsInStruct.getTableName(), incomesSelectList);    
        List<List<Object>> incomesTable = SqlConnector.doSelectQuery(selectIcomes, incomesSelectList);
        
        //Bierzemy Kod Produktu i cene z  outcome
        for(List<Object> row : outcomesTable) {
            int idOutcomes = (int)row.get(3);
            String kodProduktuOutcome = (String)row.get(0);
            int iloscOutcome = (int)row.get(1);
            double cenaOutcome = (double)row.get(2);
            String incomesCode;
            int iloscAktualnyStanIncome;
            incomesTableLoop : for(List<Object> icomeRow : incomesTable) {   
                incomesCode = (String)icomeRow.get(1);
                if(kodProduktuOutcome.toLowerCase().replace(" ", "").equals(incomesCode.toLowerCase().replace(" ", ""))) {                 
                    if(cenaOutcome == ((double)icomeRow.get(4))) {           
                        iloscAktualnyStanIncome = (int)icomeRow.get(3);
                        if(iloscAktualnyStanIncome >= iloscOutcome) {
                            iloscAktualnyStanIncome -= iloscOutcome;   
                            icomeRow.set(3, iloscAktualnyStanIncome);
                            updateRecord((int)icomeRow.get(0), iloscAktualnyStanIncome);   
                            iloscOutcome = 0;
                            break incomesTableLoop;
                        } else {
                            iloscOutcome = iloscOutcome - iloscAktualnyStanIncome;
                            iloscAktualnyStanIncome = 0;
                            icomeRow.set(3, iloscAktualnyStanIncome);
                            updateRecord((int)icomeRow.get(0), iloscAktualnyStanIncome);    
                        }
                    }
                }
            } 
            if(iloscOutcome > 0) {
                System.out.println("ERROR generateActualAmount id: " + idOutcomes + " kod produktu " + kodProduktuOutcome + " | " + iloscOutcome + " | " + cenaOutcome); 
            }
        }
        

        System.out.println("generateActualAmount DONE"); 


        //Sprawdzamy  ilosc  ktora  przyszla - aktualny stan  - odejmujemy ilosc z  outcome
        //soprawdzamy czy wynik > od aktualny stan jezlei aktualny stan nie  jest  rowny 0
        //zapisujemy do aktualny stan

        //for(int i=0; i<outcomesTableContent)
        
        return true;
    }
    
    public static void difference() {
        ItemsInStruct[] incomesSelectList = { ItemsInStruct.ITEM_ID, ItemsInStruct.ITEM_CODE, ItemsInStruct.ITEM_AMOUNT, ItemsInStruct.ITEM_ACTUAL_AMOUNT, ItemsInStruct.ITEM_PRICE, ItemsInStruct.ITEM_STOCK_TAKING_AMOUNT};
        String selectIcomes = Sql.getSelectQuery(ItemsInStruct.getTableName(), incomesSelectList);    
        List<List<Object>> incomesTable = SqlConnector.doSelectQuery(selectIcomes, incomesSelectList);
        
        for(List<Object> entry : incomesTable) {
            if((int)entry.get(3) > 0 || (int)entry.get(5) > 0) {
                if(entry.get(3) != entry.get(5)) {
                    System.out.println("difference: id: " + entry.get(0) + " kod: " + entry.get(1) + " stany " + entry.get(3) + " | " + entry.get(5) + " cena " + entry.get(4));
                }
            }
        }
        
        System.out.println("difference DONE");
    }

}

