/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class CollisionSensorDirectory {
    private ArrayList<CollisionSensor> collisionSensorDir;
     public CollisionSensorDirectory()
     {
         collisionSensorDir = new ArrayList<>();
     }

    public ArrayList<CollisionSensor> getCollisionSensorDir() {
        return collisionSensorDir;
    }

    public void setCollisionSensorDir(ArrayList<CollisionSensor> collisionSensorDir) {
        this.collisionSensorDir = collisionSensorDir;
    }
    public CollisionSensor addCollisionSensor()
    {
        CollisionSensor s = new CollisionSensor();
        collisionSensorDir.add(s);
        return s;
    }
}
