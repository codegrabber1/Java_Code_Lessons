package task2;

public class Main {

	public static void main(String[] args) {
		Rectangle a1 = new Rectangle();

        Rectangle a2 = new Rectangle(23, 45);

        int w = a1.getWidth();
        int l = a1.getLength();
        int calculateArea = a1.calculateArea(w, l);

        int width = a2.getWidth();
        int length = a2.getLength();
        int calculatePerimeter = a1.calculatePerimeter(length, width);

        System.out.println("Площа прямокутника: " + calculateArea);

        System.out.println("Периметр прямокутника: " + calculatePerimeter);

        System.out.println("=======");

        Circle b1 = new Circle();
        Circle b2 = new Circle(7.2);

        double rd = b2.getRadius();
        System.out.println("Площа кола: " + b1.circleArea());
        System.out.println("Довжина кола кола: " + b2.circleLength(rd));

	}

}
