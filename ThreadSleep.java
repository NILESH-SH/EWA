package Demoalp;

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread : " + threadName + " , " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " , " + "interupted.");
        }
    }

}

/**
 * ThreadSleep
 */
public class ThreadSleep{
    public static void main(String[] args){
        ThreadDemo t1 = new ThreadDemo("THread1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("THread2");
        t2.start();
    }
}