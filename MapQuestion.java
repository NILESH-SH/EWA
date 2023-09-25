package Demoalp;
import java.util.*;

public class MapQuestion {
	public static void main(String[] args) {
		TreeMap<Integer,String> qmap = new TreeMap<>();
		qmap.put(1, "Alo");
		qmap.put(2, "Logic");
		qmap.put(3, "Implemetation");
		qmap.put(4, "ChatGPT");
		qmap.put(5, "ML");
		System.out.println("Descending order of map : "+qmap.descendingMap());
		System.out.println("Values greater than 4 : "+qmap.tailMap(4,true));
		System.out.println("Values less than 3 : "+qmap.headMap(3,true));
		System.out.println("Values between 2 and 5 : "+qmap.subMap(2,false,5,false));
		qmap.replace(4, "GitHub");
		System.out.println("Replacing Key[4] with GitHub : "+qmap);
	}

}
