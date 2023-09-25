package Demoalp;
import java.util.*;
//import java.util.Col
public class MapTree {
	public static void main(String[] args) {
		Map<Integer, String> maptree = new TreeMap<>();
//		by default ascending order
		maptree.put(1, "EWA");
		maptree.put(3, "File");
		maptree.put(2, "Code");
		maptree.put(5, "JavaFX");
		maptree.put(4, "Swing");
		maptree.put(6, "Android Studio");
//		Before removing key(1)
		System.out.println(maptree);
		for(Map.Entry m : maptree.entrySet()) {
//			System.out.println(m);
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		System.out.println(maptree);
		System.out.println(maptree.entrySet());
		maptree.remove(1);
		System.out.println("");
//		After removing key(1)
		for(Map.Entry m : maptree.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
