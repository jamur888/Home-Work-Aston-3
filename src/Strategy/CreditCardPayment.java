package Strategy;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " руб. банковской картой.");
    }
}