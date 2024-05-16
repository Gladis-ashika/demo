package exceptions;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[]={1,3,5,7};
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
		System.out.println("rest of the code...");
	}
}
