package Demoalp;
import java.util.*;
public class sets {

	public static void main(String[] args) {
//		Creating set1
		Set<Integer> s1 = new HashSet<>();
		s1.add(22);
		s1.add(358);
		System.out.println("Set1 is : "+s1);
//		Creating another set2
		Set<Integer> s2 = new HashSet<>();
		s2.add(5);
		s2.add(20);
		System.out.println("Set2 is : "+s2);
//		Union of set1 and set2
		s2.addAll(s1);
		System.out.println("Union of Set1 and Set2 is : "+s2);
//		Intersection of set1 and set2
//		s2.retainAll(s1);
//		System.out.println("Intersection is : "+s2);

	}

}
