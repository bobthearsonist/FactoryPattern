public class HardShell extends Shell
{
    public HardShell(Taco taco){
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
