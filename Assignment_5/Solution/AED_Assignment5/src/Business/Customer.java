/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kedarvdm
 */
public class Customer implements Comparable<Customer> {
    private static int count = 0;
    private int customerID;
    private String customerName;
    private String address;
    private String phoneNumber;
    private int buyCount;
    
    public Customer()
    {
        count++;
        customerID=count;
    }

    public int getCustomerID() {
        return customerID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    @Override
    public String toString()
    {
        return customerName;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.getBuyCount()>o.getBuyCount())
        {
            return -1;
        }
        else if(this.getBuyCount()<o.getBuyCount())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
