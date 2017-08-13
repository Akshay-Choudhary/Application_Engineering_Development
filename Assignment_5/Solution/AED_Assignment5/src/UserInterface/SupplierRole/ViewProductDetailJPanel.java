package UserInterface.SupplierRole;

import Business.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kedarvdm
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        productNameField.setText(p.getProdName());
        idField.setText(String.valueOf(p.getModelNumber()));
        targetPriceJTextField.setText(String.valueOf(p.getPrice()));
        floorPriceJTextField.setText(String.valueOf(p.getFloorPrice()));
        ceilingPriceJTextField.setText(String.valueOf(p.getCeiligPrice()));
        availabilityField.setText(String.valueOf(p.getAvailability()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        targetPriceJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availabilityField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        floorPriceJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ceilingPriceJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Target Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, 30));

        targetPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(targetPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 30));

        productNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(productNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Avail:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 30));

        availabilityField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availabilityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Floor Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, 30));

        floorPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(floorPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Ceiling Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, 30));

        ceilingPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(ceilingPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        productNameField.setEditable(true);
        floorPriceJTextField.setEditable(true);
        targetPriceJTextField.setEditable(true);
        ceilingPriceJTextField.setEditable(true);
        availabilityField.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(productNameField.getText().trim().length()==0 
                || availabilityField.getText().trim().length()==0 
                || targetPriceJTextField.getText().trim().length()==0 
                || ceilingPriceJTextField.getText().trim().length()==0 
                || floorPriceJTextField.getText().trim().length()==0 )
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int avail = Integer.parseInt(availabilityField.getText());
        Double targetPrice= Double.parseDouble(targetPriceJTextField.getText());
        Double ceilingPrice= Double.parseDouble(ceilingPriceJTextField.getText());
        Double floorPrice= Double.parseDouble(floorPriceJTextField.getText());
        
        if(ceilingPrice<targetPrice)
        {
            JOptionPane.showMessageDialog(this,"Ceiling price cannot be less than Target Price", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(floorPrice>targetPrice)
        {
            JOptionPane.showMessageDialog(this,"Floor price cannot be greater than Target Price", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        product.setPrice(targetPrice);
        product.setFloorPrice(floorPrice);
        product.setCeiligPrice(ceilingPrice);
        product.setProdName(productNameField.getText());
        product.setAvailability(avail);
        
        productNameField.setEditable(false);
        floorPriceJTextField.setEditable(false);
        targetPriceJTextField.setEditable(false);
        ceilingPriceJTextField.setEditable(false);
        availabilityField.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField ceilingPriceJTextField;
    private javax.swing.JTextField floorPriceJTextField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField targetPriceJTextField;
    // End of variables declaration//GEN-END:variables
}
