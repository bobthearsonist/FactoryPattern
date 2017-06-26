package PizzaStore;

public abstract class Pizza{
    void prepare()
    {
        System.out.println("preparing the pizza");
        System.out.println("tossing dough");
        System.out.println("Adding sauce");
        System.out.println("adding toppings");
    }

    public void bake() {
        System.out.println("baking the pizza");
    }

    public void cut(){
        System.out.println("cutting the pizza");
    }
    void box(){
        System.out.println("boxing the pizza");
    }
}
