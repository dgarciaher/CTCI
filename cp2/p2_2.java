
public class p2_2 {

	public static int p22(int k) {
		Node t= head;
		int counter=0;
		
		while(t != null) {
			t=t.next;
			counter++;
		}
		
		if(counter<k) {
			return;
		}
		
		t=head;
		
		for(int i=1; i<counter-k+1; i++) {
			t=t.next;
		}
		
		return temp.data;
	}

}
