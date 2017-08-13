/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author kedarvdm
 */
public class SalesPersonDirectory {
    private ArrayList<SalesPerson> salesPersonDirectory;

    public SalesPersonDirectory()
    {
        salesPersonDirectory= new ArrayList<>();
    }
    public ArrayList<SalesPerson> getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(ArrayList<SalesPerson> salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    public SalesPerson addSalesPerson()
    {
        SalesPerson sp= new SalesPerson();
        salesPersonDirectory.add(sp);
        return sp;
    }
}
