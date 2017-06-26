package PizzaStore;

public class PizzaStore
{
    Pizza orderPizza(Type typeOfPizza)
    {
        Pizza pizza;

        switch (typeOfPizza)
        {
            case Cheese:
            {
                pizza = new CheesePizza();
            }
            default:
            {
                pizza = new CheesePizza();
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
