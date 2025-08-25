public class Demo01 {
    public static void main(String[] args) {

        Tax tax = new Tax(0.18);
        Notifier emailNotifier = new EmailClient("noreply@shop.com");
        // Notifier smsNotifier = new SMSClient("+123456789");

        OrderService orderService = new OrderService(emailNotifier, tax);

        orderService.checkout(emailNotifier.getId(), 100.0);
    }
}
