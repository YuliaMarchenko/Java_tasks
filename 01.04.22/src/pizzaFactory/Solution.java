package pizzaFactory;

public class Solution {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizzaSalami = factory.createPizza(PizzaType.PIZZA_SALAMI);
        pizzaSalami.orderPizza();
    }

    /* Создать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы: Гавайи, Моцарелла и Салямию.
	Каждый вид пиццы должен уметь: подготавливаться(накладывать ингридиенты напр), печься, упаковываться.
	В каждом случае должно быть понятно о какой пицце идет речь. Класс Solution не должен создавать новый обьект пицца,
	а из него должен поступать "заказ " на изготовление требуемого вида пиццы(обьекта) в класс
	PizzaFactory, который и должен выбрать нужную пиццу для изготовления.*/

}
