/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.orders;

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
public enum OrdersStruct implements TableStructInterface {
    ID,
    CUSTOMER_ID,
    ORDER_DATE,
    PAYMENT_DATE,
    PAYMENT_TYPE,
    PAYMENT_ID,
    PAYMENT_STATUS,
    RECORD_TYPE,
    ALLEGRO_FLAG,
    SHIPMENT_TYPE,
    SHIPMENT_COST,
    SHIPMENT_OUR_COST,
    TRACKING_ID,
    ORDER_STATUS
    
    ;

    public static String getTableName() {
        return "orders";
    }
    
    public static String[] getColumnNames() {
        String[] columnList = new String[OrdersStruct.values().length];        
        for(OrdersStruct struct : OrdersStruct.values()) {
            columnList[struct.ordinal()] = (struct.toString());
        }
        return columnList;
    }

    public static TableStructInterface[] getColumnList() {
        return OrdersStruct.values();
    }

    public static TableStructInterface getColumnTypeMap(String columnName) {
        TableStructInterface stuct;
        switch(columnName) {
            case "DATA_SPRZEDAZY": stuct = OrdersStruct.PAYMENT_DATE; break;
            case "TYP_PLATNOSCI": stuct = OrdersStruct.PAYMENT_TYPE; break;
            case "ID_PLATNOSCI": stuct = OrdersStruct.PAYMENT_ID; break;
            case "ID_KUPUJACY": stuct = OrdersStruct.CUSTOMER_ID; break;
            //case "KOD_PRODUKTU": stuct = OrdersStruct; break;
            case "TYP_EWIDENCJI": stuct = OrdersStruct.RECORD_TYPE; break;
            case "STATUS_PLATNOSCI": stuct = OrdersStruct.PAYMENT_STATUS; break;
            case "KOSZT_DOSTAWY": stuct = OrdersStruct.SHIPMENT_COST; break;
            case "TYP_DOSTAWY": stuct = OrdersStruct.SHIPMENT_TYPE; break;
            case "NASZ_KOSZT_DOSTAWY": stuct = OrdersStruct.SHIPMENT_OUR_COST; break;
            //case "ILOSC": stuct = ; break;
            //case "CENA_HURTOWA": stuct = ; break;
            //case "CENA_DETALICZNA": stuct = ; break;
            //case "RABAT": stuct = ; break;
            case "ALLEGRO": stuct = OrdersStruct.ALLEGRO_FLAG; break;
            //case "NICK_KUPUJACY": stuct = ; break;
            //case "DANE_KUPUJACY": stuct = ; break;
            default: throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return stuct;
    }

    static String[] valuesAsString() {
        String[] table = new String[OrdersStruct.values().length];
        for(OrdersStruct struct : OrdersStruct.values()) {
            table[struct.ordinal()] = struct.toString();
        }
        return table;  
    }

    @Override
    public Object getValue(ResultSet rs) {
        return getValue(this, rs);
    }

    @Override
    public TableStructInterface[] getValues() {
        return OrdersStruct.values();
    }

    @Override
    public String getDataBaseTableName() {
        return "orders";
    }

    @Override
    public String[] getColumnNamesTable() {
        String[] stringTable = new String[OrdersStruct.values().length];
        for(int i=0; i<OrdersStruct.values().length; i++) {
            stringTable[i] = OrdersStruct.values()[i].toString();
        }
        return stringTable;   
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
    public String[] getColumnTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Object getValue(OrdersStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ID:  
                case CUSTOMER_ID:
                    value = rs.getInt(struct.toString());                    
                    break;
                case TRACKING_ID:                                       
                case PAYMENT_TYPE:
                case PAYMENT_ID:
                case PAYMENT_STATUS:
                case RECORD_TYPE:
                case ALLEGRO_FLAG:
                case SHIPMENT_TYPE:
                    value = rs.getString(struct.toString());
                    break;
                case ORDER_DATE:
                case PAYMENT_DATE:
                    value = rs.getDate(struct.toString());
                    break;                    
                case SHIPMENT_COST:
                case SHIPMENT_OUR_COST:
                    value = rs.getBigDecimal(struct.toString());
                    break;                                          
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;    
    }

    @Override
    public String toStringWithTableName() {
        return getTableName() + "." + this.toString();
    }
    
}
