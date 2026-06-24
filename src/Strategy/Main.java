package Strategy;

class Main {
    public static void main(String[] args) {
        Order order = new Order(5000, new CreditCardPayment());
        order.process();

        order.setStrategy(new CryptoPayment());
        order.process();
    }
}