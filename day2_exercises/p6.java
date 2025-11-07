package day2_exercises;

class Rectangle{
	int length, width;
	Rectangle(int l, int w){
		length = l;
		width = w;
	}
	Rectangle(Rectangle obj){
		length = obj.length;
		width = obj.width;
	}
	void printValues() {
		System.out.println("Length is " + length + " and width is " + width);
	}
}

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj1 = new Rectangle(5,4);
		obj1.printValues();
		Rectangle obj2 = new Rectangle(obj1);
		obj2.printValues();

	}

}
