public abstract class Topping implements TacoComponent
{
    TacoComponent taco;

    public Topping(TacoComponent taco){
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
        taco = "now adding " + this.getDecription() + " to the taco";
        System.out.println(taco);
    }

    protected abstract String getDecription();
}
