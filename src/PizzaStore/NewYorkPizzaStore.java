package PizzaStore;

public class NewYorkPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(Type typeOfPizza) {

        Pizza pizza;

        switch (typeOfPizza) {
            case Cheese: {
                pizza = new CheesePizza(Type.Cheese);
                break;
            }
            case Greek: {
                pizza = new GreekPizza(Type.Greek);
                break;
            }
            default: {
                pizza = new CheesePizza(Type.Cheese);
                break;
            }
        }

        return pizza;
    }
}
