package day2_exercises;

public class p2_student_class {
	int rollno;
	String name, course;
	void assignValues(int rollno, String name, String course) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	void printValues() {
		System.out.println("Name:" + name + ", Roll no:" + rollno + ", Course:" + course);
	}
}
