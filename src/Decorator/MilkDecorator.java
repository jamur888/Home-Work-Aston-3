package Decorator;

import java.math.BigDecimal;

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(AppConstants.MILK_PRICE);
    }
}
