package task16;
public class Person {
    private String personName;

    @Deprecated
    private int age;
    @Deprecated
    private double yourWage;

    public Person(String personName, int age) {

        this.personName = personName;
        this.age = age;
    }

    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @return the personName
     */
    @Deprecated
    public int getAge() {
        return age;
    }

    /**
     * @return the wages
     */
    public double getYourWages() {
        return yourWage;
    }
    @Override
    public String toString() {
        return "Person [personName=" + personName + "; Age="+ age +"]";
    }

    public void myMethod(String... args) {
        System.out.println(args);
    }

    public void myMethod(String args) {
        System.out.println(args);
    }

    public void myMethod(String a, int... args) {
        if(args.length > 0) {
            for(Integer i: args) {
                System.out.println(a +" and "+ i);
            }
        } else {
            System.out.println("There isn't args");
        }

    }
}
