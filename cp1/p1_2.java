import java.util.Arrays;
public class p1_2 {
	public static void main(String[] args) {
		String s1="odc";
		String s2="dco";
		
		char[] a= new char[s1.length()];
		char[] b= new char[s2.length()];
		
		for(int i=0; i<s1.length(); i++) {
			a[i]=s1.charAt(i);
		}
		
		for(int i=0; i<s2.length(); i++) {
			b[i]=s2.charAt(i);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(s1.length()!=s2.length()) {
			System.out.println("False");
		}
		
		if(Arrays.equals(a, b)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
