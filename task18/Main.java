package task18;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        mapClass<Integer,String> mp = new mapClass<>();

        mp.addItem(1, "Привіт");
        mp.addItem(2, "Світ");
        mp.addItem(3, "! ");

        System.out.println("");
        mp.showMap();

        System.out.println("");
        System.out.println("Here is the list of values");
        mp.showItemList();

        System.out.println("Here is the set of keys");
        mp.showItemSet();

        System.out.println("");
        System.out.println("Removing by key");
        mp.removeItemByKey(2);
        System.out.println("Removing by value");
        mp.removeItemByValue("!");

        System.out.println("After removing");
        mp.showMap();

        /**
         * For the first task (min).
         * Inserting String type into the List of The Integer type.
         */
        List<Integer> ls = new ArrayList<>();

        addToList(ls, "Hello");

        String s = "World!";

        addToList(ls, s);

        System.out.println("");

        System.out.println(ls);

        System.out.println("String успішно додано до List<Integer>");


    }

    @SuppressWarnings("unchecked")
    private static void addToList(List l, String a) {
        /**
         * Перед виконання параметри типів можна замінити, List<Integer> на List. Таким чином, це дасть можливість
         * додати будь який реферальний тип до списку.
         *
         * І навпаки, якщо змінити addToList (List l) на addToList (List<Integer> l),
         * компілятор не дозволить додати String до цього списку. Буде exception:
         * Unresolved compilation problem:
         * The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)
         */
        l.add(a);
    }
}