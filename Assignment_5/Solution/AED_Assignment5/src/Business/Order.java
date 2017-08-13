package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kedarvdm
 */
public class Order {

    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Customer customer;
    private SalesPerson salesPerson;
    private Double orderTotal;
    private Date orderDate;
    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
        orderDate= new Date();
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int q, double price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(orderNumber);
    }
}
