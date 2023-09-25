package Demoalp;

class UsingExtend extends Thread {
	public void run() {
		System.out.println("Running : ");
		for(int i = 0; i<9 ; i++) {
			System.out.println("i : "+i);
	}
		}

}
public class ThreadUsingExtend{
	public static void main(String[] args) {
		UsingExtend tue = new UsingExtend();
		tue.start();
	}
}

