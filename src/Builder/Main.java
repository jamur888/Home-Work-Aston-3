package Builder;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()
                .setDough("Тонкое")
                .setSauce("Томатный")
                .setTopping("Сыр")
                .build();
        System.out.println(pizza);
    }
}

