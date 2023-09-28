package Demoalp;

//class ThreadJoinCode2 extends Thread {
//	public void run() {
//		System.out.println("Thread r1");
//		try {
//			Thread.sleep(1000);
//			System.out.println("Thread r1 sleep");
//		}catch(InterruptedException e) {
//			System.out.println("Thread r2");
//		}
//	}
//}
public class ThreadJoinCode extends Thread {
	public void run() {
		System.out.println("Thread r1");
		try {
			Thread.sleep(1000);
//			System.out.println("Thread r1 sleep");
		}catch(InterruptedException e) {
		}
		System.out.println("Thread r2");
	}

	public static void main(String[] args) {
		ThreadJoinCode t1 = new ThreadJoinCode();
		ThreadJoinCode t2 = new ThreadJoinCode();
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {}
		t2.start();

	}

}
