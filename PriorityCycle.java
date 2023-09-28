package Demoalp;

public class PriorityCycle extends Thread {
	public void run() {
		System.out.println("runnig thread name is : "+Thread.currentThread().getName());
		System.out.println("runnig thread name is : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		PriorityCycle p1 = new PriorityCycle();
		PriorityCycle p2 = new PriorityCycle();
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		p2.start();
	}

}
