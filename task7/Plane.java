package task7;

public abstract class Plane {
    // The plane MaxSpeed
    private int maxSpeed;

    // The color
    private String planeColor;

    /**
     * Dimensions and weight.
     */
    private int width;

    private int height;

    private int weight;

    // The value of the plane's tank.
    private int tankVal;

    Plane(int maxSpeed, String planeColor, int tankVal) {
        this.maxSpeed = maxSpeed;
        this.planeColor = planeColor;
        this.tankVal = tankVal;

    }
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    /**
     * @return the maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }
    /**
     * @return the planeColor
     */
    public String getPlaneColor() {
        return planeColor;
    }

    /**
     * @return the tankVal
     */
    public int getTankVal() {
        return tankVal;
    }

    /**
     * Starting engine.
     */

    public abstract void StartingEngines();

    /**
     * The plane is taking off.
     */
    public abstract void Takeoff();

    /**
     * The plane is landing.
     */
    public String Landing(String land) {

        return land;
    }
}