/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreAdminRole;

import business.Inventory;
import business.InventoryItem;
import business.MasterInventoryDirectory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class InventoryReportJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private MasterInventoryDirectory masterInventoryDirectory;
    private Inventory inventory;
    private static int threshold =5;

    /**
     * Creates new form InventoryReportJPanel
     */
    public InventoryReportJPanel(JPanel userProcessContainer,MasterInventoryDirectory masterInventoryDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.masterInventoryDirectory = masterInventoryDirectory;
        DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
        
        for(Inventory inventory : masterInventoryDirectory.getInventoryList())
        {
            
             for(InventoryItem inventoryItem : inventory.getInventoryList())
             {
                 if(inventoryItem.getStock()<threshold)
                 {
                     int i=inventoryItem.getStock();
                     String s= report(i); 
                     Object row[] = new Object[3];
                     row[0] = inventoryItem;
                     row[1] = inventoryItem.getStock();
                     row[2] = s;
                     dtm.addRow(row);
                 }
                 
            
        }
            
            
        }
    }
    public String report(int i)
    {
        String overview = new String();
        if(i<threshold)
        {
            overview="Below Threshold";
        }
        else
        {
            overview="In Stock";
        }
        return overview;
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
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Threshold", "Report"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
