
public class p1_3 {

	public static void main(String[] args) {
		String x= "Mr John Smith";
		replace(x);
	}
	
	public static void replace(String x) {
		System.out.println("original: " + x);
		String r="%20";
		String rS=x.replaceAll(" ", r);
		System.out.println("new: " + rS);
	}

}
