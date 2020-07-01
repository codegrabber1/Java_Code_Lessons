package task12.my.list;

public class Main {

    public static void main(String[] args){
        MyList <String> str = new MyList<>();

        str.add("First");
        str.add("Second");
        str.add("Another one");


        System.out.println(str.get(1));


        System.out.println(str.size());

        for(String s : str ) {
            System.out.println(s);
        }

        //	str.remove(1);
    }
}
