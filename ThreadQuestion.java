/*
 * Write a Java program that implements a multi-thread application that has three threads.
 * 1st Thread: Generates a random Integer for every 1 second
 * 2nd Thread: Computes the square of the no. and prints
 * 3rd Thread: Computes the cube of the no.  and prints
 */

// Done Using the Extends Thread Method

package Demoalp;
import java.util.Random;

class Square extends Thread{
	int x;
	Square(int n){
		x=n;
	}
	public void run() {  // Run Method mein hi hum apna child thread likhna hain
		int sqr = x*x;
		System.out.println("Square of "+x+" = "+sqr);
		}
}


class Cube extends Thread{
	int x;
	Cube(int n){
		x=n;
	}
	public void run() {
		int cub = x*x*x;
		System.out.println("Cube of "+x+" = "+cub);
	}
	
}



public class ThreadQuestion extends Thread{
	
	public void run() {
		System.out.println("Thread is under Running");
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			int randInt = rand.nextInt(100);
			System.out.println("Random Integer Generated is: "+randInt);
			Square s = new Square(randInt);
			s.start();
			Cube c = new Cube(randInt);
			c.start();
			try{
				Thread.sleep(1000); // Argument in milliSeconds, 1sec=1000 milliSec
				// This Thread Generates Random Number 10 times
				// b/w 1 and 100 for every 1 second 
			}
			catch(InterruptedException ex){
				System.out.println(ex);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadQuestion obj = new ThreadQuestion();
		System.out.println("Thread about to start...");
		obj.start();

	}

}
