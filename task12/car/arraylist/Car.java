package task12.car.arraylist;

public class Car {
    private int horsePower;
    private int yearOfManufacture;
    private Engine engine;
    private Wheel wheel;

    public Car(int horsePower, int yearOfManufacture, Engine engine, Wheel wheel) {
        super();
        this.horsePower = horsePower;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.wheel = wheel;
    }

    /**
     * @return the horsePower
     */
    public int getHorsePower() {
        return horsePower;
    }

    /**
     * @return the yearOfManufacture
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     *
     * @return the count of cylinders.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * The info about a wheel,
     * it diameter and materials.
     * @return
     */
    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public String toString() {

        String message = "The count of horsepower is : " + getHorsePower() +
                "\n The year of manufacture is: " + getYearOfManufacture() + ", \n "
                + getEngine() + "\n" + getWheel() + "\n";

        return message;
    }


}
