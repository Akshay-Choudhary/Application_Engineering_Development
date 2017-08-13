package Business;

/**
 *
 * @author kedarvdm
 */
public class OrderItem {

    private Product product;
    private int quantity;
    private Double salesPrice;
    private Double salesCommission;
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(Double salesCommission) {
        this.salesCommission = salesCommission;
    }
    
    @Override
    public String toString() {
        return product.getProdName();
    }
    
}
