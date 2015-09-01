/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconnector;

import database.databaseStruct.TableStructInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import utils.Log;

/**
 *
 * @author User
 */
public class Sql {
    
    private static String getSelectedColumnAsString(List<String> columnList) {
        String sql = "";
        for(int i=0; i<columnList.size(); i++) {
            sql += columnList.get(i);
            
            if(!(columnList.size() - i == 1)) {
                sql += ",";
            }
        }  
        return sql;
    }
    
    /*
    * MAP PARAMS:
    * WHERE_COLUMN
    * WHERE_OPERATOR
    * WHERE_FILTER
    * WHERE_SEPARATOR
    */
    //ToDo: dodac  enuma  jako sstruct mapy dla where i to samo dla update  itp
    private static String getWhereArguments(List<Map<SqlWhereStruct, Object>> params) {
        String sql = "";
        for(int i=0; i<params.size(); i++) {
            sql += params.get(i).get(SqlWhereStruct.WHERE_COLUMN) + " ";
            sql += params.get(i).get(SqlWhereStruct.WHERE_OPERATOR) + " ";
            sql += "'" + params.get(i).get(SqlWhereStruct.WHERE_FILTER) + "' ";
            if(!(params.size() - i == 1)) {
                sql += params.get(i).get(SqlWhereStruct.WHERE_SEPARATOR) + " ";
            }
        }
        return sql;
    }
    
    public static Map<SqlWhereStruct, Object> getWhereMap(String whereColumn, String whereFilter, String whereOperator, String whereSeparator) {
        Map<SqlWhereStruct, Object> map = new HashMap();
        map.put(SqlWhereStruct.WHERE_COLUMN, whereColumn);
        map.put(SqlWhereStruct.WHERE_FILTER, whereFilter);
        map.put(SqlWhereStruct.WHERE_OPERATOR, whereOperator);
        map.put(SqlWhereStruct.WHERE_SEPARATOR, whereSeparator);
        return map;
    }
    
    public static String getSelectQuery(String table, String select, String where, String operator, String filter) {
        return "SELECT " + select + " FROM " + table + " WHERE " + where + " " + operator + " " + filter;
    }
    
    public static String getSelectAllQuery(String table) {
        return "SELECT * FROM " + table + ";";
    }

    public static String getSelectQuery(String itemCodeSearch, String itemNameSearch) {
        
        String sql = "SELECT KOD_TOWARU FROM towary WHERE";
        if(!itemCodeSearch.equals("")) {
            sql += " KOD_TOWARU like '%" + itemCodeSearch + "%'";  
            
            if(!itemNameSearch.equals("")) {
                sql += " AND";
            }
        }

        if(!itemNameSearch.equals("")) {
            sql += " NAZWA like '%" + itemNameSearch + "%'";    
        }
        return sql;
    }
        
    /**
     *
     * @param tableName
     * @param params
     * @return
     */
    public static String getSelectQuery(String tableName, TableStructInterface[] columnList, List<Map<SqlWhereStruct, Object>> params){
        List<String> columnListAsArray = new ArrayList();
        for(TableStructInterface column : columnList) {
            columnListAsArray.add(column.toString());
        }
        
        return Sql.getSelectQuery(tableName, columnListAsArray, params);
    }
    
    public static String getSelectQuery(String tableName, String selectedColumn, Map<SqlWhereStruct, Object> param){
        List<String> columnListAsArray = new ArrayList();
        columnListAsArray.add(selectedColumn);
        List<Map<SqlWhereStruct, Object>> params = new ArrayList();
        params.add(param);
        return Sql.getSelectQuery(tableName, columnListAsArray, params);
    }
    
    public static String getSelectQuery(String tableName, TableStructInterface[] columnList, Map<SqlWhereStruct, Object> param){
        List<Map<SqlWhereStruct, Object>> params = new ArrayList();
        params.add(param);
        return Sql.getSelectQuery(tableName, columnList, params, null);
    }
    
    /*
     * 3
     * MAP PARAMS:
     * WHERE_COLUMN
     * WHERE_OPERATOR
     * WHERE_FILTER
     */
    public static String getSelectQuery(String tableName, List<String> columnList, List<Map<SqlWhereStruct, Object>> params){
        return getSelectQuery(tableName, columnList, params, null);
    }    
    
    public static String getSelectQuery(String tableName, TableStructInterface[] columnList, List<Map<SqlWhereStruct, Object>> params, Map<SqlOrderStruct, Object> sortParam){
        List<String> columnListAsArray = new ArrayList();
        for(TableStructInterface column : columnList) {
            columnListAsArray.add(column.toString());
        }
        
        return getSelectQuery(tableName, columnListAsArray, params, sortParam);
    }
   
    public static String getSelectQuery(String tableName, List<String> columnList, List<Map<SqlWhereStruct, Object>> params, Map<SqlOrderStruct, Object> sortParam){
        String sql = "SELECT ";
        sql += Sql.getSelectedColumnAsString(columnList);
        sql += " FROM " + tableName;
        if(params.size() > 0) {
            sql += " WHERE ";
            sql += Sql.getWhereArguments(params);
        }
        if(sortParam != null) {
            sql += " ORDER BY " + sortParam.get(SqlOrderStruct.ORDER_COLUMN).toString() + " " + sortParam.get(SqlOrderStruct.ORDER_DIRECTION).toString();   
            sql += ";";    
        }

        Log.log("SQL: " + sql);
        
        return sql;
    }
    
    public static String getSelectQuery(String tableName, List<String> columnList, Map<SqlWhereStruct, Object> param){
        List<Map<SqlWhereStruct, Object>> params = new ArrayList();
        params.add(param);
        return Sql.getSelectQuery(tableName, columnList, params);
    }
    
    /* 
     * SQL: 1
     * @PARAMS:
     * tableName:
     * columns: columns from table
     * operator: EQUALS_OR_LIKE: = or like, AND_OR: AND or OR 
     * whereFilters: COLUMN: kolumna, FILTER: slowo kluczowe
     */    
    public static String getSelectQuery(String tableName, List<String> columns, List<Map<String, String>> operator, List<Map<String, String>> whereFilters) {
        String sql = "";
        
        sql += "SELECT ";
        for(int i=0; i<columns.size(); i++) {
            sql += columns.get(i);
            if(!(columns.size() - i == 1)) {
                sql += ", ";  
            } else {
                sql += " ";
            }
        }

        sql += "FROM " + tableName + " ";
        
        if(!whereFilters.isEmpty()) {
            sql += "WHERE ";   
            for(int i=0; i<whereFilters.size(); i++) {
                //where
                sql += whereFilters.get(i).get("COLUMN") + " ";
                //operator ( =, like)           
                sql += operator.get(i).get("EQUALS_OR_LIKE") + " '";

                sql += whereFilters.get(i).get("FILTER") + "' ";

                if(!(whereFilters.size() - i == 1)) {
                    sql += operator.get(i).get("AND_OR") + " ";
                } else {
                    sql += " ";
                }
            }
        }
        
        //System.out.println("Sql Generator: getSelectQuery 1 " + sql);    
        return sql;
    }
    
    public static String getSelectQuery(String tableName, TableStructInterface[] columnList) {
        List<String> selectList = new ArrayList();
        for(TableStructInterface outcome : columnList) {
            selectList.add(outcome.toString());
        }
        
        return Sql.getSelectQuery(tableName, selectList);
    }
    
    public static String getSelectQuery(String tableName, List<String> columnList) {
        String sql = "SELECT ";
           
        for(int i=0; i<columnList.size(); i++) {
            sql += columnList.get(i);
            
            if(!(columnList.size() - i == 1)) {
                sql += ",";
            }
        }
        
        sql += " FROM " + tableName + ";";
        //System.out.println("Sql Generator: " + sql);          
        return sql;
    }
    
    public static String getInsertQuery(String tableName, List<String> params, List<String> values) {
        String sql = "INSERT INTO " + tableName + " (";
        
        for(int i=0; i<params.size(); i++) {
            sql += "`" + params.get(i) + "`";
            
           if(!(params.size() - i == 1)) {
               sql += ",";
           }
        }
        
        sql += ") VALUES (";
        
        for(int i=0; i<values.size(); i++) {
            sql += "'" + values.get(i) + "'";
            
           if(!(values.size() - i == 1)) {
               sql += ",";
           }
        }
                
        sql += ");";
        
        //System.out.println("Sql Generator: getInsertQuery " + sql);  
        return sql;
    }

    public static String getInsertQuery(String tableName, Map<TableStructInterface, Object> values) {
        String sql = "INSERT INTO " + tableName + " ";
        String columnList = "";
        String valuesList = "";
        
        for(Iterator<Entry<TableStructInterface, Object>> it = values.entrySet().iterator(); it.hasNext();) {
            Entry<TableStructInterface, Object> entry = it.next();
            columnList += entry.getKey();
            valuesList += "'" + entry.getValue() + "'";
            if(it.hasNext()) {
                columnList += ",";
                valuesList += ",";
            }                
        }

        sql += "(" + columnList + ") VALUES (" + valuesList + ");";
        Log.log("Sql Generator: InsertQuery " + sql);  
        return sql;    
    }
    
    public static Map<SqlUpdateStruct, Object> getUpdateMap(String setColumn, String setValue, String whereColumn, String whereValue) {
        Map<SqlUpdateStruct, Object> map = new HashMap();
        map.put(SqlUpdateStruct.SET_COLUMN, setColumn);
        map.put(SqlUpdateStruct.SET_VALUE, setColumn);
        return map;
    } 
    
    public static Map<SqlUpdateStruct, Object> getUpdateMap(String setColumn, String setValue) {
        Map<SqlUpdateStruct, Object> map = new HashMap();
        map.put(SqlUpdateStruct.SET_COLUMN, setColumn);
        map.put(SqlUpdateStruct.SET_VALUE, setValue);
        return map;
    } 
  
    public static Map<SqlUpdateStruct, Object> getUpdateMap(Object setColumn, Object setValue) {
        Map<SqlUpdateStruct, Object> map = new HashMap();
        map.put(SqlUpdateStruct.SET_COLUMN, setColumn);
        map.put(SqlUpdateStruct.SET_VALUE, setValue);
        return map;
    } 
    
    //5
    public static String getUpdateQuery(String tableName, Map<SqlUpdateStruct, Object> params, Map<SqlWhereStruct, Object> whereParams) {
        String sql = "UPDATE " + tableName + " SET ";       

        sql += params.get(SqlUpdateStruct.SET_COLUMN) + " = " + params.get(SqlUpdateStruct.SET_VALUE);

        sql += " WHERE " + whereParams.get(SqlWhereStruct.WHERE_COLUMN) + " " + whereParams.get(SqlWhereStruct.WHERE_OPERATOR) + " " + whereParams.get(SqlWhereStruct.WHERE_FILTER) + ";";    

        //System.out.println("Sql Generator: getUpdateQuery5 " + sql);
   
        return sql;
    }
    
    //4
    public static String getUpdateQuery(String tableName, List<Map<SqlUpdateStruct, Object>> params, Map<SqlWhereStruct, Object> whereParams) {
        String sql = "UPDATE " + tableName + " SET ";       
        
        for(int i=0; i<params.size(); i++) {
            sql += params.get(i).get(SqlUpdateStruct.SET_COLUMN) + " = '" + params.get(i).get(SqlUpdateStruct.SET_VALUE)+ "'";
            if(!(params.size() - i == 1)) {
                sql += ", ";
            }
        }
        
        sql += " WHERE " + whereParams.get(SqlWhereStruct.WHERE_COLUMN) + " " + whereParams.get(SqlWhereStruct.WHERE_OPERATOR) + " '" + whereParams.get(SqlWhereStruct.WHERE_FILTER) + "';";    

        //System.out.println("Sql Generator: getUpdateQuery[4]: " + sql);
   
        return sql;
    }

    public static String getReplaceIntoQuery(String tableName, Map<TableStructInterface, Object> values) {
        String sql = "REPLACE INTO " + tableName + " ";
        String columnList = "";
        String valuesList = "";
        
        for(Iterator<Entry<TableStructInterface, Object>> it = values.entrySet().iterator(); it.hasNext();) {
            Entry<TableStructInterface, Object> entry = it.next();
            columnList += entry.getKey();
            valuesList += "'" + entry.getValue() + "'";
            if(it.hasNext()) {
                columnList += ",";
                valuesList += ",";
            }                
        }

        sql += "(" + columnList + ") VALUES (" + valuesList + ");";
        Log.log("Sql Generator: getReplaceInto " + sql);  
        return sql;  
    }

    public static String getDeleteQuery(String tableName, Map<SqlWhereStruct, Object> whereMap) {
        List<Map<SqlWhereStruct, Object>> params = new ArrayList();
        params.add(whereMap);
        
        String sql = "DELETE ";
        sql += " FROM " + tableName;
        sql += " WHERE ";
        sql += Sql.getWhereArguments(params);
        sql += ";";     
        return sql;    
    }

    public static String getLeftJoinQuery(String leftTableName, String rightTableName, TableStructInterface[] selectColumns, Map<SqlJoinConditionStruct, TableStructInterface> joinCondition, List<Map<SqlWhereStruct, Object>> params) {       
        List<String> columnListAsArray = new ArrayList();
        for(TableStructInterface column : selectColumns) {
            columnListAsArray.add(column.toStringWithTableName());
        }
        
        return getLeftJoinQuery(leftTableName, rightTableName, columnListAsArray, joinCondition, params);
    }
    
    //SELECT * FROM ewidencja_in ew LEFT JOIN towary ON ew.KOD_PRODUKTU = towary.KOD_TOWARU;
    public static String getLeftJoinQuery(String leftTableName, String rightTableName, List<String> selectColumns, Map<SqlJoinConditionStruct, TableStructInterface> joinCondition, List<Map<SqlWhereStruct, Object>> params) {
        String sql = "SELECT " + getSelectedColumnAsString(selectColumns) + 
                " FROM " + leftTableName + 
                " LEFT JOIN " + rightTableName + 
                " ON " + leftTableName + "." + joinCondition.get(SqlJoinConditionStruct.JOIN_LEFT).toString() + " = " + rightTableName + "." + joinCondition.get(SqlJoinConditionStruct.JOIN_RIGHT).toString() +
                " WHERE " + getWhereArguments(params) + ";";
        //System.out.println("Sql Generator: getLeftJoinQuery " + sql);
        return sql;
    }
    
    public static Map<SqlOrderStruct, Object> getOrderMap(TableStructInterface struct, String type) {
        Map<SqlOrderStruct, Object> map = new HashMap();
        
        map.put(SqlOrderStruct.ORDER_COLUMN, struct);
        map.put(SqlOrderStruct.ORDER_DIRECTION, type);
        
        return map;
    }
}
