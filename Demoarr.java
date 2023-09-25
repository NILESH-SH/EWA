package Demoalp;
import java.util.*;
public class Demoarr {

	public static void main(String[] args) {
						
//		Traversing Arraylist Using For each loop [Lab class]
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
								
//		Accessing elements Using Iterator
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		Using Lanmda operator -> forEachLoop
		
//		list.forEach((n) -> {System.out.println(n*10);});
		
//		Using ForEachLoop
		/*for (Integer ele : list) 
			System.out.print(ele+" ");*/
	}
}

//Basic ArrayList [07-08-2023]

/*ArrayList<String> list =  new ArrayList<String>();
list.add("Nilesh");
list.add("Amit");
list.add("Gaurav");
list.add("22CSU358");
System.out.println(list);*/

//Get And Set  [8-06-2023]

/*ArrayList<String> list = new ArrayList<String>();
list.add("Happy");
list.add("Is");
list.add("The Way");
list.add("TO GO");
System.out.println("Returning element : "+list.get(2)); //Accessing Value
list.set(2, "New way"); //Setting Value
System.out.println("Returning element : "+list.get(2));*/




//class Hello{
//	void test() {
//	System.out.println("Hello");
//}
//}