
public class OrderProcessor {

    private OrderValidator validator;
    private PriceCalculator priceCalculator;
    private OrderRepository repository;
    private NotificationService notificationService;

    private OrderProcessor() {
    }

    public static class Builder {

        private OrderValidator validator;
        private PriceCalculator priceCalculator;
        private OrderRepository repository;
        private NotificationService notificationService;

        public Builder validator(OrderValidator validator) {
            this.validator = validator;
            return this;
        }

        public Builder priceCalculator(PriceCalculator priceCalculator) {
            this.priceCalculator = priceCalculator;
            return this;
        }

        public Builder repository(OrderRepository repository) {
            this.repository = repository;
            return this;
        }

        public Builder notificationService(NotificationService notificationService) {
            this.notificationService = notificationService;
            return this;
        }

        public OrderProcessor build() {
            OrderProcessor processor = new OrderProcessor();
            processor.validator = this.validator;
            processor.priceCalculator = this.priceCalculator;
            processor.repository = this.repository;
            processor.notificationService = this.notificationService;
            return processor;
        }
    }

    public void processOrder(Order order, OrderDetail orderDetails, DiscountCounter discount) {
        if (!validator.isValid(order, order.getOrderDetails())) {
            System.out.println("Pesanan tidak valid");
            return;
        }
        double finalPrice = priceCalculator.calculateTotal(order, orderDetails, discount);
        repository.saveOrder(order, finalPrice);
        notificationService.sendNotification(order.getCustomer(), "Pesanan Anda telah diproses dengan total: " + finalPrice);
    }
}
