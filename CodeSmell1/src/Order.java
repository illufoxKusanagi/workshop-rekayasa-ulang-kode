
class Order {

    private String orderId;
    private Customer customer;
    private OrderDetail orderDetails;

    public Order(String orderId, Customer customer, OrderDetail orderDetails) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderDetail getOrderDetails() {
        return orderDetails;
    }
}
