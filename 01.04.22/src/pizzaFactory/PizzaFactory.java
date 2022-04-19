package pizzaFactory;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case PIZZA_MOZARELLA: return new PizzaMozarella();
            case PIZZA_HAWAI: return new PizzaHawai();
            case PIZZA_SALAMI: return new PizzaSalami();
            default: return null;
        }
    }
}