package Demoalp;
import java.util.*;
public class setscapacity {

//	Element of the set are 22,....28
//	To check whether the set 1 is subset of set2(10,11)
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add(22);
		set1.add(23);
		set1.add(24);
		set1.add(25);
		set1.add(26);
		set1.add(27);
		set1.add(28);
		set2.add(10);
		set2.add(11);
		System.out.println("Element of set1 "+set1+"\nElement of Set2 "
		+set2+"\nSet2 is subset of set1 "+set1.containsAll(set2));
		
		
		
		
//		for(int i=0; i<180 ; i++) {
//		s.add(i);
//	}
//	
//	s.add(32);
//	s.add(85);
//	s.add(87);
//	s.add(90);
//	s.add(12);

	}

}
