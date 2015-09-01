/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.databaseStruct;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author User
 */
public interface TableStructInterface {
    //public Object getValue(OutcomesStruct struct, ResultSet rs);
    //public Object getValue(IncomesStruct struct, ResultSet rs);
    public Object getValue(ResultSet rs);
    //public String getTableName();
    public TableStructInterface[] getValues();
    
    public String getDataBaseTableName();
   
    public String[] getColumnTable();
    
    public String[] getColumnNamesTable();

    public String getDataBaseTableNameDisplay();

    public List<String> getColumnTableAsList();
    
    public TableStructInterface[] getInsertStruct();

    public String toStringWithTableName();
}
