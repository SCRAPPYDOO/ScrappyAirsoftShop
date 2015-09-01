/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.items;

import database.databaseStruct.OutcomesStruct;
import database.databaseStruct.TableStructInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public enum ItemsStruct implements TableStructInterface{
    ITEM_CODE,
    ITEM_NAME,
    ALLEGRO_AUCTION_ID,
    DETAL_PRICE,
    ITEM_ACTUAL_AMOUNT
    ;

    public static String getTableName() {
        return "items";
    }
    
    public static Object getValue(ItemsStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ITEM_CODE:
                case ITEM_NAME:
                case ALLEGRO_AUCTION_ID:
                case DETAL_PRICE:
                    value = rs.getString(struct.toString());
                    break;
                case ITEM_ACTUAL_AMOUNT:
                    value = rs.getInt(struct.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OutcomesStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }

    static String getValueWithTableName(ItemsStruct itemsStruct) {
        return ItemsStruct.getTableName() + "." + itemsStruct.toString();
    }
    
    @Override
    public Object getValue(ResultSet rs) {
        return getValue(this, rs);
    }

    @Override
    public TableStructInterface[] getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDataBaseTableName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getColumnTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDataBaseTableNameDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getColumnTableAsList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TableStructInterface[] getInsertStruct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getColumnNamesTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String[] getValuesAsString() {
        String[] values = new String[ItemsStruct.values().length];
        for(ItemsStruct struct : ItemsStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    @Override
    public String toStringWithTableName() {
        return getTableName() + "." + this.toString();
    }
    
}
