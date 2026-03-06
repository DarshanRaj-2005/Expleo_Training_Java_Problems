package Java_Basics;

//Example for an Interface Implementation with both abstract class and normal class

interface Shape_1 {
	double default_value = 1.0; //public static final constant
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() { //default method
		return "A Shape with Unspecified dimensions";
	}
}

abstract class Circle_1 implements Shape_1 {
	
	double radius;
	final static double PI = 3.14;
	
	public Circle_1(double radius) {
		this.radius = radius;
	}
	
	Circle_1() {
		radius = default_value;
	}
	
	@Override
	public double calculateArea() { // implements only single method of using abstract class
		return (PI*(radius*radius));
	}
	
	@Override
	public String getDescription() {
		return "A circle with radius" + radius;
	}
}

class Rectangle_1 implements Shape_1 {
	
	double length;
	double breadth;
	
	Rectangle_1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	Rectangle_1() {
		length = default_value;
		breadth = default_value;
	}
	
	@Override
	public double calculateArea() {
		return length*breadth;             // implements both methods of using normal class
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}
	
	@Override
	public String getDescription() {
		return "Rectangle with length " + length +" and breadth "+ breadth;
	}
}

public class Interface_Example {

	public static void main(String[] args) {
		
		Shape_1 s = new Rectangle_1();
		System.out.println("Area of Rectangle for defualt value: "+s.calculateArea());
		System.out.println("Perimeter of Rectangle for defualt value: "+s.calculatePerimeter());
		System.out.println(s.getDescription());
		
		Shape_1 s1 = new Rectangle_1(10,20);
		System.out.println("Area of Rectangle: "+s1.calculateArea());
		System.out.println("Perimeter of Rectangle: "+s1.calculatePerimeter());
		
	}
}
