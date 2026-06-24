package Builder;

// Класс продукта
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Приватный конструктор: объект создается только через Билдер
    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Пицца [тесто=" + dough + ", соус=" + sauce + ", топпинг=" + topping + "]";
    }

    // Вложенный статический класс Билдера
    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this; // Возвращаем self для chain-вызовов
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}


