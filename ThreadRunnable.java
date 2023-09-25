package Demoalp;
import java.lang.Runnable;
public class ThreadRunnable implements Runnable {
	public void run() {
		try {
			System.out.println(" Current thread Id : "+Thread.currentThread().getId());
		}
		catch(Exception e){
			System.out.println("Exception : "+e);
		}
	}
	public static void main(String[] args) {

		for(int i =0 ; i<10 ; ++i) {
			Thread o = new Thread(new ThreadRunnable());
			o.start();
		}
	}

}
