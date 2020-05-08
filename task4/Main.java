package task4;
import static java.lang.System.out;

import task4.task4.thrd.Amphibia;
import task4.task4.thrd.Frog;
import task4.task4_first.Cat;
import task4.task4_first.Cow;
import task4.task4_first.Dog;
import task4.task4_first.Pet;
import task4.task4_second.Test;

public class Main {
    public static void main(String[] args){
        /**
         * First task.
         * Pets.
         */
        // Invoke objects.
        Cat cat = new Cat("Я кіт-", "Мяууу-Мяууу");
        Dog dog = new Dog("Я пес-", "Гаууу-Гаууу");
        Cow cow = new Cow("Я корова-", "Мууу-Мууу");

        // Using array to get a necessary method.
        Pet[] s = {cat,dog,cow};

        for (Pet pets : s) {
            System.out.println(pets.voice());
        }

        // End of first task.
        out.println("=======");

        /**
         * Second task.
         * Create an instance of an object.
         */
        Test t = new Test(2,3, " second construct");

        //Call to the method show().
        t.show();

        out.println("=======");

        // Tasks three = Amphibia and frog.
        Amphibia frog = new Frog();

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

        // End of third task.
    }
}
