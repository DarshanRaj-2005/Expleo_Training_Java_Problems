package Java_Basics;

//Example for Abstract Class 

abstract class Shape {
	public void display() {
		System.out.println("Items");
	}
	
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape {
	int length;
	int breadth;
	
	Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("The Area of Rectangle: "+(length * breadth));
	}
	public void perimeter() {
		System.out.println("The Perimeter of Rectangle: "+(2*(length+breadth)));
	}
}

class Square extends Shape {
	int side;
	
	Square(int side) {
		this.side = side;
	}
	
	@Override
	public void area() {
		System.out.println("The Area of Square: "+(side * side));
	}
	@Override
	public void perimeter() {
		System.out.println("The Perimeter of Square: "+(4 * side));
	}
}

class Circle extends Shape {
	double radius;
	final static double PI = 3.14;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("The Area of Circle: "+(PI*(radius*radius)));
	}
	@Override
	public void perimeter() {
		System.out.println("The Perimeter of Circle: "+(2*PI*radius));
	}
}

public class Abstract_Example {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle(10,20);
		s.area();
		s.perimeter();
		
		s = new Square(10);
		s.area();
		s.perimeter();
		
		s = new Circle(10);
		s.area();
		s.perimeter();
	}
}
