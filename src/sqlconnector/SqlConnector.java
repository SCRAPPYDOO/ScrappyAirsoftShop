/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
package sqlconnector;

import database.databaseStruct.OutcomesStruct;
import database.databaseStruct.TableStructInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */

/*
ewidencja_out

INSERT INTO `scrappy_shop`.`ewidencja_out`
(`ID`,
`DATA_SPRZEDAZY`,
`TYP_PLATNOSCI`,
`ID_PLATNOSCI`,
`ID_KUPUJACY`,
`KOD_PRODUKTU`,
`TYP_EWIDENCJI`,
`STATUS_PLATNOSCI`,
`KOSZT_DOSTAWY`,
`TYP_DOSTAWY`,
`NASZ_KOSZT_DOSTAWY`,
`ILOSC`,
`CENA_HURTOWA`,
`CENA_DETALICZNA`,
`RABAT`,
`ALLEGRO`)
VALUES
(<{ID: }>,
<{DATA_SPRZEDAZY: }>,
<{TYP_PLATNOSCI: }>,
<{ID_PLATNOSCI: }>,
<{ID_KUPUJACY: }>,
<{KOD_PRODUKTU: }>,
<{TYP_EWIDENCJI: }>,
<{STATUS_PLATNOSCI: }>,
<{KOSZT_DOSTAWY: }>,
<{TYP_DOSTAWY: }>,
<{NASZ_KOSZT_DOSTAWY: }>,
<{ILOSC: }>,
<{CENA_HURTOWA: }>,
<{CENA_DETALICZNA: }>,
<{RABAT: }>,
<{ALLEGRO: }>);

 */

public final class SqlConnector {
    
    static private Connection conn = null;
    static private Statement sta = null;

    public static void incrementOutcomesCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getOutcomesCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean doQuery(String sql) {        
        return doExecuteUpdate(sql);
    }

    private static boolean doExecuteUpdate(String sql) {
        try {
            sta.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static String doSelectQuery(String sql) {
        return doSqlQuery(sql);
    }
    
    public static List<List<Object>> doSelectQuery(String sql, TableStructInterface[] columnsList) {
        List<List<Object>> resultListSet = new ArrayList();
        
        try {
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                List<Object> row = new ArrayList();
                for(TableStructInterface struct : columnsList) { 
                    row.add(struct.getValue(rs));                    
                }
                resultListSet.add(row); 
            }            
                                   
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultListSet;
    }

    public static Object[][] doSelectQuery(String sql, TableStructInterface[] columnList, int resultSize) {
        return doSelectQueryAsObject(sql, columnList, resultSize);  
    }
    
    public static boolean doSelectQuery(String sql, TableStructInterface[] columnList, DefaultTableModel model) {
        try {
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                Object[] row = new Object[model.getColumnCount()];                
                for(int i=0; i<row.length; i++) {
                    
                    row[i] = columnList[i].getValue(rs);
                }
                model.addRow(row);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
        
        return true;
    }
    
    public static Object[][] doSelectQueryAsObject(String sql, TableStructInterface[] columnList, int resultSize) {
        if(resultSize == 0) {
            resultSize = 2000;
        }
        Object[][] data = new Object[resultSize][columnList.length];
        try {
            int tableCount = 0;
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next() && tableCount < resultSize) {
                Object[] row = new Object[columnList.length];
                for(int i=0; i<columnList.length; i++) {
                    row[i] = columnList[i].getValue(rs);
                }
                data[tableCount] = row;
                tableCount++;
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;    
    }
    
    public static List<String> doSelectQuery(String sql, List<String> productCodeList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * Metoda generuje tabele dla popupa ItemSearchFrame.
     */
    public static Object[][] generateItemSearchFrameTable(String itemCodeSearch, String itemNameSearch) {
        List<String> selectColumns = new ArrayList();
        selectColumns.add("KOD_PRODUKTU");
        selectColumns.add("CENA");
        selectColumns.add("AKTUALNY_STAN");
        
        List<Map<String, String>> operators = new ArrayList();
        Map<String, String> operatorsRecord = new HashMap();
        operatorsRecord.put("EQUALS_OR_LIKE", "LIKE");
        operators.add(operatorsRecord);

        List<Map<String, String>> whereFilters = new ArrayList();
        Map<String, String> whereRecord = new HashMap();
        whereRecord.put("COLUMN", "KOD_PRODUKTU");
        whereRecord.put("FILTER", "%"+itemCodeSearch+"%");
        whereFilters.add(whereRecord);
        
        String sql = Sql.getSelectQuery("ewidencja_in", selectColumns, operators, whereFilters);
        
        Object[][] data = new Object[40][4];
        try {
            int tableCount = 0;
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getString("KOD_PRODUKTU"); 
                row[1] = rs.getDouble("CENA"); 
                row[2] = rs.getInt("AKTUALNY_STAN"); 
                row[3] = "Brak Obslugi";
                System.out.println("SqlConnector: generateItemSearchFrameTable " + row[2] + " " + row[1] + " " + row[0]);
                data[tableCount] = row;
                tableCount++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public static Object[][] getCustomerTableByFilter(String allegroNickFilter, String nameFilter, String surnameFilter, String emailFilter, String idFilter) {
        List<String> selectColumns = new ArrayList();
        selectColumns.add("CUSTOMER_ID");
        selectColumns.add("CUSTOMER_NAME");
        selectColumns.add("CUSTOMER_SURNAME");
        selectColumns.add("CUSTOMER_EMAIL");
        selectColumns.add("CUSTOMER_ALLEGRO_NICK");
        selectColumns.add("CUSTOMER_PHONE");
        
        List<Map<String, String>> whereFilters = new ArrayList();
        Map<String, String> whereRecord = new HashMap();
        List<Map<String, String>> operators = new ArrayList();
        Map<String, String> operatorsRecord = new HashMap();
        
        if(!allegroNickFilter.equals("")) {
            whereRecord.put("COLUMN", "CUSTOMER_ALLEGRO_NICK");
            whereRecord.put("FILTER", "%" + allegroNickFilter + "%");
            whereFilters.add(whereRecord);
            operatorsRecord.put("EQUALS_OR_LIKE", "LIKE");
            operatorsRecord.put("AND_OR", "OR");
            operators.add(operatorsRecord);            
        }
        
        if(!idFilter.equals("")) {
            whereRecord = new HashMap();
            operatorsRecord = new HashMap();
            whereRecord.put("COLUMN", "CUSTOMER_ID");
            whereRecord.put("FILTER", idFilter);
            whereFilters.add(whereRecord);
            operatorsRecord.put("EQUALS_OR_LIKE", "=");
            operatorsRecord.put("AND_OR", "OR");
            operators.add(operatorsRecord);            
        }

        if(!nameFilter.equals("")) {
            whereRecord = new HashMap();
            operatorsRecord = new HashMap();
            whereRecord.put("COLUMN", "CUSTOMER_NAME");
            whereRecord.put("FILTER", "%" + nameFilter + "%");
            whereFilters.add(whereRecord);
            operatorsRecord.put("EQUALS_OR_LIKE", "LIKE");
            operatorsRecord.put("AND_OR", "OR");
            operators.add(operatorsRecord);            
        }
        
        if(!surnameFilter.equals("")) {
            whereRecord = new HashMap();
            operatorsRecord = new HashMap();
            whereRecord.put("COLUMN", "CUSTOMER_SURNAME");
            whereRecord.put("FILTER", "%" + surnameFilter + "%");
            whereFilters.add(whereRecord);
            operatorsRecord.put("EQUALS_OR_LIKE", "LIKE");
            operatorsRecord.put("AND_OR", "OR");
            operators.add(operatorsRecord);            
        }        
        
        if(!emailFilter.equals("")) {
            whereRecord = new HashMap();
            operatorsRecord = new HashMap();
            whereRecord.put("COLUMN", "CUSTOMER_EMAIL");
            whereRecord.put("FILTER", "%" + emailFilter + "%");
            whereFilters.add(whereRecord);
            operatorsRecord.put("EQUALS_OR_LIKE", "LIKE");
            operators.add(operatorsRecord);            
        }          
        
        String sql = Sql.getSelectQuery("customers", selectColumns, operators, whereFilters);
        
        Object[][] data = new Object[40][6];
        try {
            int tableCount = 0;
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next() && tableCount < 20) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("CUSTOMER_ID"); 
                row[1] = rs.getString("CUSTOMER_NAME"); 
                row[2] = rs.getString("CUSTOMER_SURNAME"); 
                row[3] = rs.getString("CUSTOMER_EMAIL");
                row[4] = rs.getString("CUSTOMER_ALLEGRO_NICK");
                row[5] = rs.getString("CUSTOMER_PHONE");
                data[tableCount] = row;
                tableCount++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;    
    }
    
    public static Object[][] getOutcomesTable() {
        String sql = "SELECT * FROM ewidencja_out;";
        Object[][] data = new Object[1][1]; 
        try {
            ResultSet rs = sta.executeQuery(sql);
            rs.last();
            rs.getRow();
            data = new Object[rs.getRow()+1][OutcomesStruct.values().length];
            rs.beforeFirst();
            

            
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; 
    }

    public static boolean doUpdateQuery(String updateQuery) {
        return SqlConnector.doQuery(updateQuery);
    }

    public static boolean doInsertQuery(String query) {
        return SqlConnector.doQuery(query);
    }
    
    public static ResultSet doInsertQueryRs(String sql) {
        ResultSet rs = null;
        try {
            rs = sta.executeQuery(sql);                          
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }

    public static Object[][] getOrdersTableData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static DefaultTableModel getTableModel(TableStructInterface structInstance) {
        Object[][] tableData;        
        String[] columnNames;
        TableStructInterface[] columnList;
                
        String sql = "SELECT * FROM " + structInstance.getDataBaseTableName();
        ResultSet rs;
        
        try {
            rs = sta.executeQuery(sql);
            rs.last();
            columnNames = structInstance.getColumnNamesTable();
            columnList = structInstance.getValues();

            tableData = new Object[rs.getRow()][columnList.length];     
            rs.beforeFirst();
            
            while(rs.next()) {
                Object[] row = new Object[columnList.length];
                for(int i=0; i<columnList.length; i++) {
                    row[i] = columnList[i].getValue(rs);
                }
                
                tableData[rs.getRow()-1] = row;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return new DefaultTableModel();
        }
    
        return new DefaultTableModel(tableData, columnNames);
    }

    public static int getLastIdFromTableByColumn(String tableName, TableStructInterface column) {
        String sql = "SELECT " + column.toString() + " FROM " + tableName + " ORDER BY " + column.toString() + " DESC LIMIT 1";
        int index = 0;
        
        try {
            ResultSet rs = sta.executeQuery(sql);
            
            while(rs.next()) { 
                index = (int)column.getValue(rs);                         
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return index;
    }

    public static Object getSingleResult(String selectQuery) {
        Object object = new Object();    
        try {
            ResultSet rs = sta.executeQuery(selectQuery);            
            while(rs.next()) { 
                object = rs.getObject(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return object;    
    }

    public static boolean doDeleteQuery(String query) {
        return SqlConnector.doQuery(query);
    }

    private SqlConnector(){}
     
    public static boolean connectToDataBase(String host, String uName, String uPass) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            host = "jdbc:mysql://localhost:3306/scrappy_airsoft_shop"; //"jdbc:derby://localhost:1527/sklep";
            uName = "scrappy";
            uPass= "Marcin";
            conn = DriverManager.getConnection( host, uName, uPass );
            
            sta = conn.createStatement();
            
            System.out.println("SqlConnector: connected");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return false;
        } catch (InstantiationException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
 
    private static boolean doSqlQuery(String query, ResultSet rs) {
        try {
            rs = sta.executeQuery(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static String doSqlQuery(String query) {
        try {
            ResultSet rs = sta.executeQuery(query);
            String result = "";
            while(rs.next()) {
                result += rs.getString("KOD_PRODUKTU") + "\n"; 
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
            return "asdas";
        }
    }
    
    private static void log(String log) {        
        System.out.println("SqlConnector: " + log);    
    }
}
