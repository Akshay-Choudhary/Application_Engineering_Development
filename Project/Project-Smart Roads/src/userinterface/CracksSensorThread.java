/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Organisation.Organisation;
import business.Organisation.WeatherOrganisation;
import business.Sensor.CracksSensor;
import business.Sensor.TrafficSensor;
import business.UserAccount.UserAccount;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.SensorsAdmin.CrackSensorParamJPanel;
import userinterface.SensorsAdmin.TrafficSensorParamJPanel;

/**
 *
 * @author aksha
 */
public class CracksSensorThread extends Thread {
   private UserAccount userAccount;
   private WeatherOrganisation weatherOrganisation;
   private CrackSensorParamJPanel panel;
   private Organisation organisation;
   private CracksSensor cs;
   
   public CracksSensorThread(UserAccount userAccount,Organisation organisation, CrackSensorParamJPanel panel,CracksSensor cs) {
       this.userAccount = userAccount;
       this.organisation =organisation;
       this.panel = panel;
       this.cs = cs;
   }
   public void RandomTest1() throws InterruptedException
   {
       while(true) {
           int min = 450;
           int max = 600;
           
           float randomNumber = (min + (float) (Math.random() * ((max - min))));
           Thread.sleep(500);
           
           
           if(randomNumber >= 550)
           {
               cs.setWeight(randomNumber);
               cs.setStatus("Crack Alert");
           }else{
               cs.setWeight(randomNumber);
               cs.setStatus("Safe");
           }
           panel.populateTable();
       }
   }

  public void run() {

       try {
           RandomTest1();
       } catch (InterruptedException ex) {
           Logger.getLogger(TrafficSensor.class.getName()).log(Level.SEVERE, null, ex);
       }
   }  
}
