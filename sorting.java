package Demoalp;
import java.util.*;

public class sorting {
	public static void main(String[] args) {
			
//		Extra Questions
		List<String> arr = new ArrayList<String>();
		arr.add("DataBase");
		arr.add("JDBC");
		arr.add("Connectivity");
		arr.add("Oracle");
		arr.add("Nosql");
			
//		Sort in reverse order
		System.out.println(" ");
		Collections.sort(arr, Collections.reverseOrder());
		for(String e: arr) {
			System.out.println(e+" is at "+arr.indexOf(e)+" Index number ");
		}
		
//		Sorting in ascen
		/*Collections.sort(arr);
		for(int i =0 ; i<arr.size(); i++) {
			System.out.println(arr.get(i)+" is at "+i+" Index number ");
			if(arr.get(i)=="Nosql") {
				arr.set(i, "Jankin");
			}
		}*/
		
		
//		Sorting String data 
		/*List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Is");
		list1.add("A");
		list1.add("Programming");
		list1.add("Language");*/
	
		
//		Sorting array element into ascending order.
		/*Collections.sort(list1);
		for(String element : list1) {
			System.out.println(element);
		}*/
		
//		Sorting integer data type
		/*ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(0);
		list2.add(4);
		list2.add(10);
		Collections.sort(list2, Collections.reverseOrder());
		for(Integer element : list2) {
//			System.out.print(element+" ");
		}*/
		
	}
}
		

