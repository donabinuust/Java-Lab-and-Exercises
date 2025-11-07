package day3;
//single inheritance

class one{
	int a = 10;
}

class two extends one{
	int b = 10;
	void add() {
		System.out.println(a+b);
	}
}

public class p1_inheritance {
	public static void main(String[] args) {
		two obj = new two();
		obj.add();
	}
}
