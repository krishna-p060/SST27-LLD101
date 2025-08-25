
public class Demo04 {
    public static void main(String[] args) {
        
        Payment p1 = new Card(100.0);
        p1.processPayment();

        Payment p2 = new Upi(200.0);
        p2.processPayment();

        Payment p3 = new Wallet(300.0);
        p3.processPayment();}
}
