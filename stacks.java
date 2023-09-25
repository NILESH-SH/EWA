package Demoalp;
import java.util.*;

public class stacks {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Amit");
//		s.push("Joti");
		s.push("Kartikay");
		s.push("Ashmin");
//		s.push("Joti");
		System.out.println("Stacks :"+s);
		System.out.println("Location of : "+s.search("Joti"));
		System.out.println("Location of : "+s.search("Kartikay"));
		System.out.println("Location of : "+s.search("Rahu"));
		System.out.println("Stacks :"+s.peek());	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		printing and deleting top element of stack
		/*Stack<Integer> s = new Stack<>();
		s.push(32);
		s.push(35);
		s.push(23);
		s.push(76);
		s.push(8);
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
		System.out.println(s.empty());*/
		
		
		
		
		
//		Basic Stacks
		/*Stack<String> s = new Stack<>();
		boolean f = s.isEmpty();
		System.out.println("Stack status : "+f);
		s.push("Java");
		s.push("is");
		s.push("programming");
		s.push("language");
		System.out.println("Stack elements: "+s);
		f = s.isEmpty();
		System.out.println("Stack status : "+f);*/
		
//		Questions 
		/*
		Stack<String> s = new Stack<>();
		boolean f = s.isEmpty();
		System.out.println("Stack status : "+f);
		s.push("AWS");
		s.push("AZURE");
		s.push("GCP");
		s.push("BIGDATA");
		s.push("ML");
		s.pop();
		s.pop();
		f =  s.isEmpty();
		System.out.println("Stack status : "+f);
		System.out.println("New Stack Is :"+s);
		System.out.println("New Top element of stack is : "+s.peek());
		*/
		
//		Size and Capacity
//		Stack<Integer> s = new Stack<>();
//		s.push(0);
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
		/*for (int i = 0 ; i<162; i++) {
			s.push(i);
		}
		System.out.println("Size of the Stack : "+s.size());
		System.out.println("Capacity of the Stack : "+s.capacity());*/
		}

}
