package arrayN;

public class Add2Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3,4},{2,4,6}};
		int b[][]= {{2,3,4},{4,5,6}};
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
				System.out.println();
			}
		}

	}
