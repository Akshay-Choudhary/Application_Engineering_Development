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
public class CracksSensorDirectory {
    private ArrayList<CracksSensor> cracksSensorList;
    
    public CracksSensorDirectory()
    {
        cracksSensorList = new ArrayList<>();
    }

    public ArrayList<CracksSensor> getCracksSensorList() {
        return cracksSensorList;
    }

    public void setCracksSensorList(ArrayList<CracksSensor> cracksSensorList) {
        this.cracksSensorList = cracksSensorList;
    }
    
    public CracksSensor addCrackSensor()
    {
        CracksSensor cracksSensor = new CracksSensor();
        cracksSensorList.add(cracksSensor);
        return cracksSensor;
    }
}
