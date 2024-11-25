
class OrderRepository {

    public void saveOrder(Order order, double finalPrice) {
        System.out.println("Pesanan disimpan ke database: " + order.getOrderId());
    }
}
