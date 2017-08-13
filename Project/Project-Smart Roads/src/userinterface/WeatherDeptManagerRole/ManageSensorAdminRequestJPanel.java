/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WeatherDeptManagerRole;

import business.Enterprise.Enterprise;
import business.Organisation.DriverOrganisation;
import business.Organisation.Organisation;
import business.Organisation.WeatherOrganisation;
import business.UserAccount.UserAccount;
import business.WorkQueue.DriverApprovalWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class ManageSensorAdminRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WeatherOrganisation weatherOrganisation;
    private Enterprise enterprise;
    

    /**
     * Creates new form WeatherDeptManagerJPanel
     */
    public ManageSensorAdminRequestJPanel(JPanel userProcessContainer,UserAccount userAccount,Organisation organisation,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.weatherOrganisation = (WeatherOrganisation)organisation;
        
        this.enterprise = enterprise;
        populateTable();
        populateDriverTable();
       
    }
    public void populateDriverTable()
    {
        
        DefaultTableModel model = (DefaultTableModel)driveralertjTable1.getModel();
        model.setRowCount(0);
        Organisation org = null;
        for(Organisation organisation : enterprise.getOrganisationDir().getOrganisationList())
            if(organisation instanceof DriverOrganisation)
            {
                org = organisation;
                break;
            }
        for(WorkRequest request: org.getWorkQueue().getWorkRequestList())
        {
            
            {
                DriverApprovalWorkRequest r=(DriverApprovalWorkRequest)request;
                Object[] row = new Object[4];
                row[0] = r;
                row[1] = r.getSendTo();
                row[2] = r.getRequestDate();
                row[3] = r.getResolveDate();
                model.addRow(row);
            }
            
        }
    }
    
        
        /*request.setStatus("Waiting for Acknowledgement");
            request.setDriverAcknowledgement("Pending");*/
    
    public void populateTable()
    {
         DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : weatherOrganisation.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new  Object[6];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getStatus();
            row[3] = request.getRequestDate();
            row[4] = request.getResolveDate();
            row[5] = request.getDriverAcknowledgement();
            
            model.addRow(row);
            
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

        checkbox1 = new java.awt.Checkbox();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button2 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        alertJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        driveralertjTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton1.setText("Manage Sensors");

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        button2.setLabel("button2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Weather Department Work Area");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Status", "Requested Date", "Sensor Acknowledeged Time", "Driver Acknowledged"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        assignJButton.setText("Acknowledge Sensor Admin");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        alertJButton.setText("Alert Driver");
        alertJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertJButtonActionPerformed(evt);
            }
        });

        driveralertjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Send To", "Requested Time ", "Resolved Date"
            }
        ));
        jScrollPane2.setViewportView(driveralertjTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Driver Alert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(269, 269, 269)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(208, 208, 208)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(assignJButton)
                            .addGap(347, 347, 347)
                            .addComponent(alertJButton))))
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertJButton)
                    .addComponent(assignJButton))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please Select a Row" );
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("completed");
        Date date = new Date();
        request.setResolveDate(date);
        JOptionPane.showMessageDialog(null,"Sensor Admin Acknowledged");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void alertJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please Select a Row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow,0);
        request.setDriverAcknowledgement("Pending");
        JOptionPane.showMessageDialog(null,"Driver Alerted" );
        populateTable();
        AlertDriverJPanel adjp = new AlertDriverJPanel(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("AlertDriverWorkArea",adjp);
        CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        

    }//GEN-LAST:event_alertJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alertJButton;
    private javax.swing.JButton assignJButton;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTable driveralertjTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
