/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class PharmaDirectory {
    private ArrayList<Pharma> pharmaList;
    
    public PharmaDirectory()
    {
        pharmaList = new ArrayList<>();
    }

    public ArrayList<Pharma> getPharmaList() {
        return pharmaList;
    }

    public void setPharmaList(ArrayList<Pharma> pharmaList) {
        this.pharmaList = pharmaList;
    }
    public Pharma addPharma()
    {
        Pharma p =new Pharma();
        pharmaList.add(p);
        return p;
    }

   
}
