public abstract class Payment {
    double amount;
    public Payment(double a){ 
        amount=a; 
    }

    public abstract void processPayment();

}