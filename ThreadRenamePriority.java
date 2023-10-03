package Demoalp;

public class ThreadRenamePriority extends Thread{
	ThreadRenamePriority(String name){
		super(name);
	}
	public void run() {

		for (int i = 0 ; i<5 ; i++) {
			System.out.println(getName()+" i "+i);		}
	}
	public static void main(String[] args) {
		ThreadRenamePriority m1 = new ThreadRenamePriority("Child 1");
		ThreadRenamePriority m2 = new ThreadRenamePriority("Child 2");
		System.out.println("m1 thread initial name and priority ");
		System.out.println("m1 name "+m1.getName());
		System.out.println("m1 name "+m1.getPriority());
		System.out.println();
		System.out.println("m2 thread initial name and priority ");
		System.out.println("m2 name "+m2.getName());
		System.out.println("m2 name "+m2.getPriority());
		System.out.println();
//		m1.setName("Child1");
		m1.setPriority(6);
		m2.setPriority(9);
		System.out.println("m1 thread initial name and priority ");
		System.out.println("m1 name "+m1.getName());
		System.out.println("m1 name "+m1.getPriority());
		System.out.println();
		System.out.println("m2 thread initial name and priority ");
		System.out.println("m2 name "+m2.getName());
		System.out.println("m2 name "+m2.getPriority());
		System.out.println();
		m1.start();
		m2.start();
		
	}

}
