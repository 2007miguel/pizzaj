public class Pizza {
    private String masa;
    private String salsa;
    private List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.masa = builder.masa;
        this.salsa = builder.salsa;
        this.toppings = builder.toppings;
    }

    public static class PizzaBuilder {
        private String masa;
        private String salsa;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder setMasa(String masa) {
            this.masa = masa;
            return this;
        }

        public PizzaBuilder setSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

// Uso:
Pizza pizza = new Pizza.PizzaBuilder()
               .setMasa("delgada")
               .setSalsa("tomate")
               .addTopping("queso")
               .addTopping("pepperoni")
               .build();