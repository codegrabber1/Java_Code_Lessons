package task11;

public class Wheel {

    private int wheelDiametr;
    private String materials;


    public Wheel(int wheelDiametr, String materials) {
        this.wheelDiametr = wheelDiametr;
        this.materials = materials;
    }


    /**
     * @return the getwheelDiametr
     */
    public int getwheelDiametr() {
        return wheelDiametr;
    }

    /**
     * @return the getMaterials
     */
    public String getMaterials() {
        return materials;
    }

    @Override
    public String toString() {

        String message = " The diametr of the wheel is " + getwheelDiametr() +
                "\n and it made from " + getMaterials();

        return message;

    }
}
