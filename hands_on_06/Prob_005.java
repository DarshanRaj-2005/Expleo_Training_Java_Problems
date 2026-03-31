package hands_on_06;

abstract class Shape {
	String shapeName;

	abstract double area();

	public String toString() {
		return shapeName;
	}
}

class Sphere extends Shape {
	double radius;

	Sphere(double r) {
		shapeName = "Sphere";
		radius = r;
	}

	double area() {
		return 4 * Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length, width;

	Rectangle(double l, double w) {
		shapeName = "Rectangle";
		length = l;
		width = w;
	}

	double area() {
		return length * width;
	}
}

class Cylinder extends Shape {
	double radius, height;

	Cylinder(double r, double h) {
		shapeName = "Cylinder";
		radius = r;
		height = h;
	}

	double area() {
		return Math.PI * radius * radius * height;
	}
}

class Paint {
	double coverage;

	Paint(double c) {
		coverage = c;
	}

	double amount(Shape s) {
		System.out.println("Painting " + s);
		return s.area() / coverage;
	}
}

public class Prob_005 {
	public static void main(String[] args) {

		Paint paint = new Paint(350);

		Shape deck = new Rectangle(20, 35);
		Shape ball = new Sphere(15);
		Shape tank = new Cylinder(10, 30);

		System.out.println("Paint needed: " + paint.amount(deck));
		System.out.println("Paint needed: " + paint.amount(ball));
		System.out.println("Paint needed: " + paint.amount(tank));
	}

}
