package PizzaStore;

/**
 * Created by mperry on 6/25/17.
 */
public class BadPizzaStoreApp {
    public static void main(String args[]) {
        PizzaStore store = new PizzaStore();

        Pizza cheese = store.orderPizza(Type.Cheese);
        Pizza greek = store.orderPizza(Type.Greek);
    }
}

