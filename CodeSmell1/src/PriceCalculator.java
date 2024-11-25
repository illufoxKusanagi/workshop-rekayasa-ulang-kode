
class PriceCalculator {

    public double calculateTotal(Order order, OrderDetail orderDetails, DiscountCounter discount) {
        double finalPrice = orderDetails.getTotalPrice() + orderDetails.getTax();
        if (discount != null) {
            finalPrice -= discount.apply(orderDetails.getTotalPrice());
        }
        return finalPrice;
    }
}
