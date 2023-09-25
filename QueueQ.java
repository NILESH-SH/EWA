package Demoalp;
import java.util.*;
public class QueueQ {

	public static void main(String[] args) {
//		Queue is an Interface
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.offer(6);
//		Iterator is an interface q is the object of this interface
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
//		Remove top[Start element ] element in Queue 
		q.remove();
		q.poll();
		
//		For first element 
		System.out.println("Using Element"+q.element());
		System.out.println("Using Peek"+q.peek());
		Iterator<Integer> itr2 = q.iterator();
		System.out.println(" ");
		while(itr2.hasNext()) {
			System.out.println("Next"+itr2.next());
		}
		
		System.out.println("Original Size : "+q.size());
		q.remove(2);
		System.out.println(q);
		System.out.println("Size after removing [2] from queue : "+q.size());
		System.out.println(q.contains(2));
		q.clear();
		System.out.println("After using clear() : "+q);
	}
}
