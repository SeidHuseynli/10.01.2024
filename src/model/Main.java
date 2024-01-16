package model;

public class Main {
	public static void main(String[] args) {

		Circle circle = new Circle(6.0);
		Rectangle rectangle = new Rectangle(3.0, 5.0);

		double circleArea = circle.calculateArea();
		double rectangleArea = rectangle.calculateArea();

		System.out.println("Area of Circle: " + circleArea);
		System.out.println("Area of Rectangle: " + rectangleArea);
	}
}
