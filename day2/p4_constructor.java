package day2;

class student{
	int rollno;
	String sname;
	String course;
	
	student(){
		rollno = 1;
		sname = "user1";
		course = "perl programming";
	}
	void printValues() {
		System.out.println(rollno+sname+course);
	}
}

public class p4_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.printValues();

	}

}
