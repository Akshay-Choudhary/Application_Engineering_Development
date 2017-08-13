/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.Comparator;

/**
 *
 * @author kedarvdm
 */
public class SalesPerson implements Comparable<SalesPerson>, Comparator<SalesPerson>{
    public static int count=0;
    private int salesPersonId;
    private String salesPersonName;
    private int floorCommission;
    private int ceilCommission;
    private Double totalCommission;
    private int aboveTarget;
    private int belowTarget;
    
    public SalesPerson()
    {
        count++;
        salesPersonId=count;
        /*Setting default commissions*/
        floorCommission=5;
        ceilCommission=10;
        totalCommission=0.0;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public int getFloorCommission() {
        return floorCommission;
    }

    public void setFloorCommission(int floorCommission) {
        this.floorCommission = floorCommission;
    }

    public int getCeilCommission() {
        return ceilCommission;
    }

    public void setCeilCommission(int ceilCommission) {
        this.ceilCommission = ceilCommission;
    }

    public Double getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(Double totalCommission) {
        this.totalCommission = totalCommission;
    }

    public int getAboveTarget() {
        return aboveTarget;
    }

    public void setAboveTarget(int aboveTarget) {
        this.aboveTarget = aboveTarget;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public void setBelowTarget(int belowTarget) {
        this.belowTarget = belowTarget;
    }
    
    @Override
    public String toString()
    {
        return this.salesPersonName;
    }

    @Override
    public int compareTo(SalesPerson o) {
        if(this.getTotalCommission()>o.getTotalCommission())
        {
            return 1;
        }
        else if(this.getTotalCommission()<o.getTotalCommission())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public int compare(SalesPerson o1, SalesPerson o2) {
        int soldCount1=o1.aboveTarget+o1.belowTarget;
        int soldCount2=o2.aboveTarget+o2.belowTarget;
        if(soldCount1>soldCount2)
        {
            return -1;
        }
        else if(soldCount1<soldCount2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
