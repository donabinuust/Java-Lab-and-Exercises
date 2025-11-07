package day3;

class program1{
	program1(){
		System.out.println("Program1");
	}
}

class program2 extends program1{
	program2(){
		System.out.println("Program2");
	}
}

class program3 extends program2{
	program3(){
		System.out.println("Program3");
	}
}

public class p8_inheritance_constuctor_call {
	public static void main(String[] args) {
		new program3();
	}
}
