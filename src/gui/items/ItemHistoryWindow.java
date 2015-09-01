/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.items;

import gui.Window;
import javax.swing.table.DefaultTableModel;
import sqlconnector.Sql;
import sqlconnector.SqlConnector;

/**
 *
 * @author User
 */
public class ItemHistoryWindow extends javax.swing.JInternalFrame {

    private Window parent;
    private ItemHistoryWindow() {
        super("ITEMS", true,true,true,true);
        initComponents();
    }
    
    public ItemHistoryWindow(Window parent, String itemCode) {
        super("ITEMS", true,true,true,true);
        this.parent = parent;
        initComponents();
        this.setVisible(true);
        this.show();
        refreshTable(itemCode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        itemsInTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsOutTable = new javax.swing.JTable();
        itemsTakingAmount = new javax.swing.JButton();
        valueField = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        itemsInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(itemsInTable);

        itemsOutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(itemsOutTable);

        itemsTakingAmount.setText("INWENTARYZACJA");
        itemsTakingAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsTakingAmountActionPerformed(evt);
            }
        });

        valueField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(itemsTakingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsTakingAmount)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        parent.setWindowState(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void itemsTakingAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsTakingAmountActionPerformed
        int selectedItem = itemsInTable.getSelectedRow();
        String value = valueField.getText();
        if(selectedItem > -1) {
            String itemId = ""+itemsInTable.getValueAt(selectedItem, itemsInTable.getColumn(ItemsInStruct.ITEM_ID.toString()).getModelIndex());
            String update = Sql.getUpdateQuery(ItemsInStruct.getTableName(), Sql.getUpdateMap(ItemsInStruct.ITEM_STOCK_TAKING_AMOUNT.toString(), ItemsInStruct.ITEM_STOCK_TAKING_AMOUNT.toString() + " + " + value ), Sql.getWhereMap(ItemsInStruct.ITEM_ID.toString(), itemId, "=", ""));
            SqlConnector.doUpdateQuery(update);
        }
    }//GEN-LAST:event_itemsTakingAmountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable itemsInTable;
    private javax.swing.JTable itemsOutTable;
    private javax.swing.JButton itemsTakingAmount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField valueField;
    // End of variables declaration//GEN-END:variables

    private void refreshTable(String itemCode) {
        DefaultTableModel model = new DefaultTableModel(null, ItemsOutStruct.getValuesAsString());
        String query = Sql.getSelectQuery(ItemsOutStruct.getTableName(), ItemsOutStruct.values(), Sql.getWhereMap(ItemsOutStruct.KOD_PRODUKTU.toString(), itemCode, "=", ""));
        SqlConnector.doSelectQuery(query, ItemsOutStruct.values(), model);            
        itemsOutTable.setModel(model);
        itemsOutTable.repaint();
        
        model = new DefaultTableModel(null, ItemsInStruct.getValuesAsString());
        query = Sql.getSelectQuery(ItemsInStruct.getTableName(), ItemsInStruct.values(), Sql.getWhereMap(ItemsInStruct.ITEM_CODE.toString(), itemCode, "=", ""));
        SqlConnector.doSelectQuery(query, ItemsInStruct.values(), model);        
        itemsInTable.setModel(model);
        itemsInTable.repaint();
    }
}