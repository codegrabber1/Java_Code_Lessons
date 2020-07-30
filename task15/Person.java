package task15;

public class Person {

    String personName;
    int age;

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;

    }


    public String getPersonName() {
        return personName;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                '}' + "owns: ";
    }

}
