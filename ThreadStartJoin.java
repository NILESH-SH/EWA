package Demoalp;

public class ThreadStartJoin extends Thread {
	public void run() {
		System.out.println("Thread child : "+Thread.currentThread().getPriority());
		for(int i = 1 ;i<4 ; ++i) {
			System.out.println("Child thread"+i);
		}
		System.out.println("Ending of child");
	}
	public static void main(String[] args) throws Exception {
		Thread.currentThread().setPriority(7);
		System.out.println("Thread parent : "+Thread.currentThread().getPriority());
		ThreadStartJoin t1 = new ThreadStartJoin();
		t1.start();
		t1.join();
		for(int i = 1 ;i<4 ; ++i) {
			System.out.println("Parent thread"+i);
		}
		System.out.println("Ending of parent");
	}

}
