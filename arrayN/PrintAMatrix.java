package arrayN;

public class PrintAMatrix {


	public static void print(int mat[][]) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
			System.out.print(mat[i][j]+" ");
		}

	}
	}
		public static void main() {
			int mat[][]= {{3,4,5},{6,7,8}};
			print(mat);
			
		}
}
		

