package exceptions;

public class Exception_oddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 18;
	    trynumber(n);
	    n = 7;
	    trynumber(n);
	  }
     public static void trynumber(int n) {
	    try {
	      checkEvenNumber(n);
	      System.out.println(n + " is even.");
	    } catch (IllegalArgumentException e) {
	      System.out.println("Error: " +e.getMessage());
	    }
	  }
      public static void checkEvenNumber(int number) {
	    if (number % 2 != 0) {
	      throw new IllegalArgumentException(number+"is odd.");
	    }
	}
      
}
