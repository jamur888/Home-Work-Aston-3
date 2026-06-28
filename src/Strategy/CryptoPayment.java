package Strategy;

import java.math.BigDecimal;

class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Конвертировано и оплачено в крипто: " + amount);
    }
}
