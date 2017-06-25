public class BadTacoStore {

    public static void main(String[] args) {
        TacoComponent taco = new Taco();
        taco = new SoftShell(taco);
        taco = new Lettuce(taco);
        taco = new Guacomole(new Guacomole(taco));
        taco.Display();
        double cost = taco.Cost();
        System.out.println(cost);
    }
}

interface TacoComponent{
    double Cost();
    void Display();
}

class Taco implements TacoComponent
{
    @Override
    public double Cost() {
        return 2.00;
    }

    @Override
    public void Display()
    {
    }
}

abstract class Shell implements TacoComponent
{
    TacoComponent taco;

    public Shell(TacoComponent taco){
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

class HardShell extends Shell
{
    public HardShell(TacoComponent taco){
        super(taco);
    }

    @Override
    public double getCost(){
        return .50;
    }

    @Override
    protected String getDecription() {
        return "Hard";
    }
}

class SoftShell extends Shell
{
    public SoftShell(TacoComponent taco){
        super(taco);
    }

    @Override
    public double getCost(){
        return .75;
    }

    @Override
    protected String getDecription() {
        return "Hard";
    }
}

abstract class Topping implements TacoComponent
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

class Lettuce extends Topping
{
    public Lettuce(TacoComponent taco) {
        super(taco);
    }

    @Override
    protected double getCost() {
        return .10;
    }

    @Override
    protected String getDecription() {
        return "Lettuce";
    }
}

class Guacomole extends Topping
{
    public Guacomole(TacoComponent taco) {
        super(taco);
    }

    @Override
    protected double getCost() {
        return 1.0;
    }

    @Override
    protected String getDecription() {
        return "Guacomole";
    }
}
