package task2;

public class Rectangle {
	private int length;
    private int width;

    public Rectangle() {
        this.length= 12;
        this.width = 15;

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }

    protected Integer calculateArea(int width, int length){
        int areaTriangle = width * length;
        return areaTriangle;
    }

    protected Integer calculatePerimeter(int width, int length) {
        int perimeterTriangle = (width + length)*2;
        return perimeterTriangle;
    }
}
