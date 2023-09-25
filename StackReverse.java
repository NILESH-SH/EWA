package Demoalp;
import java.util.Stack;
public class StackReverse {
	public static String reverse(String str) {
		Stack<Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		System.out.println(chars);
		for (char c : chars) {
			stack.push(c);
		}
		
		for(int i =0 ; i<str.length(); i++) {
			chars[i] = stack.pop();
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String str = "I am going to College.";
		System.out.println("Before reveres : "+str);
		System.out.println("After reveres : "+reverse(str));

	}

}
