package constructer;
import java.util.Scanner;
public class add{
     int a,b,c;
     add(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first number: ");
	 a=sc.nextInt();
	 System.out.println("Enter the second number: ");
	 b=sc.nextInt();
	 sc.close();
     }
     
     void add() {
    	 c=a+b;
     }
     
     void display() {
    	 System.out.println("sum of two numbers:"+c);
     }
     
 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj=new add();
		obj.add();
		obj.display();
	}
}
