package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        Coffee coffeeWithSugar = new SugarDecorator(simpleCoffee);
        System.out.printf("Цена простого кофе: %s руб.%n", simpleCoffee.cost());
        System.out.printf("Цена кофе с молоком: %s руб.%n", coffeeWithMilk.cost());
        System.out.printf("Цена кофе с сахаром: %s руб.%n", coffeeWithSugar.cost());

    }

}