package day5;

class thread_lifecycle extends Thread{
	Thread t;
	String threadname;
	thread_lifecycle(String tname){
		threadname = tname;
		System.out.println("Thread name: " + threadname + ", Status: New");
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Thread " + threadname + " is running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + threadname + " is dead");
	}
	
	public void starte() {
		t = new Thread(this, threadname);
		t.start();
	}
}

public class p3_thread_lifecycle {

	public static void main(String[] args) {
		thread_lifecycle t1 = new thread_lifecycle("P1");
		thread_lifecycle t2 = new thread_lifecycle("P2");
		t1.starte();
		t2.starte();
	}

}
