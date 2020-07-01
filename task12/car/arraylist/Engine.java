package task12.car.arraylist;

public class Engine {

    private int numOfCyl;

    public Engine(int numOfCyl) {
        this.numOfCyl = numOfCyl;
    }

    /**
     * @return the getNumOfCyl
     */
    public int getNumOfCyl() {
        return numOfCyl;
    }

    @Override
    public String toString() {

        String message = " The number of cylinders: " + getNumOfCyl();

        return message;
    }

}