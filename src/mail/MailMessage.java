/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import gui.orders.OrderStatus;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author SCRAPPYDOO
 */
public class MailMessage {

    private String subject = "";
    private String toEmail = "";
    private String fromName = "SCRAPPY AIRSOFT SHOP";
    private String orderId;
    private String message = "";
    private List<Map<String, String>> itemsList;
    private OrderStatus orderState;
    private String trackingId;

    public void setToEmail(String email) {
        this.toEmail = email;
        
        toEmail = "scrappy.airsoft.shop@gmail.com";
    }
    
    public String getToEmail() {
        return toEmail;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }
    
    public String getFromName() {
        return fromName;
    }

    public void setMailType(OrderStatus orderStateObject) {
        this.orderState = orderStateObject;     
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getMessage() {
        message += getSubject() + "\n \n";
        message += "Zamówione towary: \n";
        message += getItemsTable() + "\n \n";
        
        switch(orderState) {
            case ORDER_CREATED: 
                message += "Wyślemy powiadomienie gdy tylko paczka zostanie przygotowana do wysłania.\n";
                break;
            case ORDER_PREPERED: 

                break;
            case ORDER_CHANGED: 

                break;
            case ORDER_SENT: 
                message += "Tracking ID: " + trackingId + "\n";
                break;
            case ORDER_CANCELED: 

                break;
            case ORDER_RETURNED: 

                break;
            case ORDER_REALIZED:                 

                break;
            case ORDER_MONEY_RETURNED: 

                break;
            default: 

                break;
        }
                
        message += "\nPozdrawiam \nMarcin Makowski \nSCRPPY AIRSOFT SHOP \nscrappy.airsoft.shop@gmail.com \nPhone: 798262118";    
        return message;
    }

    public String getSubject() {
        switch(orderState) {
            case ORDER_CREATED: 
                subject = "Dziękujemy za złożenie zamówienia";
                break;
            case ORDER_PREPERED: 
                subject = "Zamówienie nr " + orderId + " zostało przygotowane do wysłania";
                break;
            case ORDER_CHANGED: 
                subject = "Dokonano zmiany w zamówieniu nr " + orderId;
                break;
            case ORDER_SENT: 
                subject = "Zamówienie nr " + orderId + " zostało wysłane";
                break;
            case ORDER_CANCELED: 
                subject = "Zamówienie nr " + orderId + " zostało anulowane";
                break;
            case ORDER_RETURNED: 
                subject = "Zamówienie nr " + orderId + " zostało zwrócone";
                break;
            case ORDER_REALIZED:                 
                subject = "Zamówienie nr " + orderId + " zostało zrealizowane";
                break;
            case ORDER_MONEY_RETURNED: 
                subject = "Wpłata do zamówienia nr " + orderId + "została zwrócona";
                break;
            default: 
                subject = "WIADOMOSC_TESTOWA";
                break;
        }
        return subject;
    }
    
    public void setItemTable(List<Map<String, String>> itemsList) {
        this.itemsList = itemsList;
    }
    
    private String getItemsTable() {
        String items = "";
        for(Map<String, String> item : itemsList) {
            for(Entry<String, String> entry : item.entrySet()) {
                items += entry.getKey() + ": " + entry.getValue() + " ";
            }
            items += "\n";
        }
        return items; 
    }

    public void setTrackingId(String trackingIdNumber) {
        this.trackingId = trackingIdNumber;
    }
}
