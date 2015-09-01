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
public enum ItemsOutStruct implements TableStructInterface {
    ID,
    ORDER_ID,
    KOD_PRODUKTU,
    ILOSC,
    CENA_HURTOWA,
    CENA_DETALICZNA,
    RABAT,
    ITEM_ID
    ;

    public static TableStructInterface getEnumByName(String structName) {
        for(ItemsOutStruct struct : ItemsOutStruct.values()) {
            if(struct.toString().equals(structName)) {
                return struct;
            }
        }
        
        return null;
    }

    public static String getTableName() {
        return "items_out";
    }

    public static Object getValueOver(ItemsOutStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ID:  
                case ORDER_ID:
                case ILOSC:
                case ITEM_ID:
                    value = rs.getInt(struct.toString());                    
                    break;
                case KOD_PRODUKTU:
                    value = rs.getString(struct.toString());
                    break;
                case CENA_HURTOWA:
                case CENA_DETALICZNA:
                case RABAT:
                    value = rs.getDouble(struct.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OutcomesStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }

    public static TableStructInterface[] getOrderItemViewTableStruct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static TableStructInterface[] getReplaceStruct() {
        TableStructInterface[] struct = { ItemsOutStruct.ID, ItemsOutStruct.KOD_PRODUKTU, ItemsOutStruct.ILOSC, ItemsOutStruct.CENA_HURTOWA, ItemsOutStruct.CENA_DETALICZNA, ItemsOutStruct.RABAT, ItemsOutStruct.ITEM_ID };         
        return struct;
    }

    static String[] getValuesAsString() {
        String[] values = new String[ItemsOutStruct.values().length];
        for(ItemsOutStruct struct : ItemsOutStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }

    public static TableStructInterface getColumnTypeMap(String columnName) {
        TableStructInterface stuct;
        switch(columnName) {
            //case "ID": stuct = ItemsOutStruct; break;
            //case "DATA_SPRZEDAZY": stuct = ; break;
            //case "TYP_PLATNOSCI": stuct = ; break;
            //case "ID_PLATNOSCI": stuct = ; break;
            //case "ID_KUPUJACY": stuct = ; break;
            case "KOD_PRODUKTU": stuct = ItemsOutStruct.KOD_PRODUKTU; break;
            //case "TYP_EWIDENCJI": stuct = ; break;
            //case "STATUS_PLATNOSCI": stuct = ; break;
            //case "KOSZT_DOSTAWY": stuct = ; break;
            //case "TYP_DOSTAWY": stuct = ; break;
            //case "NASZ_KOSZT_DOSTAWY": stuct = ; break;
            case "ILOSC": stuct = ItemsOutStruct.ILOSC; break;
            case "CENA_HURTOWA": stuct = ItemsOutStruct.CENA_HURTOWA; break;
            case "CENA_DETALICZNA": stuct = ItemsOutStruct.CENA_DETALICZNA; break;
            case "RABAT": stuct = ItemsOutStruct.RABAT; break;
            //case "ALLEGRO": stuct = ; break;
            //case "NICK_KUPUJACY": stuct = ; break;
            //case "DANE_KUPUJACY": stuct = ; break;
            default: throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return stuct;
    }

    public static String[] valuesAsString() {
        String[] values = new String[ItemsOutStruct.values().length];
        for(ItemsOutStruct struct : ItemsOutStruct.values()) {
            values[struct.ordinal()] = struct.toString();
        }
        return values;
    }
    
    @Override
    public Object getValue(ResultSet rs) {
        return getValueOver(this, rs);
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
        return getTableName() + "." + this.toString();
    }

}
