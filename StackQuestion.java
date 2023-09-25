package Demoalp;
import java.util.*;
public class StackQuestion {
	private int arr[];
	private int top;
	private int capacity;
//	private int size;

	StackQuestion(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	private boolean isFull() {
		if(top==capacity) {
			return true;
		}
		return false;
	}
	private boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack OverFlow");
			System.exit(1);
		}
		System.out.println("Inserting : "+x);
		arr[++top] = x;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arr[top--];
	}
	public void printStack() {
		for (int i = 0;i<=top; ++i) {
			System.out.print(arr[i]+",");
		}
	}
	public static void main(String[] args) {
		StackQuestion s = new StackQuestion(10);
//		Stack<Integer> s = new Stack<>(); 
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("Poping stack element : "+s.pop());
		System.out.print("Printing element of stacks : ");
		s.printStack();
	}

}
