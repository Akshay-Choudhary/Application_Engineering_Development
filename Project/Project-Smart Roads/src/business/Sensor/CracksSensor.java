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
public class CracksSensor extends Sensor {
    Random rand = new Random();
    private float weight;
    private String crackSensorName;
    private int csHealth =rand.nextInt(30);
    private String csmessage;

    public String getCsmessage() {
        return csmessage;
    }

    public void setCsmessage(String csmessage) {
        this.csmessage = csmessage;
    }

    @Override
    public String toString() {
        return crackSensorName ;
    }

   
   

    public int getCsHealth() {
        return csHealth;
    }

    public void setCsHealth(int csHealth) {
        this.csHealth = csHealth;
    }
    
    public CracksSensor()
    {
        weight = 500;
        crackSensorName = "Sensor1";
    }

    public String getCrackSensorName() {
        return crackSensorName;
    }

    public void setCrackSensorName(String crackSensorName) {
        this.crackSensorName = crackSensorName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

   
}
