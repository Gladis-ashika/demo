public class staticexample {
	static int a;
	static void disply(int b) {
		System.out.println("disply"+b);
	}
	
	static {
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//staticexample ob=new staticexample();
		disply(4);
	}

}
