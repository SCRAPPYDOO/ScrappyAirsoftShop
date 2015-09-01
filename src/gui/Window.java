/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Map;

/**
 *
 * @author User
 */
public interface Window {
    public void setWindowState(boolean enabled);
    
    public void setResult();
    public void setResult(Object singleResult);
    public void setResult(Map<Object, String> resultMap);
    
    /*
     * Action when child window  is closed
     * Need to be triggered by child
     */
    public void doAction(String action);
}
