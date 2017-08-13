/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

import java.util.Random;

/**
 *
 * @author aksha
 */
public class LiquidAndIcyRoadSensor extends Sensor {
    Random rand = new Random();
    private float temperature= rand.nextInt(50);
    private String name;
    private float moisture = rand.nextInt(30);
    private float amtOfRainfall = rand.nextInt(20);
    private float windSpeed = rand.nextInt(100);
    
    public enum LAISensorType{
        LiquidSensor1("LiquidSensor1"),LiquidSensor2("LiquidSensor2"),LiquidSensor3("LiquidSensor3");
        private String value;
        private LAISensorType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoisture() {
        return moisture;
    }

    public void setMoisture(float moisture) {
        this.moisture = moisture;
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


   
    
    
    
}
