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
                pizza = new CheesePizza(Type.Cheese);
            }
            default:
            {
                pizza = new CheesePizza(Type.Cheese);
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
