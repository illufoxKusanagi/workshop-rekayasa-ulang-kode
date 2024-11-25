
class DiscountCounter {

    private double percentage;

    public DiscountCounter(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        this.percentage = percentage;
    }

    public double apply(double totalPrice) {
        return totalPrice * (percentage / 100);
    }

    public double getPercentage() {
        return percentage;
    }

    public static DiscountCounter tenPercent() {
        return new DiscountCounter(10);
    }

    public static DiscountCounter twentyPercent() {
        return new DiscountCounter(20);
    }
}
