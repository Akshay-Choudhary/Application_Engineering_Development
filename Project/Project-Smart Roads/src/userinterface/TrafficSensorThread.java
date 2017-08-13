/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Organisation.Organisation;
import business.Organisation.WeatherOrganisation;
import business.Sensor.TrafficSensor;
import business.UserAccount.UserAccount;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.SensorsAdmin.TrafficSensorParamJPanel;

/**
 *
 * @author aksha
 */
public class TrafficSensorThread extends Thread {

    private UserAccount userAccount;
    private WeatherOrganisation weatherOrganisation;
    private TrafficSensorParamJPanel panel;
    private Organisation organisation;
    private TrafficSensor ts;
    public float sum = 0;

    public TrafficSensorThread(UserAccount userAccount, Organisation organisation, TrafficSensorParamJPanel panel, TrafficSensor ts) {
        this.userAccount = userAccount;
        this.organisation = organisation;
        this.panel = panel;
        this.ts = ts;
    }

    public void RandomTest1() throws InterruptedException {
        while (true) {
            int min = 50;
            int max = 100;
            int count = 0;
            float sum = 0;

            float randomNumber;
            for (int i = 0; i < 4; i++) {
                randomNumber = (min + (float) (Math.random() * ((max - min))));
                System.out.println(randomNumber);
                ts.setSpeed(randomNumber);
                panel.populate();
                sum = sum + randomNumber;
            }
            float avg = sum / 4;
           
              if (avg <= 70) {
                ts.setStatus("NO Traffic");
                
            } else {

                ts.setStatus("Traffic Ahead");
                
            }
               panel.populateStatus();

            Thread.sleep(50000);

          
           

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
