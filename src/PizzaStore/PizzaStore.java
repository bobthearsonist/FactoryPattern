package PizzaStore;

public abstract class PizzaStore
{
    Pizza orderPizza(Type typeOfPizza)
    {
        Pizza pizza = createPizza(typeOfPizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(Type typeOfPizza);
}

