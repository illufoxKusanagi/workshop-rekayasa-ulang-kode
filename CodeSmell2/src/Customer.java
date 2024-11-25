
public class Customer {

    private String name;
    private String phone;
    private String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void printCustomer(Customer customer) {
        System.out.println("Pelanggan: " + customer.getName() + ", " + customer.getPhone() + ", " + customer.getEmail());
    }
}
