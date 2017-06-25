public class Guacomole extends Topping
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
