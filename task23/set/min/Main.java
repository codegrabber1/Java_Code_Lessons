package task23.set.min;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String... args){

        Set<Person> setPerson = new TreeSet<>();

        addElements(setPerson);

        System.out.println(setPerson);

        setPerson.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(person -> System.out.println("Name: "+ person.getName() + " | Age: "+ person.getAge()));

    }

    private static void addElements(Collection collection){
        collection.add(new Person("John", 23));
        collection.add(new Person("Mikes", 45));
        collection.add(new Person("Andrew", 25));
        collection.add(new Person("Petro", 52));
    }
}

class Person implements Comparable<Person>{

    private String name;
    private int age;

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
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age;
    }


    @Override
    public int compareTo(Person o) {
        if (this.age > o.getAge()){
            return -1;
        }else if(this.age < o.getAge())  {
            return 1;
        } else {
            return 0;
        }
    }
}
