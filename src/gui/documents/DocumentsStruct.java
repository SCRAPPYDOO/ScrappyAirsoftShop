/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.documents;

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
public enum DocumentsStruct implements TableStructInterface{
    ID,
    DOCUMENT_DATE,
    INVOICE_NUMBER,
    CONTRACTOR_ID,
    BUSINESS_EVENT,
    INCOMES_VALUE_23,
    INCOMES_OTHER_VALUE_23,
    DELIVERY_VALUE_23,
    DELIVERY_OTHER_VALUE_23,
    EMPLOYEE_SALARY_23,
    OTHER_EXPENSES_23,
    OTHER_EXPENSES_8,
    OTHER_EXPENSES_5,
    OTHER_EXPENSES_0,
    OTHER_EXPENSES_ZW,
    REMARKS
    ;

    public static Object getValue(DocumentsStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ID:  
                case CONTRACTOR_ID:
                    value = rs.getInt(struct.toString());                    
                    break;
                case INVOICE_NUMBER:                                       
                case BUSINESS_EVENT:
                case REMARKS:
                    value = rs.getString(struct.toString());
                    break;
                case DOCUMENT_DATE:
                    value = rs.getDate(struct.toString());
                    break;                    
                case INCOMES_VALUE_23:
                case INCOMES_OTHER_VALUE_23:
                case DELIVERY_VALUE_23:
                case DELIVERY_OTHER_VALUE_23:
                case EMPLOYEE_SALARY_23:
                case OTHER_EXPENSES_23:
                case OTHER_EXPENSES_8:
                case OTHER_EXPENSES_5:
                case OTHER_EXPENSES_0:
                case OTHER_EXPENSES_ZW:
                    value = rs.getBigDecimal(struct.toString());
                    break;                                          
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocumentsStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;  
    }    
        
    public static String getTableName() {
        return "documents";
    }
    
    public static String[] getValuesAsString() {
        String[] values = new String[DocumentsStruct.values().length];
        for(DocumentsStruct struct : DocumentsStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    static String[] getViewStruct(String viewType) {
        DocumentsStruct[] struct;
        switch(viewType) {
            case "KPIR": 
                struct = new DocumentsStruct[] { 
                    DocumentsStruct.DOCUMENT_DATE, 
                    DocumentsStruct.INVOICE_NUMBER, 
                    DocumentsStruct.CONTRACTOR_ID, 
                    DocumentsStruct.BUSINESS_EVENT, 
                    DocumentsStruct.INCOMES_VALUE_23, 
                    DocumentsStruct.INCOMES_OTHER_VALUE_23, 
                    DocumentsStruct.DELIVERY_VALUE_23,    
                    DocumentsStruct.DELIVERY_OTHER_VALUE_23,
                    DocumentsStruct.EMPLOYEE_SALARY_23,
                    DocumentsStruct.OTHER_EXPENSES_23,
                    DocumentsStruct.OTHER_EXPENSES_8,
                    DocumentsStruct.OTHER_EXPENSES_5,
                    DocumentsStruct.OTHER_EXPENSES_0,
                    DocumentsStruct.OTHER_EXPENSES_ZW,
                    DocumentsStruct.REMARKS
                }; 
                break;
            default: return null;
        }
        List<String> strings = new ArrayList();
        for(DocumentsStruct value : struct) {
            strings.add(value.toString());
        }
        
        String[] stockArr = new String[strings.size()];
        stockArr = strings.toArray(stockArr);

        return stockArr;
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
