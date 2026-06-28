package Decorator;

import java.math.BigDecimal;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public BigDecimal cost() {
        return decoratedCoffee.cost();
    }
}