package PizzaStore;

public abstract class Pizza{
    Type type;

    private Pizza(){};

    public Pizza(Type type){
        this.type = type;
    };

    void prepare()
    {
        System.out.println("this is a " + type.toString() + " pizza");
        System.out.println("preparing");
        System.out.println("toss dough");
        System.out.println("add sauce");
        System.out.println("add toppings");
    }

    public void bake() {
        System.out.println("baking");
    }

    public void cut(){
        System.out.println("cutting");
    }
    void box(){
        System.out.println("boxing");
    }
}
