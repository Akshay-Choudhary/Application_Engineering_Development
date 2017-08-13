/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author kedarvdm
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDict;
    
    public SupplierDirectory() {
        supplierDict = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierDict() {
        return supplierDict;
    }
    
    public Supplier addSupplier() {
        Supplier s = new Supplier();
        supplierDict.add(s);
        return s;
    }
}
