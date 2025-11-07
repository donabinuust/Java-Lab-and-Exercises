package day5;

class mythread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class p1_thread_basics {

	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();

	}

}
