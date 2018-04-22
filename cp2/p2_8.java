
public class p2_8 {
	public static Node p28(Node head) {
		Node front= head; 
		Node back= head;
		
		while(back != null && back.next != null) {
			front = front.next;
			back = back.next.next;
			if(front==back) {
				break;
			}
		}
		if(back==null || back.next==null) {
			return null;
		}
		
		back=head;
		
		while(front != back) {
			front = front.next;
			back = back.next;
		}
		return back;
	}
}
