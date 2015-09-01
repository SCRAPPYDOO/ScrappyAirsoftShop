/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.databaseStruct;

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
public enum WieniekTableStruct implements TableStructInterface {
    ID,
    ID_SPRZEDAZY,
    KWOTA,
    OPIS;

     public static Object getValueOver(WieniekTableStruct struct, ResultSet rs) {
        Object value = null;
        try {
            switch(struct) {
                case ID: 
                case ID_SPRZEDAZY:
                    value = rs.getInt(struct.toString());                    
                    break;
                case OPIS:
                    value = rs.getString(struct.toString());
                    break;
                case KWOTA:
                    value = rs.getDouble(struct.toString());
                    break;
                default: return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WieniekTableStruct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return value;
    }
    
    @Override
    public Object getValue(ResultSet rs) {
        return getValueOver(this, rs);
    }

    @Override
    public TableStructInterface[] getValues() {
        return WieniekTableStruct.values();
    }

    @Override
    public String getDataBaseTableName() {
        return "wieniek";
    }

    @Override
    public String[] getColumnTable() {
        String[] stringTable = new String[WieniekTableStruct.values().length];
        for(int i=0; i<WieniekTableStruct.values().length; i++) {
            stringTable[i] = WieniekTableStruct.values()[i].toString();
        }
        return stringTable;   
    }

    @Override
    public String getDataBaseTableNameDisplay() {
        return "TABELA EWIDENCJI: WIENIEK";
    }

    @Override
    public List<String> getColumnTableAsList() {
        List<String> list = new ArrayList();
        for(WieniekTableStruct struct : WieniekTableStruct.values()) {
            list.add(struct.toString());
        }
        return list;
    }

    @Override
    public TableStructInterface[] getInsertStruct() {
        TableStructInterface[] insertStruct = {
            ID,
            ID_SPRZEDAZY,
            KWOTA,
            OPIS
        };
        return insertStruct;
    }        

    @Override
    public String[] getColumnNamesTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String getTableName() {
        return "wieniek";
    }

    @Override
    public String toStringWithTableName() {
        return getTableName() + "." + this.toString();
    }
}
