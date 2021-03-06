/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SensorsAdmin;

import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.Organisation.SensorsOrganisation;
import business.Organisation.TransportationOrganisation;
import business.Sensor.WeatherSensor;
import business.Sensor.TrafficSensor;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.TrafficSensorThread;

/**
 *
 * @author aksha
 */
public class TrafficSensorParamJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
 private UserAccount userAccount;
 private SensorsOrganisation sensorsOrganisation;
 private Enterprise enterprise;
 private TrafficSensor ts;
 private float sum = 0;
 
    /**
     * Creates new form TrafficSensorParamJPanel
     */
    public TrafficSensorParamJPanel(JPanel userProcessContainer,UserAccount userAccount,Organisation organisation,Enterprise enterprise,TrafficSensor ts) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.sensorsOrganisation = (SensorsOrganisation)organisation;
        this.enterprise = enterprise;
        this.ts = ts;
        TrafficSensorThread tst = new TrafficSensorThread(userAccount, organisation, this,ts);
        tst.start();
        
       
    }
    public void populate()
    {
        
        { DefaultTableModel model = (DefaultTableModel)temperatureparamjTable3.getModel();
        
        Object[] row = new Object[3];
        row[0] = ts;
        row[1] = ts.getSpeed();
        row[2] = ts.getStatus();
        
        model.addRow(row);
        }
       
    }
    public void populateStatus()
    {
        statusjTextField3.setText(ts.getStatus());
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewActionsjButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        temperatureparamjTable3 = new javax.swing.JTable();
        actionjButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        statusjTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        viewActionsjButton7.setText("View Actions");
        viewActionsjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionsjButton7ActionPerformed(evt);
            }
        });

        temperatureparamjTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sensor", "Speed"
            }
        ));
        jScrollPane4.setViewportView(temperatureparamjTable3);

        actionjButton8.setText("Action");
        actionjButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionjButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Avg Speed");

        jTextField1.setText("70 MPH");
        jTextField1.setEnabled(false);

        backjButton1.setText("<<");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Road Name");

        jTextField2.setText("I-90 Highway");
        jTextField2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Traffic Sensor Parameters");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actionjButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton1)
                    .addComponent(actionjButton8))
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionsjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionsjButton7ActionPerformed
        SensorAdminWorkRequestJPanel sawjp = new SensorAdminWorkRequestJPanel(userProcessContainer,userAccount,sensorsOrganisation, enterprise);
        userProcessContainer.add("SensorDetails",sawjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewActionsjButton7ActionPerformed

    private void actionjButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionjButton8ActionPerformed
         int selectedRow = temperatureparamjTable3.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Sensor ");

        } else {
        TrafficSensor ts = (TrafficSensor)temperatureparamjTable3.getValueAt(selectedRow,0);
        
        final JFrame dialog = new JFrame();
        dialog.pack();
        String message = JOptionPane.showInputDialog(dialog,"Type message to be sent to Traffic Manager",null);
         if(message.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter The Message To Be Sent");
            
        }
        else
        {
        WorkRequest request = new WorkRequest();
        request.setMessage(message);
       
        request.setStatus("Sent");
        request.setDriverAcknowledgement("Pending");

        Organisation org = null;
        for(Organisation organisation: enterprise.getOrganisationDir().getOrganisationList())
        if(organisation instanceof TransportationOrganisation)
        {
            org = organisation;
            request.setOrganisation(organisation);
            break;
        }
        if(org!=null)
        {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null,"Request Sent to Transport Department Admin");
        
        /*int selectedRow = weatherparamjTable3.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please Select a Row");
            return;
        }

        WorkRequest request = (WorkRequest)weatherparamjTable3.getValueAt(selectedRow, 0);*/
        }  
        }
    }//GEN-LAST:event_actionjButton8ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  // TODO add your handling code here:
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionjButton8;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField statusjTextField3;
    private javax.swing.JTable temperatureparamjTable3;
    private javax.swing.JButton viewActionsjButton7;
    // End of variables declaration//GEN-END:variables
}
