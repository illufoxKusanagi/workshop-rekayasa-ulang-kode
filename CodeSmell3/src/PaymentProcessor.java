
public class PaymentProcessor {

    public double processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment();
        double fee = paymentMethod.calculateFee(amount);
        return amount + fee;
    }
}
