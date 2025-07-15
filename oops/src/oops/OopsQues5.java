package oops;

import java.util.*;

class Shape{
	void draw() {
		System.out.println("Drawing shape:");
	}
	void erase() {
		System.out.println("Erasing shape:");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw Circle");
	}
	void erase() {
		System.out.println("Erase Circle");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw Triangle");
	}
	void erase() {
		System.out.println("Erase Triangle");
	}
}

class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Draw Square");
	}
	void erase() {
		System.out.println("Erase Square");
	}
}
public class OopsQues5 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Shape shape = null;

		        System.out.println("Select a shape to draw and erase:");
		        System.out.println("1. Circle");
		        System.out.println("2. Triangle");
		        System.out.println("3. Square");
		        System.out.print("Enter your choice (1-3): ");
		        int choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                shape = new Circle();
		                break;
		            case 2:
		                shape = new Triangle();
		                break;
		            case 3:
		                shape = new Square();
		                break;
		            default:
		                System.out.println("Invalid choice. Exiting...");
		                sc.close();
		                return;
		        }

		        shape.draw();
		        shape.erase();

		        sc.close();

	}

}
