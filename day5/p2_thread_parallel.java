package day5;

class runparallel extends Thread{
	Thread t;
	String threadname;
	
	runparallel(String name){
		threadname = name;
		System.out.println("Thread name: " + threadname + " started");
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread name: " + threadname);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public void starte(Thread th) {
//		t = th;
//		t.start();
//	}
	
	public void starte() {
		t = new Thread(this, threadname);
		System.out.println("Gonna start " + threadname);
		t.start();
	}
}

public class p2_thread_parallel {

	public static void main(String[] args) {
		runparallel t1 = new runparallel("P1");
		runparallel t2 = new runparallel("P2");
		t1.starte();
		t2.starte();
		
	}

}
