package Demoalp;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(50);
		s.add(30);
		s.add(40);
		s.add(50);
		
//		By default the order is ascending
//		Iterator<Integer> itr = s.iterator();
//		For Descending iterator
		Iterator<Integer> itr = ((TreeSet<Integer>) s).descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
