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
public class TrafficSensor extends Sensor {
    Random rand = new Random();
    private float speed;
    private String tsName;
    private int tshealth =rand.nextInt(40);
    private String tsMessage;

    public int getTshealth() {
        return tshealth;
    }

    public void setTshealth(int tshealth) {
        this.tshealth = tshealth;
    }

    public String getTsMessage() {
        return tsMessage;
    }

    public void setTsMessage(String tsMessage) {
        this.tsMessage = tsMessage;
    }

    
    private static int count = 0;
    
    public TrafficSensor()
    {
       
        count++;
        tsName = "Sensor1";
    }

    public String getTsName() {
        return tsName;
    }

    public void setTsName(String tsName) {
        this.tsName = tsName;
    }

   

   

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return tsName;
    }
    
}
