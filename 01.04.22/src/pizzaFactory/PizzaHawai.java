package pizzaFactory;

public class PizzaHawai extends Pizza{
    private static final String TYPE = "Pizza Hawai";

    public PizzaHawai() {
        super(TYPE);
    }

    protected void prepare(){
        System.out.println("Preparing Pizza with Ananas and Cheese");
    }
}
