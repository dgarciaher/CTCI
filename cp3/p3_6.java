import java.util.Queue;
import java.util.Stack;

public class p3_6 {
	public static String catDog(Queue<String>s) {
		Queue<String>temp= new Queue<String>();
		while(s.isEmpty()) {
			if(s.peek()==Cat) {
				return s.dequeue();
			}else {
				temp.enqueue(s.dequeue());
			}
		}
	}
}
