package hands_on_06;

interface Movable {
	void moveUp();

	void moveDown();

	void moveLeft();

	void moveRight();
}

class MovablePoint implements Movable {
	int x, y;

	public MovablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveLeft() {
		x--;
	}

	public void moveRight() {
		x++;
	}

	public void display() {
		System.out.println("Point: (" + x + "," + y + ")");
	}
}

class MovableCircle implements Movable {
	int x, y, radius;

	public MovableCircle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveLeft() {
		x--;
	}

	public void moveRight() {
		x++;
	}

	public void display() {
		System.out.println("Circle Center: (" + x + "," + y + ")");
	}
}

public class Prob_002 {
	public static void main(String[] args) {
		MovablePoint p = new MovablePoint(1, 2);
		p.moveUp();
		p.display();

		MovableCircle c = new MovableCircle(5, 5, 10);
		c.moveRight();
		c.display();
	}
}
