
public class p1_8 {

	public static void main(String[] args) {
		int[][] x = {{5,2,7,0},
					 {4,7,3,9},
					 {7,2,6,3},
					 {3,8,5,7}};
		int[][]y = zeroes(x);	
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				System.out.print(y[i][j]);
			}
			System.out.println();
		}

	}
	
	public static int[][] zeroes(int[][] x){
		int row=0;
		int column=0;
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				if(x[i][j]==0) {
					row=i;
					column=j;
				}
			}
		}
		for(int a=0; a<x[row].length; a++) {
			x[row][a]=0;
		}
		for(int b=0; b<x.length; b++) {
			x[b][column]=0;
		}
		return x;
	}

}
