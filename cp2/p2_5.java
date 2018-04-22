
public class p2_5 {
	
	public static int add(Node head, Node head2) {
		int count1=0;
		int count2=0;
		
		while(head.next != null) {
			count1++;
		}
		
		while(head2.next != null) {
			count2++;
		}
		
		double pow= Math.pow(10, count1);
		double pow2= (int) Math.pow(10, count1-1);
		
		double num1=0.0;
		double num2=0.0;
		
		double result=0.0;
		
		while(head.next != null) {
			num1+=head.data*pow;
			pow= pow/10;
		}
		
		while(head2.next != null) {
			num2+=head2.data*pow2;
			pow2= pow2/10;
		}
		
		result= num1+num2;
	}

}
