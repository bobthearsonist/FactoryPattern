public abstract class Shell implements Taco
{
    Taco taco;

    public Shell(Taco taco){
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
        taco = "Building a taco with a " + this.getDecription() + " shell";
        System.out.println(taco);
    }

    protected abstract String getDecription();
}
