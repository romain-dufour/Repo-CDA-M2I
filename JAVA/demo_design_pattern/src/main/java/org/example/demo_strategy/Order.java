package org.example.demo_strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private double totalAmount;

    public void pay(PaymentStrategy paymentStrategy) {
        if (paymentStrategy.pay(totalAmount)) {
            System.out.println("Order confirmed");
        }
        else {
            System.out.println("Order not confirmed");
        }
    }
}
