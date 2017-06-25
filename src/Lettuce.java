public class Lettuce extends Topping
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
