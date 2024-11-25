
class OrderValidator {

    public boolean isValid(Order order, OrderDetail orderDetails) {
        return order.getOrderId() != null && order.getCustomer() != null
                && orderDetails.getMenuItems() != null && !orderDetails.getMenuItems().isEmpty()
                && orderDetails.getTotalPrice() > 0;
    }
}
