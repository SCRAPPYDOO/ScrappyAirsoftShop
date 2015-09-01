/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.items;

import database.databaseStruct.OutcomesStruct;
import database.databaseStruct.TableStructInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public enum ItemsInStruct implements TableStructInterface{
    ITEM_ID, 
    ITEM_ORDER_ID, 
    ITEM_CODE, 
    ITEM_AMOUNT, 
    ITEM_PRICE, 
    ITEM_SUM_PRICE, 
    ITEM_ACTUAL_AMOUNT, 
    ITEM_STOCK_TAKING_AMOUNT;

    public static String[] getValuesAsString() {
        String[] values = new String[ItemsInStruct.values().length];
        for(ItemsInStruct struct : ItemsInStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    static String getValueWithTableName(ItemsInStruct itemsInStruct) {
        return ItemsInStruct.getTableName() + "." + itemsInStruct.toString();
    }

    @Override
    public Object getValue(ResultSet rs) {
        Object value = null;
        try {
            switch(this) {
                case ITEM_ID:  
                case ITEM_AMOUNT:
                case ITEM_ACTUAL_AMOUNT:
                case ITEM_STOCK_TAKING_AMOUNT:
                    value = rs.getInt(this.toString());                    
                    break;
                case ITEM_ORDER_ID:
                case ITEM_CODE:
                    value = rs.getString(this.toString());
                    break;
                case ITEM_PRICE:
                case ITEM_SUM_PRICE:
                    value = rs.getDouble(this.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OutcomesStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }
    
    public static String getTableName() {
        return "items_in";
    }

    @Override
    public TableStructInterface[] getValues() {
        return ItemsInStruct.values();
    }
    
    @Override
    public String getDataBaseTableName() {
        return "items_in";
    }

    @Override
    public String[] getColumnTable() {
        String[] stringTable = new String[ItemsInStruct.values().length];
        for(int i=0; i<ItemsInStruct.values().length; i++) {
            stringTable[i] = ItemsInStruct.values()[i].toString();
        }
        return stringTable;    
    }

    @Override
    public String getDataBaseTableNameDisplay() {
        return "TABELA EWIDENCJI DOSTAW";
    }
    
    @Override
    public List<String> getColumnTableAsList() {
        List<String> list = new ArrayList();
        for(ItemsInStruct struct : ItemsInStruct.values()) {
            list.add(struct.toString());
        }
        return list;
    }

    @Override
    public TableStructInterface[] getInsertStruct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getColumnNamesTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toStringWithTableName() {
        return getTableName() + "." + this.toString();
    }
   
}
