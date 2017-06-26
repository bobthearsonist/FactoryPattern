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
                break;
            }
            case Greek:
            {
                pizza = new GreekPizza(Type.Greek);
                break;
            }
            default:
            {
                pizza = new CheesePizza(Type.Cheese);
                break;
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
