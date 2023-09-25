package Demoalp;
import java.util.*;
public class linklist {

	public static void main(String[] args) {
		
		// LinkedList of Integer
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(23);
		list2.add(43);
		list2.add(76);
		list2.add(88);
		list2.add(3);
//		For descending order of the linkedlist
		Iterator<Integer> itr = list2.descendingIterator();
//		For ascending order of the linkedlist
//		Iterator<Integer> itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// LinkedList of String
		/*LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Java");
		System.out.println("TEST"+list);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			System.out.println(list.addressof(it));
		}*/
	}

}
