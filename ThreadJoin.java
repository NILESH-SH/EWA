//package Demoalp;
//
//public class ThreadJoin extends Thread{
//	private int number;
//	public ThreadJoin() {
//		this.number = number;
//	}
//	public void run() {
//		int c = 0;
//		int n = 0;
//		do {
//			n = (int)(c+10);
//			System.out.println(this.getId()+" prints "+n);
//			c++;
//		}while(n!=number);
//		System.out.println(this.getName()+" prints "+c);
//	}
//
//	public static void main(String[] args) {
////		creating a thread class instances
////		Thread t1 = new ThreadJoin(15);
////      Starting of t1
//		t1.start();
//		try {
////			waiting for t1 to end
//			t1.join();
//		}catch(InterruptedException e) {
//			System.out.println("Interrupted");
//		}
//		System.out.println("Starting thread 2..");
//		Thread t2 = new ThreadJoin(20);
////		Starting of t2
//		t2.start();
//	}
//
//}
