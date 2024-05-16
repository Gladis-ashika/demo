package exceptions;

public class JavaExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/100;
			System.out.println(data);
		}
		catch(division e){
			System.out.println(e);		
		}
		System.out.println("rest of the code...");

	}

}
