package task2;

public class Circle {
	private double radius;
    private int diametr;


    Circle(){
        this.diametr = 5;
        this.radius = 2.3;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    protected double circleLength(double radius) {

        return 2 * radius * Math.PI;
    }

    protected double circleArea() {
        return this.diametr * this.diametr * Math.PI;
    }
}
