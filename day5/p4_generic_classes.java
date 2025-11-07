package day5;

class generic <T> {
	T value;
	void setValue(T value) {
		this.value = value;
	}
	T getValue() {
		return value;
	}
}

public class p4_generic_classes {

	public static void main(String[] args) {
		generic obj = new generic();
		obj.setValue("user1");
		System.out.println("Name: " + obj.getValue());
		obj.setValue(40);
		System.out.println("Age: " + obj.getValue());

	}

}
