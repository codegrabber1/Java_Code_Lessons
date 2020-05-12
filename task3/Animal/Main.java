package task3.Animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Lion", 55.3, 6);

        String type = animal.getType();
        double speed = animal.getSpeed();
        int age = animal.getAge();

        animal.description(type, speed, age);

        animal.setType("Cat");
        animal.setSpeed(12.3);
        animal.setAge(2);

        String newType = animal.getType();
        double newSpeed = animal.getSpeed();
        int newAage = animal.getAge();

        animal.description(newType, newSpeed, newAage);

    }

}
