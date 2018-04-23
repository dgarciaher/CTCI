import java.util.Stack;

public class p3_5 {
	public static void p34(Stack<Integer> s) {
		Stack<Integer> s2= new Stack<Integer>();
		/*while(!s.isEmpty()) {
			if(s.pop()<s.peek()) {
				s2.push(s.pop());
			}
		}*/
		
		int t=s.pop();
		
		while(!s2.isEmpty() && s2.peek() > t) {
			s.push(s2.pop());
		}
		s2.push(t);
	}
}
