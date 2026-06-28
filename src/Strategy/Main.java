package Strategy;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        BigDecimal orderAmount = new BigDecimal("750.00");

        Order order = new Order(new CreditCardPayment(), orderAmount);
        order.processPayment();

        order.setPaymentStrategy(new CryptoPayment());
        order.processPayment();
        System.out.println(AppConstants.TEXT_SEPARATOR);
    }
}
