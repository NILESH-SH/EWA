package Demoalp;
import java.lang.Runnable;
public class ThreadPrinting implements Runnable {
	public void run() {
		System.out.println("Running : ");
		for(int i =0 ; i<10 ; ++i) {
			System.out.println("i : "+i);
		}
	}
	public static void main(String[] args) {
		ThreadPrinting o = new ThreadPrinting();
		Thread t = new Thread(o);
		System.out.println("Starting of thread ");
		t.start();
	}

}
