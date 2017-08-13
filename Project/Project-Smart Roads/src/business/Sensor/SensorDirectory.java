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
public class SensorDirectory {
    private ArrayList<Sensor> sensorList;
    public SensorDirectory()
    {
        sensorList = new ArrayList<>();
        sensorList.add(new WeatherSensor());
        sensorList.add(new TrafficSensor());
        sensorList.add(new CracksSensor());
        sensorList.add(new CollisionSensor());
    }
    

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(ArrayList<Sensor> sensorList) {
        this.sensorList = sensorList;
    }
    public Sensor addSensor()
    {
        Sensor s = new Sensor(){};
        sensorList.add(s);
        return s;
    }
}
