package pizzaFactory;

public abstract class Pizza {
    private String TYPE;

    public Pizza(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + TYPE + '\'' +
                '}';
    }
    private void prepare(){
        System.out.println("pizza prepare" + TYPE);
    }

    private void bake(){
        System.out.println("pizza bake" + TYPE);
    }
    private void pack(){
        System.out.println("pizza pack" + TYPE);;
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
    }
}
