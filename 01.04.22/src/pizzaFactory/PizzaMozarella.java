package pizzaFactory;

public class PizzaMozarella extends Pizza{

    private static final String TYPE = "Pizza Mozarella";

    public PizzaMozarella() {
        super(TYPE);
    }

    protected void prepare(){
        System.out.println("Preparing Pizza with Cheese");
    }
}
