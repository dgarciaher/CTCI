import java.util.Stack;

public class p3_2 {
	public static void min(Stack<Integer> s) {
		int min=s.peek();
		Stack<Integer> s2 =  new Stack<Integer>();
		while(!s.isEmpty()) {
			s2.push(s.pop());
			if(s.peek()<min) {
				min=s.peek();
			}
		}
		while(!s2.isEmpty()) {
			s.push(s.pop());
		}
	}
}
