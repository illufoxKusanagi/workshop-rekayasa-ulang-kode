
import java.util.List;

class OrderDetail {

    private List<String> menuItems;
    private double totalPrice;
    private double tax;

    public OrderDetail(List<String> menuItems, double totalPrice, double tax) {
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
        this.tax = tax;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTax() {
        return tax;
    }
}
