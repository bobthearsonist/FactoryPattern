package TacoStore;

public abstract class Topping implements Taco
{
    Taco taco;

    public Topping(Taco taco){
        this.taco = taco;
    }

    @Override
    public double Cost() {
        double cost;
        cost = getCost() + taco.Cost();
        return cost;
    }

    protected abstract double getCost();

    @Override
    public void Display() {
        this.taco.Display();

        String taco;
        taco = "now adding " + getDecription() + " to the taco";
        System.out.println(taco);
    }

    protected abstract String getDecription();
}
