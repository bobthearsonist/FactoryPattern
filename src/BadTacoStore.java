public class BadTacoStore {

    public static void main(String[] args) {
        TacoComponent taco = new GringoTaco();
        taco = new SoftShell(taco);
        taco = new Lettuce(taco);
        taco = new Guacomole(new Guacomole(taco));
        taco.Display();
        double cost = taco.Cost();
        System.out.println(cost);
    }
}

