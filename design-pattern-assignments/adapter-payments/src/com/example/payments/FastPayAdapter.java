package com.example.payments;

public class FastPayAdapter implements PaymentGateway {
    private final FastPayClient fastPayClient;
    

    public FastPayAdapter(FastPayClient fastPayClient) {
        this.fastPayClient = fastPayClient;
    }

    @Override
    public String charge(String user, int amountCents) {
        String payment = fastPayClient.payNow(user, amountCents);
        return payment;
    }
    
}
