
class OrderPrinter {

    public void printOrder(Order order) {
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Amount: $" + order.getOrderAmount());
    }

    public void printSpecialOrder(Order order, SpecialOrder specialOrder) {
        printOrder(order);
        System.out.println("Special Instructions: " + specialOrder.getSpecialInstructions());
    }
}
