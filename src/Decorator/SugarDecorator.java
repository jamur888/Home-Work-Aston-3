package Decorator;

import java.math.BigDecimal;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(AppConstants.SUGAR);
    }
}