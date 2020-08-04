package task16;

import java.lang.reflect.InvocationTargetException;

public class Main{

    public static void main(String[] args) throws IllegalAccessException {

        ReflectionTester reflectionTester = new ReflectionTester();
        Person person = new Person("Petro", 22);

        System.out.println("Show class Name: ");
        reflectionTester.showClassName(person);
        System.out.println("");
        System.out.println("Show fields: ");
        reflectionTester.showClassFields(person);
        System.out.println("");
        System.out.println("Show methods: ");
        reflectionTester.showMethods(person);
        System.out.println("");

        System.out.println("Show field's annotations: ");
        reflectionTester.showFieldsAnnotaions(person);
        System.out.println("");

        System.out.println("Show method's annotations: ");
        reflectionTester.showMethodsAnnotaions(person);
        System.out.println("");

        System.out.println("Set the value for private field: ");
        System.out.println(person.getAge());
        System.out.println(person.getYourWages());

        reflectionTester.fillPrivateFields(person);

        System.out.println(person.getAge());
        System.out.println(person.getYourWages());
        System.out.println("");

        Object clone = reflectionTester.creatNewObject(person, "New Petro", 31);
        System.out.println(clone);
        System.out.println(clone.getClass());
        System.out.println("Show fields of the clone class: ");
        reflectionTester.showClassFields(clone);

        System.out.println("");


        try {
            reflectionTester.getMyIntMethod(person, "Hello", 234, 333);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        String str = "Hello Array";
        String str2 = "Hello Array2";


        try {
            reflectionTester.getMyArgsMethod(person, str, str2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}