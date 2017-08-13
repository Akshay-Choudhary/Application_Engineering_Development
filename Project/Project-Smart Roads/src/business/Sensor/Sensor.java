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
public class Sensor {
    
    private int id;
    private static int count=0;
    private double threshold;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getThreshold() {
        return threshold;
    }

    

    

    
    public Sensor()
    {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
