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
public class WeatherSensorDirectory {
    private ArrayList<WeatherSensor> weatherSensorList;
    public WeatherSensorDirectory ()
    {
        weatherSensorList = new ArrayList<>();
        WeatherSensor s1 = new WeatherSensor();
        WeatherSensor s2 = new WeatherSensor();
        WeatherSensor s3 = new WeatherSensor();
        weatherSensorList.add(s1);
        weatherSensorList.add(s2);
        weatherSensorList.add(s3);
       
    }

    public ArrayList<WeatherSensor> getWeatherSensorList() {
        return weatherSensorList;
    }

    public void setWeatherSensorList(ArrayList<WeatherSensor> weatherSensorList) {
        this.weatherSensorList = weatherSensorList;
    }
   public WeatherSensor addWeatherSensor()
    {
        WeatherSensor ws = new WeatherSensor();
        weatherSensorList.add(ws);
        return ws;
    }
}
