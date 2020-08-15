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
//        List<Integer> ls = new ArrayList<>();
//
//        addToList(ls, "Hello");
//
//        String s = "World!";
//
//        addToList(ls, s);
//
//        System.out.println(ls);
    }

    @SuppressWarnings("unchecked")
    private static void addToList(List l, String a) {
        l.add(a);
    }
}