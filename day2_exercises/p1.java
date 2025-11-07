package day2_exercises;

class student{
	int rollno;
	String name, course;
	void assignValues(int r, String n, String c) {
		rollno=r;
		name=n;
		course=c;
	}
	void printValues() {
		System.out.println("Name:" + name + ", Roll no:" + rollno + ", Course:" + course);
	}
}

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.assignValues(101, "test", "perl programming");
		obj.printValues();

	}

}
