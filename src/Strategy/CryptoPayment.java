package Strategy;

class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " руб. криптовалютой.");
    }
}
