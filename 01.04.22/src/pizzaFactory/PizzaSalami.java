package pizzaFactory;

public class PizzaSalami extends Pizza{
    private static final String TYPE = "Pizza Salami";

    public PizzaSalami() {
        super(TYPE);
    }

    protected void prepare(){
        System.out.println("Preparing Pizza with Cheese and sosige");
    }
}
