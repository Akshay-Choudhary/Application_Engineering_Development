/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Organisation.Organisation;
import business.Organisation.WeatherOrganisation;
import business.Sensor.Sensor;
import business.Sensor.WeatherSensor;
import business.UserAccount.UserAccount;
import com.sun.corba.se.impl.ior.WireObjectKeyTemplate;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.SensorsAdmin.WeatherSensorParamJPanel;

/**
 *
 * @author aksha
 */
public class WeatherSensorThread extends Thread {

    private UserAccount userAccount;
    private WeatherOrganisation weatherOrganisation;
    private WeatherSensorParamJPanel panel;
    private Organisation organisation;
    private WeatherSensor ws;

    public WeatherSensorThread(UserAccount userAccount, Organisation organisation, WeatherSensorParamJPanel panel, WeatherSensor ws) {
        this.userAccount = userAccount;
        this.organisation = organisation;
        this.panel = panel;
        this.ws = ws;
    }

    public void RandomTest1() throws InterruptedException {
        while (true) {
            int min = 5;
            int max = 500;
            int max2 = 100;

            float randomNumber1 = (min + (float) (Math.random() * ((max - min))));
            float randomNumber2 = (min + (float) (Math.random() * ((max2 - min))));
            float randomNumber3 = (min + (float) (Math.random() * ((max - min))));

            Thread.sleep(500);

            /*if (randomNumber1 >= ws.getAmtOfRainfall() || randomNumber2 <= ws.getTemperature() || randomNumber3 >= ws.getWindSpeed()) {
             ws.setAmtOfRainfall(randomNumber1);
             ws.setTemperature(randomNumber2);
             ws.setWindSpeed(randomNumber3);
             ws.setStatus("safe");
             } else if (randomNumber1 >= ws.getAmtOfRainfall()) {
             ws.setAmtOfRainfall(randomNumber1);
             ws.setTemperature(randomNumber2);
             ws.setWindSpeed(randomNumber3);
             ws.setStatus("Rainfall Alert");

             } else if (randomNumber2 <= ws.getTemperature()) {
             ws.setAmtOfRainfall(randomNumber1);
             ws.setTemperature(randomNumber2);
             ws.setWindSpeed(randomNumber3);
             ws.setStatus("Temperature Alert");
                

             } else if (randomNumber3 <= ws.getWindSpeed()) {
             ws.setAmtOfRainfall(randomNumber1);
             ws.setTemperature(randomNumber2);
             ws.setWindSpeed(randomNumber3);
             ws.setStatus("Storm Alert");
                

             }*/            if (randomNumber1 >= 400) {
                ws.setAmtOfRainfall(randomNumber1);
                ws.setTemperature(randomNumber2);
                ws.setWindSpeed(randomNumber3);
                ws.setStatus("Watery Road Ahead");
            } else if (randomNumber2 <= 250) {
                ws.setAmtOfRainfall(randomNumber1);
                ws.setTemperature(randomNumber2);
                ws.setWindSpeed(randomNumber3);
                ws.setStatus("Snow Alert");

            } else if (randomNumber3 >= 300) {
                ws.setAmtOfRainfall(randomNumber1);
                ws.setTemperature(randomNumber2);
                ws.setWindSpeed(randomNumber3);
                ws.setStatus("Storm Alert");
            } else {
                ws.setAmtOfRainfall(randomNumber1);
                ws.setTemperature(randomNumber2);
                ws.setWindSpeed(randomNumber3);
                ws.setStatus("Safe");
            }

            panel.populateTable();
        }

    //return randomNumber;
    }

    public void run() {

        try {
            RandomTest1();

        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherSensor.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
