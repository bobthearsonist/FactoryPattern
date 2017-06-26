package TacoStore;

public class BadTacoStore {

    static Taco orderTaco(Tacos type)
    {
        SimpleTacoFactory tacoFactory = new SimpleTacoFactory();
        Taco taco = tacoFactory.createTaco(type);
        //do other taco stuff here?
        //maybe a bad example becasue you dont need to bake a taco like a pizza..
        return taco;
    }

    public static void main(String[] args) {

        Taco taco = orderTaco(Tacos.Gringo);
        taco.Display();
        System.out.println(taco.Cost());
    }
}

class SimpleTacoFactory
{
    public Taco createTaco(Tacos type)
    {
        switch (type)
        {
            case Gringo:
            {
                Taco taco = new GringoTaco();
                taco = new SoftShell(taco);
                taco = new Lettuce(taco);
                taco = new Guacomole(new Guacomole(taco));
                return taco;
            }
            default:
            {
                //but this taco has nothing in it and no shell... so...
                return new GringoTaco();
            }
        }
    }
}

enum Tacos{Gringo,Special};

