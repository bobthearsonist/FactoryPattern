package TacoStore;

public class SoftShell extends Shell
{
    public SoftShell(Taco taco){
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
