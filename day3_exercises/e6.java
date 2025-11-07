package day3_exercises;

interface shape{
	public void getArea();
}

class Rectangle implements shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle");
	}
	
}

class Triangle implements shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle");
	}
	
}

class Circlei implements shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle");
	}
	
}

public class e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circlei c = new Circlei();
		r.getArea();
		t.getArea();
		c.getArea();
	}

}
