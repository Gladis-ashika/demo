package basics;
public class smallestNumAmgThr {
	public void  smallestNumAmgThr1(int a,int b,int c) {
		if(a<b&&a<c) {
			System.out.println("a is the smallest number");
		}
		else if(b<a&&b<c) {
			System.out.println("b is the smallest number");
		}
		else{
			System.out.println("c is the smallest number");
		}
	}
	public static void main(String[] args) {
		smallestNumAmgThr obj=new smallestNumAmgThr();
		obj.smallestNumAmgThr1(100,20,30);

	}

}
