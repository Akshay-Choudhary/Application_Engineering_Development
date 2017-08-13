/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnterpriseAdminRole;

import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.Person.Person;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class ManageUserJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private Enterprise enterprise;
    /**
     * Creates new form MangeUserJPanel
     */
    public ManageUserJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        popOrganizationComboBox();
       
        popData();
    }
     public void popOrganizationComboBox() {
        organisationJComboBox.removeAllItems();

        for (Organisation organisation : enterprise.getOrganisationDir().getOrganisationList()) {
            organisationJComboBox.addItem(organisation);
        }
    }
    
    public void populateEmployeeComboBox(Organisation organisation){
        personJComboBox.removeAllItems();
        
        for (Person person : organisation.getPersonDir().getPersonList()){
            personJComboBox.addItem(person);
        }
    }
    
    private void populateRoleComboBox(Organisation organisation){
        roleJComboBox.removeAllItems();
        for (Role role : organisation.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }
     public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organisation organization : enterprise.getOrganisationDir().getOrganisationList()) {
            for (UserAccount ua : organization.getUserAccountDir().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
               
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        organisationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 100));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 120, -1));

        jLabel3.setText("Person");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        personJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(personJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        jLabel5.setText("Organisation");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        organisationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organisationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organisationJComboBoxActionPerformed(evt);
            }
        });
        add(organisationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 120, -1));

        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, -1));

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organisation organisation = (Organisation) organisationJComboBox.getSelectedItem();
        Person person = (Person) personJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        organisation.getUserAccountDir().createUserAccount(userName, password, person, role);

        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organisationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organisationJComboBoxActionPerformed
        Organisation organisation = (Organisation) organisationJComboBox.getSelectedItem();
        if (organisation != null){
            populateEmployeeComboBox(organisation);
            populateRoleComboBox(organisation);
        }
    }//GEN-LAST:event_organisationJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
userProcessContainer.remove(this);
CardLayout layout =(CardLayout)userProcessContainer.getLayout();
layout.previous(userProcessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organisationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox personJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}