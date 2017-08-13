package Business;

/**
 *
 * @author kedarvdm
 */
public class Business {

    private Supplier xerox;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerDirectory customerDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    
    public Business() {
        xerox= new Supplier();
        masterOrderCatalog = new MasterOrderCatalog();
        customerDirectory= new CustomerDirectory();
        salesPersonDirectory= new SalesPersonDirectory();
        initFile();
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public Supplier getXerox() {
        return xerox;
    }

    public void setXerox(Supplier xerox) {
        this.xerox = xerox;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    private void initFile()
    {
        Customer c1= customerDirectory.addCustomer();
        c1.setCustomerName("C1");
        c1.setAddress("a");
        c1.setPhoneNumber("1234567899");
        
        Customer c2= customerDirectory.addCustomer();
        c2.setCustomerName("C2");
        c1.setAddress("a");
        c1.setPhoneNumber("1234567899");
        
        SalesPerson sp1= salesPersonDirectory.addSalesPerson();
        sp1.setSalesPersonName("SP1");
        sp1.setFloorCommission(5);
        sp1.setCeilCommission(12);
        
        SalesPerson sp2= salesPersonDirectory.addSalesPerson();
        sp2.setSalesPersonName("SP2");
        sp2.setFloorCommission(7);
        sp2.setCeilCommission(14);
        
        SalesPerson sp3= salesPersonDirectory.addSalesPerson();
        sp3.setSalesPersonName("SP3");
        sp3.setFloorCommission(10);
        sp3.setCeilCommission(20);
        
        SalesPerson sp4= salesPersonDirectory.addSalesPerson();
        sp4.setSalesPersonName("SP4");
        sp4.setFloorCommission(10);
        sp4.setCeilCommission(20);
        
        
        Product p1= xerox.getProductCatalog().addProduct();
        p1.setProdName("P1");
        p1.setPrice(100);
        p1.setFloorPrice(90);
        p1.setCeiligPrice(120);
        p1.setAvailability(100);
        
        Product p2= xerox.getProductCatalog().addProduct();
        p2.setProdName("P2");
        p2.setPrice(300);
        p2.setFloorPrice(280);
        p2.setCeiligPrice(310);
        p2.setAvailability(20);
        
        Product p3= xerox.getProductCatalog().addProduct();
        p3.setProdName("P3");
        p3.setPrice(600);
        p3.setFloorPrice(500);
        p3.setCeiligPrice(700);
        p3.setAvailability(50);
        
    }
}
