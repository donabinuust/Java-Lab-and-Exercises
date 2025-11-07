package day2_exercises;

class Person{
	String name;
	int age;
	
	Person(){
		name = "unknown";
		age = 0;
	}
	Person(String n, int a){
		name = n;
		age = a;
	}
	Person(String n){
		name = n;
		age = -1;
	}
	void printValues() {
		System.out.println("Your name is " + name + " and your age is " + age);
	}
	
}

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
		Person obj2 = new Person("user1",20);
		Person obj3 = new Person("user2");
		obj1.printValues();
		obj2.printValues();
		obj3.printValues();
	}

}
