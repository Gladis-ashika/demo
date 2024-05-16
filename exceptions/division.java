package exceptions;

public class division {
	public static int divide(int a,int b) {
        try {
            return a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return a/b;
        }
    }
    public static void main(String[] args) {
        int a =10;
        int b =5;
        int result =divide(a,b);
        System.out.println("Result: " +result);
    }
}