/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminRole;

import business.Ecosystem;
import business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aksha
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Ecosystem system;

    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer,Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkTable();
    }

    public void populateNetworkTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)networkjTable1.getModel();
        dtm.setRowCount(0);
        for(Network network : system.getNetworkList())
        {
            Object[] row = new Object[2];
             row[0] = network;
             row[1] = network.getCityName();
             dtm.addRow(row);
        
        }
          
    }
    public void refreshTable(){
        int rowCount = networkjTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) networkjTable1.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
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

        jLabel1 = new javax.swing.JLabel();
        stateNamejTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkjTable1 = new javax.swing.JTable();
        addjButton1 = new javax.swing.JButton();
        deletejButton2 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cityNamejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("State");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 20));
        add(stateNamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Manage Networks");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, 20));

        networkjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State", "city"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 450, 130));

        addjButton1.setText("Add");
        addjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButton1ActionPerformed(evt);
            }
        });
        add(addjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });
        add(deletejButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        backjButton1.setText("<<");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));
        add(cityNamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("NetWork List");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButton1ActionPerformed
     
        
       String state = stateNamejTextField1.getText().trim();
       String city = cityNamejTextField1.getText().trim();
       Validation v = new Validation();
       if (state.trim().equals(" ") || city.trim().equals(" ")) {
           JOptionPane.showMessageDialog(null, "Please Enter the Blank Field", "Warning Message",
                   JOptionPane.ERROR_MESSAGE);
       } else if (!(v.onlyAlphabets(city) || v.onlyAlphabets(state))) {
           JOptionPane.showMessageDialog(null, "Please enter only alphabets", "Warning Message", 
                   JOptionPane.WARNING_MESSAGE);
       } else {
           if (!system.getNetworkList().isEmpty()) {
               for (Network network : system.getNetworkList()) {
                   if (network.getCityName().equalsIgnoreCase(city) || network.getStateName().equalsIgnoreCase(state)) {
                       JOptionPane.showMessageDialog(null, "Network already exists", "Error Message", 
                               JOptionPane.WARNING_MESSAGE);
                       break;
                   } 
                   else {
                       Network n = system.createAndAddNetwork();
                       n.setStateName(state);
                       n.setCityName(city);
                       JOptionPane.showMessageDialog(null, "Network has been created sucessfully!",
                               "Success", JOptionPane.PLAIN_MESSAGE);
                       break;
                   }
               }
           } else {
               Network n = system.createAndAddNetwork();
               n.setStateName(state);
               n.setCityName(city);
               JOptionPane.showMessageDialog(null, "Network has been created sucessfully!", "Success", JOptionPane.PLAIN_MESSAGE);
           }
           populateNetworkTable();
       }
   }


public class Validation {
   
   String regex = "[a-zA-Z]+";
   String username = "^[a-z0-9_-]{3,15}$";
   public boolean onlyAlphabets(String s)
   {
       if(s.matches(regex))
       {
           return true;
       }
       return false;
   }
   public boolean checkUsername(String s)
   {
       if(s.matches(username))
           {
           return true;
       }
       return false;
   }
        
        /*Network network = system.createAndAddNetwork();
        network.setStateName(networkName);
        network.setCityName(networkName);
        populateNetworkTable();*/
    }//GEN-LAST:event_addjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
 int selectedRow=networkjTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogResult=JOptionPane.showConfirmDialog(null, "Please confirm whether to delete","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            if(dialogResult==JOptionPane.YES_OPTION);
            {
                Network net=(Network)networkjTable1.getValueAt(selectedRow,0);
                system.removeNetwork(net);
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select account to delete", "delete account", JOptionPane.INFORMATION_MESSAGE);
        }
        
        refreshTable();        // TODO add your handling code here:
    }//GEN-LAST:event_deletejButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton1;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField cityNamejTextField1;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkjTable1;
    private javax.swing.JTextField stateNamejTextField1;
    // End of variables declaration//GEN-END:variables
}