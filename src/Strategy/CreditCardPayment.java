package Strategy;

import java.math.BigDecimal;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Списано " + amount + " с банковской карты.");
    }
}