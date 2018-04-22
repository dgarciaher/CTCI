import java.util.Stack;

import javax.xml.soap.Node;

public class p2_6 {
	public static boolean p26(Node n) p26{
			
		Stack<Integer> s= new Stack<Integer>();
		while(n.next != null) {
			s.push(n.data);
		}
		
		Node prev=null;
		Node curr= n;
		Node next= null;
		
		while(n != null) {
			next=n.next;
			n.next= prev;
			prev= n;
			n= next;
		}
		node= prev;
		
		while(n.next != null) {
			if(n.getUserData = s.peek()){
				s.pop();
			}
		}
		
		if(s.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
}
