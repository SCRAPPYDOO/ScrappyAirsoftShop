/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.customers;

import database.databaseStruct.TableStructInterface;
import global.GlobalParameters;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public enum CustomersStruct implements TableStructInterface {
    CUSTOMER_ID,
    CUSTOMER_NAME,
    CUSTOMER_SURNAME,
    CUSTOMER_EMAIL,
    CUSTOMER_ALLEGRO_NICK,
    CUSTOMER_PHONE
    ;

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
    public String[] getColumnNamesTable() {
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
    public Object getValue(ResultSet rs) {
        return getValue(this, rs);
    }
    
    private static Object getValue(CustomersStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case CUSTOMER_ID:  
                    value = rs.getInt(struct.toString());                    
                    break;
                case CUSTOMER_NAME:
                case CUSTOMER_SURNAME:
                case CUSTOMER_EMAIL:
                case CUSTOMER_ALLEGRO_NICK:
                case CUSTOMER_PHONE:
                    value = rs.getString(struct.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomersStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }    
    
    public static String getTableName() {
        return GlobalParameters.CUSTOMERS_TABLE_NAME;
    }
    
    public static String[] getValuesAsString() {
        String[] values = new String[CustomersStruct.values().length];
        for(CustomersStruct struct : CustomersStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    @Override
    public String toStringWithTableName() {
        return getTableName() + "." + this.toString();
    }
}
