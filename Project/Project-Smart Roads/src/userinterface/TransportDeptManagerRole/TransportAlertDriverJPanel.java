/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportDeptManagerRole;

import Email.EmailSender;
import business.Driver.Driver;
import business.Enterprise.Enterprise;
import business.Organisation.DriverOrganisation;
import business.Organisation.Organisation;
import static business.Organisation.Organisation.OrganisationType.DriverOrganisation;
import business.Organisation.TransportationOrganisation;
import business.Person.Person;
import business.UserAccount.UserAccount;
import business.WorkQueue.DriverApprovalWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.ConstructionDeptManagerRole.ConstructionDeptManagerJPanel;
import userinterface.WeatherDeptManagerRole.AlertDriverJPanel;
import userinterface.WeatherDeptManagerRole.WeatherDeptManagerJPanel;

/**
 *
 * @author aksha
 */
public class TransportAlertDriverJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private UserAccount userAccount;
private Enterprise enterprise;
    /**
     * Creates new form ManageDriverRequestJPanel
     */
    public TransportAlertDriverJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
    }
    /**
     * Creates new form AlertDriverJPanel
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backjButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        messagejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        voiceAlertjButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jButton1.setText("Alert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Direct Driver");

        backjButton2.setText("<<");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alert Driver By Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Alert Driver By Voice");

        voiceAlertjButton2.setText("Voice Alert");
        voiceAlertjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceAlertjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(69, 69, 69)
                                .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(voiceAlertjButton2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(messagejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(75, 75, 75)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(voiceAlertjButton2))
                .addGap(119, 119, 119)
                .addComponent(backjButton2)
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String message = messagejTextField1.getText();
        DriverApprovalWorkRequest request = new DriverApprovalWorkRequest(){};
        request.setMessageToDriver(message);

        Date date = new Date();
        request.setRequest(date);
        request.setSenderOfAlert(String.valueOf(userAccount));
        request.setReceiver(userAccount);
        Organisation org = null;

        for(Organisation organisation: enterprise.getOrganisationDir().getOrganisationList())
        if(organisation instanceof DriverOrganisation)
        {
            org = organisation;
            request.setSendTo(String.valueOf(org));
            break;
        }
        if(org!=null)
        {

            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            
        }
        
        for(Person p : org.getPersonDir().getPersonList())
            if(p instanceof Driver)
            {
                Driver d = (Driver)p;
                
                String[] to= {d.getEmail()};
                if(EmailSender.sendMail("javademo4@gmail.com", "javademo", message, to))
                JOptionPane.showMessageDialog(null,"Request Sent to Driver Department");
            }
        /*JOptionPane.showMessageDialog(null,"Recording Your Message");
        try{
            AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class,format);
            if(!AudioSystem.isLineSupported(info))
            {
                System.err.println("Line ");
            }
            final TargetDataLine targetLine = (TargetDataLine)AudioSystem.getLine(info);
            targetLine.open();
            System.out.println("Starting Record");
            targetLine.start();
            
            Thread thread = new Thread() 
            {
                @Override public void run()
                {
                    AudioInputStream audioStream = new AudioInputStream(targetLine);
                    File audioFile = new File("traffic.wav");
                    try {
                        AudioSystem.write(audioStream, AudioFileFormat.Type.WAVE, audioFile);
                    } catch (IOException ex) {
                        Logger.getLogger(AlertDriverJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Stopped Recording");
                }
            };
            thread.start();
            Thread.sleep(5000);
            targetLine.stop();
            targetLine.close();
            
            System.out.println("Ended Sound Test");
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }catch(LineUnavailableException lue){lue.printStackTrace();}
        
       
        // TODO add your handling code here:*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportationDeptManagerJPanel tdmjp = (TransportationDeptManagerJPanel) component;
        tdmjp.populateDriverTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backjButton2ActionPerformed

    private void voiceAlertjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceAlertjButton2ActionPerformed
    JOptionPane.showMessageDialog(null,"Recording Your Message");
        try{
            AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class,format);
            if(!AudioSystem.isLineSupported(info))
            {
                System.err.println("Line not Supported ");
            }
            final TargetDataLine targetLine = (TargetDataLine)AudioSystem.getLine(info);
            targetLine.open();
            System.out.println("Starting Record");
            targetLine.start();
            
            Thread thread = new Thread() 
            {
                @Override public void run()
                {
                    AudioInputStream audioStream = new AudioInputStream(targetLine);
                    File audioFile = new File("traffic.wav");
                    try {
                        AudioSystem.write(audioStream, AudioFileFormat.Type.WAVE, audioFile);
                    } catch (IOException ex) {
                        Logger.getLogger(AlertDriverJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Stopped Recording");
                }
            };
            thread.start();
            Thread.sleep(5000);
            targetLine.stop();
            targetLine.close();
            
            System.out.println("Ended Sound Test");
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }catch(LineUnavailableException lue){lue.printStackTrace();} // TODO add your handling code here:
    }//GEN-LAST:event_voiceAlertjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField messagejTextField1;
    private javax.swing.JButton voiceAlertjButton2;
    // End of variables declaration//GEN-END:variables
}