package realword;
import java.util.Scanner;
public class ATMoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=2000,deposit,withdraw,exit;
		String wish="no";
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Choose 1 for deposit");
			System.out.println("Choose 2 for withdraw");
			System.out.println("Choose 3 for exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter money to deposit");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("money was deposited");
				System.out.println("New Balnce is"+balance);
				//System.out.println("Do you want to continue:");
		break;
			case 2:
				System.out.println("Enter money to withdraw");
				withdraw=sc.nextInt();
				withdraw=balance-withdraw;
				if(balance>=withdraw) {
				System.out.println("No enough money");
				}
				System.out.print("");
				break;
			case 3:
				System.out.println("Exit");
				break;
				}
			System.out.println("Do you wish to continue");
			wish=sc.next();
			
		}while(wish.equals("yes"));

	}

}
