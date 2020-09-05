package task22;

public class Main {

    public static void main(String[] args){

        Pet cat = ()-> System.out.println("Я кіт- Мяууу-Мяууу");
        cat.voice();
        Pet dog = ()-> System.out.println("Я пес-Гаууу-Гаууу");
        dog.voice();
        Pet cow = ()-> System.out.println("Я корова-Мууу-Мууу");
        cow.voice();

        System.out.println("===");

        Frog frog = new Frog();
        frog.amAct.AmAct("Frog starts eating");
        frog.amAct.AmAct("Frog lays sleeping");
        frog.amAct.AmAct("Frog starts swimming");
        frog.amAct.AmAct("Frog starts walking");

        System.out.println("===");

        testConst test = Test::new;
        testConst2 testConst2 = Test::new;

        System.out.println();
        test.create(1,2).show();
        System.out.println();
        testConst2.create(1,2,"second construct").show();

    }

    interface testConst{
        Test create(int a, int b);
    }

    interface testConst2{
        Test create(int a, int b, String c);
    }
}
