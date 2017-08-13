/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Organisation.Organisation;
import business.Organisation.WeatherOrganisation;
import business.Sensor.CollisionSensor;
import business.Sensor.CracksSensor;
import business.Sensor.TrafficSensor;
import business.UserAccount.UserAccount;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.SensorsAdmin.CollisionSensorParamJPanel;
import userinterface.SensorsAdmin.CrackSensorParamJPanel;

/**
 *
 * @author aksha
 */
public class CollisionSensorThread extends Thread {
   private UserAccount userAccount;
   private WeatherOrganisation weatherOrganisation;
   private CollisionSensorParamJPanel panel;
   private Organisation organisation;
   private CollisionSensor collisionSensor;
   
   public CollisionSensorThread(UserAccount userAccount,Organisation organisation, CollisionSensorParamJPanel panel,CollisionSensor collisionSensor) {
       this.userAccount = userAccount;
       this.organisation =organisation;
       this.panel = panel;
       this.collisionSensor = collisionSensor;
   }
   public void RandomTest1() throws InterruptedException
   {
       while(true) {
           int min = 450;
           int max = 600;
           
           float randomNumber = (min + (float) (Math.random() * ((max - min))));
           
           Thread.sleep(500);
           
           
           if(randomNumber <=500)
           {
               collisionSensor.setImpact(randomNumber);
               collisionSensor.setStatus("safe");
               
           }else{
               collisionSensor.setImpact(randomNumber);
               collisionSensor.setStatus("Collision Ahead");
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
