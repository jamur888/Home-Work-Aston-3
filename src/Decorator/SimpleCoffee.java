package Decorator;

import java.math.BigDecimal;

class SimpleCoffee implements Coffee {
    @Override
    public BigDecimal cost() {
        return AppConstants.BASE_COFFEE_PRICE;
    }
}
