package abstraction;

public class Bank1 {

	public static void main(String[] args) {
				IOB b;
				SBI s =new SBI();
				System.out.println("Rate of interest is: "+s.getRateOfInterest()+"%");
				IOB i =new IOB();
				System.out.println("Rate of interest is: "+i.getRateOfInterest()+"%");

			}
}