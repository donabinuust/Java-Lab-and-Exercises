package day3_exercises;

class Shape{
	void getPerimeter(int r) {
		System.out.println("Getting the perimeter for radius " + r);
	}
	void getArea(int r) {
		System.out.println("Getting the area for radius " + r);
	}
}

class Circle extends Shape{
	void getPerimeter(int r) {
		System.out.println("Perimeter of circle is " + (2*3.14*r));
	}
	void getArea(int r) {
		System.out.println("Area of circle is " + (3.14*r*r));
	}
}

public class e2 {
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.getPerimeter(7);
		obj.getArea(7);
	}
}
