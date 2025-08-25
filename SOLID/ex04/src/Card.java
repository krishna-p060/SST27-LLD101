public class Card extends Payment {
    public Card(double a) {
        super(a);      
    }
    @Override
    public void processPayment() {
        System.out.println("Processing card payment of amount: " + amount);
    }
    
}
