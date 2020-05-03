package task3.Animal;

public class Animal {

    private String type;
    private double speed;
    private int age;

    public Animal(String type, double speed, int age) {
        this.type = type;
        this.speed = speed;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void description(String type, double speed, int age){
        System.out.println("Назва тварини = [" + type + "], Швидкість тварин = [" + speed + "] км/год, Вік тварини = [" + age + "] років");

    }
}
