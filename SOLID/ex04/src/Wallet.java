public class Wallet extends Payment {
    public Wallet(double a) {
        super(a);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing wallet payment of amount: " + amount);
    }

}
