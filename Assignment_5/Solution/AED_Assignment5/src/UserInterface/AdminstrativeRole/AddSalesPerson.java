/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole;

import Business.SalesPerson;
import Business.SalesPersonDirectory;
import Business.Utils.MyIntegerVerifier;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kedarvdm
 */
public class AddSalesPerson extends javax.swing.JPanel {

    /**
     * Creates new form AddCustomer
     */
    private JPanel userProcessContainer;
    private SalesPersonDirectory salesPersonDirectory;
    public AddSalesPerson(JPanel userProcessContainer,SalesPersonDirectory salesPersonDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.salesPersonDirectory=salesPersonDirectory;
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        salesPersonNameJTextField.setInputVerifier(myStringVerifier);
        MyIntegerVerifier myIntegerVerifier= new MyIntegerVerifier();
        floorCommissionJTextField.setInputVerifier(myIntegerVerifier);
        ceilingCommissionJTextField.setInputVerifier(myIntegerVerifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        floorCommissionJTextField = new javax.swing.JTextField();
        salesPersonNameJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salesPersonIDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ceilingCommissionJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addSalesPersonJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel10.setText("Ceiling Commission");

        salesPersonIDJTextField.setEnabled(false);

        jLabel2.setText("Name");

        jLabel1.setText("Sales Person ID");

        jLabel8.setText("Floor Commission");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addSalesPersonJButton.setText("Add Sales Person");
        addSalesPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesPersonJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Sales Person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(salesPersonIDJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(salesPersonNameJTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(backJButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addSalesPersonJButton)
                                    .addComponent(ceilingCommissionJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(floorCommissionJTextField))))
                        .addGap(0, 161, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(salesPersonIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salesPersonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(floorCommissionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ceilingCommissionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addSalesPersonJButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSalesPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesPersonJButtonActionPerformed
        // TODO add your handling code here:
        if(salesPersonNameJTextField.getText().trim().length()==0 || floorCommissionJTextField.getText().trim().length()==0 || ceilingCommissionJTextField.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int floorCommission= Integer.parseInt(floorCommissionJTextField.getText());
        int ceilingCommission= Integer.parseInt(ceilingCommissionJTextField.getText());
        
        if(floorCommission>= ceilingCommission)
        {
            JOptionPane.showMessageDialog(this, "Floor cannot be greater than equal to Ceiling commission","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        SalesPerson salesPerson= salesPersonDirectory.addSalesPerson();
        salesPerson.setSalesPersonName(salesPersonNameJTextField.getText());
        salesPerson.setFloorCommission(floorCommission);
        salesPerson.setCeilCommission(ceilingCommission);
        JOptionPane.showMessageDialog(this, "Sales person created", "Information", JOptionPane.INFORMATION_MESSAGE);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_addSalesPersonJButtonActionPerformed

   
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSalesPersonJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField ceilingCommissionJTextField;
    private javax.swing.JTextField floorCommissionJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField salesPersonIDJTextField;
    private javax.swing.JTextField salesPersonNameJTextField;
    // End of variables declaration//GEN-END:variables
}
