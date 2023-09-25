package Demoalp;
//bottom up language 
//Alias  
import java.util.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
		return -1;

	}
}

public class ObjectCompare {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(12,"Nilesh",19));
		al.add(new Student(23,"Sharukh",25));
		al.add(new Student(82,"Rahul",40));
		al.add(new Student(32,"Ashwin",24));
		
		Collections.sort(al);
		
		for(Student st : al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
