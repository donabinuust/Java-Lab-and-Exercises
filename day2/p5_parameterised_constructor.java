package day2;

class sample{
	int rollno;
	String sname;
	String course;
	
	sample(int r, String s, String c){
		rollno = r;
		sname = s;
		course = c;
	}
	void printValues() {
		System.out.println(rollno+sname+course);
	}
}

public class p5_parameterised_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj = new sample(2,"user","perl");
		obj.printValues();
	}

}
