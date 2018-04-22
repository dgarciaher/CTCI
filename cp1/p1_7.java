
public class p1_7 {

	public static void main(String[] args) {
		int[][] old= {{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}};

		int[][] newM = flip(old);
		
		for(int i=0; i<old.length; i++) {
			for(int j=0; j<old[i].length; j++) {
				System.out.print(newM[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] flip(int[][] old){
		int[][] newM = new int[old.length][old[0].length];
		for(int i=0; i<old.length; i++) {
			for(int j=0; j<old[i].length; j++) {
				newM[i][j]=old[j][i];
			}
		}
		
		for(int i=0; i<newM[0].length; i++) {
			for(int j=0, k=newM[0].length-1; j<k; j++, k--) {
				int temp= newM[j][i];
				newM[j][i]=newM[k][i];
				newM[k][i] = temp;
			}
		}
		
		return newM;
	}

	
	
}
