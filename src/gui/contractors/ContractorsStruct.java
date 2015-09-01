/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contractors;

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
public enum ContractorsStruct implements TableStructInterface{
    CONTRACTOR_ID,
    CONTRACTOR_DATA,
    CONTRACTOR_ADDRESS,
    CONTRACTOR_NIP, 
    CONTRACTOR_CITY, 
    CONTRACTOR_POSTCODE,
    CONTRACTOR_BANK_ACCOUNT_NUMBER,
    CONTRACTOR_PHONE
    ;

    static String[] valuesAsString() {
        String[] values = new String[ContractorsStruct.values().length];
        for(ContractorsStruct struct : ContractorsStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    static String getTableName() {
        return "contractors";
    }

    private Object getValue(ContractorsStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case CONTRACTOR_ID:                  
                    value = rs.getInt(struct.toString());                    
                    break;
                case CONTRACTOR_NIP:
                case CONTRACTOR_DATA:
                case CONTRACTOR_CITY:
                case CONTRACTOR_POSTCODE:
                case CONTRACTOR_ADDRESS:
                    value = rs.getString(struct.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContractorsStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
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
        return "contractors";
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
    public String toStringWithTableName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
