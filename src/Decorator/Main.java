package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);

        System.out.println("Итоговая стоимость: " + myCoffee.getCost() + " руб."); //145
    }
}