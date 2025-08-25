public class Upi extends Payment {
    public Upi(double a) {
        super(a);      
    }
    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
    
}
