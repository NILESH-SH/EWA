package Demoalp;
import java.util.*;
public class linkedlistq {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(21);
		l.add(32);
		l.add(43);
		l.add(65);
		l.add(98);
		
//		Element for search
		int element = 8;
		int flag = -1;
//		Implementing using for loop
		for(int e=0; e<l.size(); e++) {
			if(l.get(e)==element) {
				System.out.println("Element found at "+e+" using for loop");
				flag = 0;
				break;
			}
		}
//		Implementing using while loop
		int c = 0;
		while(c<l.size()) {
			if(l.get(c)==element) {
				System.out.println("Element found at "+c+" using while loop");
				flag = 0;
				break;
			}
			c++;
		}
		if(flag==-1) {
			System.out.println("Element not found");
		}
		
//		Using contains() and indexOf() method
		boolean e = l.contains(element);
		if(e) {
			System.out.println("Element found at "+l.indexOf(element)+" using contains() and indexOf()");
		}
		else {
			System.out.println("Element not found (contain indexOf)");
		}
	}

}
