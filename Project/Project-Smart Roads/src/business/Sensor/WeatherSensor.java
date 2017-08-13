/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aksha
 */
public class WeatherSensor extends Sensor {
    
    private String wsName = "Sensor1";
    private float temperature ;
    private float amtOfRainfall;
    private float windSpeed ;
    int min = 10;
    int max= 50;
    private int wsHealth = (min + (int) (Math.random()*((max)-(min))));
    private String wsMessage;

    public WeatherSensor()
    {
        
        amtOfRainfall = 400;
        temperature = 250;
        windSpeed = 300;
        
    }

    public int getWsHealth() {
        return wsHealth;
    }

    public void setWsHealth(int wsHealth) {
        this.wsHealth = wsHealth;
    }

    

    public String getWsMessage() {
        return wsMessage;
    }

    public void setWsMessage(String wsMessage) {
        this.wsMessage = wsMessage;
    }
   

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }
   

    public float getAmtOfRainfall() {
        return amtOfRainfall;
    }

    public void setAmtOfRainfall(float amtOfRainfall) {
        this.amtOfRainfall = amtOfRainfall;
    }

 

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return wsName;
    }


   
    
    
    
}
