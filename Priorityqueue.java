package Demoalp;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("Life");
		q.offer("is");
		q.offer("coding");
		System.out.println(q);
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		q1.offer(6);
		System.out.println(q1);
//		Iterator is an interface q is the object of this interface
		Iterator<String> itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		/*while(!q.isEmpty()) {
			System.out.println(" "+q.element());
			q.remove(q.element());
		}
		System.out.println("Status : "+q.isEmpty());*/
	}

}
