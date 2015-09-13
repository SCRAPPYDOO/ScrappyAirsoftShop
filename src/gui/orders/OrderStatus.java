/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.orders;

/**
 *
 * @author SCRAPPYDOO
 */
public enum OrderStatus {
    ORDER_CREATED,
    ORDER_PREPERED,
    ORDER_CHANGED,
    ORDER_SENT,
    ORDER_CANCELED,
    ORDER_RETURNED,
    ORDER_REALIZED,
    ORDER_MONEY_RETURNED
    ;
    
    public static OrderStatus getPackageByName(Object name) {
        OrderStatus type;
        switch((String)name) {
            case "ORDER_CREATED": type = OrderStatus.ORDER_CREATED ; break;
            case "ORDER_PREPERED": type = OrderStatus.ORDER_PREPERED ; break;
            case "ORDER_CHANGED": type = OrderStatus.ORDER_CHANGED ; break;
            case "ORDER_SENT": type = OrderStatus.ORDER_SENT ; break;
            case "ORDER_CANCELED": type = OrderStatus.ORDER_CANCELED ; break;
            case "ORDER_RETURNED": type = OrderStatus.ORDER_RETURNED ; break;
            case "ORDER_REALIZED": type = OrderStatus.ORDER_REALIZED ; break;
            case "ORDER_MONEY_RETURNED": type = OrderStatus.ORDER_MONEY_RETURNED ; break;
            default: 
                throw new UnsupportedOperationException("PackageType getPackageByName: unsuported value: " + name); //To change body of generated methods, choose Tools | Templates.
        }
        return type;
    }
}
