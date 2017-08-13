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
public class MainClass {

    public static void main(String args[])
    {
        SupplierDirectory store= new SupplierDirectory();
        Supplier dell=store.addSupplier();
        dell.setSupplierId("1");
        dell.setSupplierName("Dell");
        
        Supplier hp=store.addSupplier();
        hp.setSupplierId("2");
        hp.setSupplierName("HP");
        
        Supplier apple=store.addSupplier();
        apple.setSupplierId("3");
        apple.setSupplierName("Apple");
        
        Supplier toshiba=store.addSupplier();
        toshiba.setSupplierId("4");
        toshiba.setSupplierName("Toshiba");
        
        Supplier sony=store.addSupplier();
        sony.setSupplierId("5");
        sony.setSupplierName("Sony");
        
        for(int i=0;i<10;i++)
        {
            Product p1 =dell.getProductCatalog().addProduct();
            p1.setProdName("Dell "+i);
            p1.setPrice(50*i);
            p1.setModelNumber(i);
            
            Product p2=hp.getProductCatalog().addProduct();
            p2.setProdName("HP "+i);
            p2.setPrice(60*i);
            p2.setModelNumber(i);
            
            Product p3=apple.getProductCatalog().addProduct();
            p3.setProdName("Apple "+i);
            p3.setPrice(70*i);
            p3.setModelNumber(i);
            
            Product p4=toshiba.getProductCatalog().addProduct();
            p4.setProdName("Toshiba "+i);
            p4.setPrice(80*i);
            p4.setModelNumber(i);
            
            Product p5=sony.getProductCatalog().addProduct();
            p5.setProdName("Sony "+i);
            p5.setPrice(90*i);
            p5.setModelNumber(i);
        }
        
        for (Supplier s : store.getSupplierDict()) {
            System.out.println("Supplier Name: "+s.getSupplierName());
            System.out.println("Name \t Price($) \t Model Number");
            System.out.println("**********Products**********");
            for (Product product : s.getProductCatalog().getProductCatalog()) {
                System.out.print(product.getProdName()+" \t");
                System.out.print(product.getPrice()+" \t\t\t");
                System.out.println(product.getModelNumber()+" \t");

            }
            System.out.println("****************************");

        }
    }
}
