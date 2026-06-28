package Strategy;

import java.math.BigDecimal;

class Order {

    private PaymentStrategy paymentStrategy;
    private final BigDecimal totalAmount;

    public Order(PaymentStrategy paymentStrategy, BigDecimal totalAmount) {
        this.paymentStrategy = paymentStrategy;
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.pay(totalAmount);
    }

}

