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
public class Product implements Comparable<Product> {

    private static int count = 0;
    private String prodName;
    private int modelNumber;
    private int availability;
    private double floorPrice;
    private double price;
    private double ceiligPrice;
    private int soldCount;

    public Product() {
        count++;
        modelNumber = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCeiligPrice() {
        return ceiligPrice;
    }

    public void setCeiligPrice(double ceiligPrice) {
        this.ceiligPrice = ceiligPrice;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Product o) {
        if(this.getSoldCount()>o.getSoldCount())
        {
            return -1;
        }
        else if(this.getSoldCount()<o.getSoldCount())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
