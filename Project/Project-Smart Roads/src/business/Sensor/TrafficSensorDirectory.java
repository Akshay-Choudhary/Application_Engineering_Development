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
public class TrafficSensorDirectory {
    private ArrayList<TrafficSensor> trafficSensorList;
    
    public TrafficSensorDirectory()
    {
        trafficSensorList = new ArrayList<>();
    }

    public ArrayList<TrafficSensor> getTrafficSensorList() {
        return trafficSensorList;
    }

    public void setTrafficSensorList(ArrayList<TrafficSensor> trafficSensorList) {
        this.trafficSensorList = trafficSensorList;
    } public TrafficSensor addTrafficSensor()
    {
        TrafficSensor ts = new TrafficSensor();
        trafficSensorList.add(ts);
        return ts;
    }
}
