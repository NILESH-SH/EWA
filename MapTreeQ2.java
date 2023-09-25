package Demoalp;
import java.util.*;
public class MapTreeQ2 {
	
	public static void main(String[] args) {
		TreeMap<String,String> q2 = new TreeMap<>();
		q2.put("Ram", "A+");
		q2.put("Rohit", "C+");
		q2.put("Garv", "D+");
		q2.put("Nilesh", "E");
		q2.put("Rahul", "B+");
		q2.put("Sharukh", "C");
		q2.put("Santosh", "A");
		q2.put("Dev", "D");
		q2.put("Ankit", "A+");
		q2.put("Hitesh", "B");
//		Menu for add/remove/modify/printallgrades
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while(choice!=0) {
			System.out.print("Menu for \n1.Add\n2.Remove\n3.Modify\n4.Printallgrades\n");
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();
			if(choice==1) {
				System.out.print("Student to be added : ");
				String student = sc.next();
				q2.put(student, "Not Graded");
			}
			else if(choice==2) {
				System.out.print("Student to be removed : ");
				String student = sc.next();
				q2.remove(student);
			}
			else if(choice==3) {
				System.out.print("Student data to modified : ");
//				for checking student exist or not
				String student = sc.next();
				int flag =-1;
				for(Map.Entry m: q2.entrySet()) {
					if(m.getKey().equals(student)) {
						System.out.println("Found");
						flag=0;
					}
				}
				if(flag==0) {
					System.out.print("Latest Grade : ");
					String grade = sc.next();
					q2.replace(student,grade);	
				}
				else {
					System.out.println("Student Not found");
				}
			}
			else if(choice==4) {
				for(Map.Entry m: q2.entrySet()) {
					System.out.println(m.getKey()+" : "+m.getValue());
					
				}
			}
			else {
				
			}
		}
	}

}
