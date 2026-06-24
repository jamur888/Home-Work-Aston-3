package Strategy;

class Order {
    private final int amount;
    private PaymentStrategy strategy;

    public Order(int amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        strategy.pay(amount);
    }
}