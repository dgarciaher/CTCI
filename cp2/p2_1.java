import java.util.HashSet;

import org.w3c.dom.Node;

public class p2_1 {
	public static void p21(Node curr) {
		HashSet<Integer> existingNum = new HashSet<Integer>();
		Node prev = null;
		
		while(curr != null) {
			if(existingNum.contains(curr)) {
				prev.next = curr.getNextSibling();
			}else {
				existingNum.add(curr.data);
				prev= curr;
			}
			curr=curr.next;
		}
	}
}
