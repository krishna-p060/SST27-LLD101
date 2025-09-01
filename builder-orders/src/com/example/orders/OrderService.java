package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order.Builder builder = new Order.Builder(id, email)
        .expedited(expedited)
        .notes(notes);
        Order o = builder.build();

        if (lines != null) {
            for (OrderLine l : lines) {
                o.addLine(l);
            }
        }
        o.setDiscountPercent(discount);
        return o;
    }
}
