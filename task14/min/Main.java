package task14.min;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Set<Person> setName = new TreeSet<>();

        Set<Person> setName2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().length() > o2.getName().length()) {
                    return 1;
                } else if(o1.getName().length() < o2.getName().length()) {
                    return -1;
                } else{
                    return 0;
                }

            }
        });

        addElements(setName);
        addElements(setName2);

        System.out.println(setName);
        System.out.println();
        System.out.println(setName2);


    }

    private static void addElements(Collection collection){
        collection.add(new Person("John", 23));
        collection.add(new Person("Mike", 55));
        collection.add(new Person("Donald", 32));
        collection.add(new Person("Petro", 33));


    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if(this.age > o.getAge()) {
            return -1;
        } else if(this.age < o.getAge()) {
            return 1;
        }else {
            return 0;
        }

    }


}