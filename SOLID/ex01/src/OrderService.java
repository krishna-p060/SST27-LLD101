public class OrderService {
    Notifier notifier;
    Tax tax;

    public OrderService(Notifier notifier, Tax tax) {
        this.notifier = notifier;
        this.tax = tax;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = this.tax.totalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}