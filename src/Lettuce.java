public class Lettuce extends Topping
{
    public Lettuce(Taco taco) {
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
