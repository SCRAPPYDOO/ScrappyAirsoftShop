package database.databaseStruct;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum OutcomesStruct implements TableStructInterface {
    ID,
    DATA_SPRZEDAZY,
    TYP_PLATNOSCI,
    ID_PLATNOSCI,
    ID_KUPUJACY,
    KOD_PRODUKTU,
    TYP_EWIDENCJI,
    STATUS_PLATNOSCI,
    KOSZT_DOSTAWY,
    TYP_DOSTAWY,
    NASZ_KOSZT_DOSTAWY,
    ILOSC,
    CENA_HURTOWA,
    CENA_DETALICZNA,
    RABAT,
    ALLEGRO,
    NICK_KUPUJACY,
    DANE_KUPUJACY;
    
    public static Object getValueOver(OutcomesStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ID:  
                case ID_KUPUJACY:
                case ILOSC:
                    value = rs.getInt(struct.toString());                    
                    break;
                case DATA_SPRZEDAZY:    
                    value = rs.getDate(struct.toString());
                    break;
                case TYP_PLATNOSCI:
                case KOD_PRODUKTU:
                case ID_PLATNOSCI:
                case TYP_EWIDENCJI:
                case STATUS_PLATNOSCI:
                case TYP_DOSTAWY:
                case ALLEGRO:
                case NICK_KUPUJACY:
                case DANE_KUPUJACY:
                    value = rs.getString(struct.toString());
                    break;
                case KOSZT_DOSTAWY:
                case NASZ_KOSZT_DOSTAWY:
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
    
    public static String getTableName() {
        return "ewidencja_out";
    }

    @Override
    public Object getValue(ResultSet rs) {
        return getValueOver(this, rs);
    }

    public static String[] getTableAsString(OutcomesStruct[] columnList) {
        String[] stringTable = new String[columnList.length];
        for(int i=0; i<columnList.length; i++) {
            stringTable[i] = columnList[i].toString();
        }
        return stringTable;
    }

    @Override
    public TableStructInterface[] getValues() {        
        return OutcomesStruct.values();
    }

    @Override
    public String getDataBaseTableName() {
        return "ewidencja_out";
    }

    @Override
    public String[] getColumnTable() {
        String[] stringTable = new String[OutcomesStruct.values().length];
        for(int i=0; i<OutcomesStruct.values().length; i++) {
            stringTable[i] = OutcomesStruct.values()[i].toString();
        }
        return stringTable;    
    }

    @Override
    public String getDataBaseTableNameDisplay() {
        return "TABELA EWIDENCJI SPRZEDAŻY";
    }

    @Override
    public List<String> getColumnTableAsList() {
        List<String> list = new ArrayList();
        for(OutcomesStruct struct : OutcomesStruct.values()) {
            list.add(struct.toString());
        }
        return list;
    }

    @Override
    public TableStructInterface[] getInsertStruct() {
        TableStructInterface[] insertStruct = {
        ID_KUPUJACY,
        KOD_PRODUKTU,
        TYP_EWIDENCJI,
        STATUS_PLATNOSCI,
        KOSZT_DOSTAWY,
        TYP_DOSTAWY,
        NASZ_KOSZT_DOSTAWY,
        ILOSC,
        CENA_HURTOWA,
        CENA_DETALICZNA,
        RABAT,
        ALLEGRO,
        NICK_KUPUJACY,
        DANE_KUPUJACY };
        return insertStruct;
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
