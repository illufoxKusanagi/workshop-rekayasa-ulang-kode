class NotificationService {
    public void sendNotification(Customer customer, String message) {
        System.out.println("Mengirim pesan ke " + customer.getPhone() + ": " + message);
    }
}