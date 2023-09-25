package Demoalp;
import java.util.*;
public class SetsToArray {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("One");
		s.add("Two");
		s.add("Three");
		System.out.println("Sets elements are : "+s);
		String[] str = new String[s.size()];
		s.toArray(str);
		for(String st : str) {
			System.out.println(st);
		}
	}

}
