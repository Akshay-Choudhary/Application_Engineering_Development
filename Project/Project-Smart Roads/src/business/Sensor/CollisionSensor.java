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
public class CollisionSensor extends Sensor {
    Random rand = new Random();
    private int ID;
    private static int count = 0;
    private String collisionSensorName;
    private float impact;
    private int collisionSensorHealth = rand.nextInt(10);
    private String collisionSensorMessage;

    public int getCollisionSensorHealth() {
        return collisionSensorHealth;
    }

    public void setCollisionSensorHealth(int collisionSensorHealth) {
        this.collisionSensorHealth = collisionSensorHealth;
    }

    public String getCollisionSensorMessage() {
        return collisionSensorMessage;
    }

    public void setCollisionSensorMessage(String collisionSensorMessage) {
        this.collisionSensorMessage = collisionSensorMessage;
    }
    
    public CollisionSensor()
    {
        
        count ++;
        ID = count;
        collisionSensorName = "CollisionSensor1";
    }

    public String getCollisionSensorName() {
        return collisionSensorName;
    }

    public void setCollisionSensorName(String collisionSensorName) {
        this.collisionSensorName = collisionSensorName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getImpact() {
        return impact;
    }

    public void setImpact(float impact) {
        this.impact = impact;
    }

    @Override
    public String toString() {
        return collisionSensorName;
    }
    
}
