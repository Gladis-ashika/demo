package patterns;

import java.util.Scanner;

class Employee1 {
    void enter() {
	long name;
	double salary;
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the employee name : ");
	 name=sc.nextLong();
	 System.out.println("Enter the emplyee salary: ");
	 salary=sc.nextDouble();
	 sc.close();
	}
	void displayDetails() {
		System.out.println("Name  of the employee is:"+"xxx");
		System.out.println("Salary the employee: "+"salary");
	}
}
class Manager extends Employee1{
	void enter() {
	long name;
	long department;
	double salary;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the manager name : ");
		 name=sc.nextLong();
		 System.out.println("Enter the department name: ");
		 department=sc.nextLong();
		 System.out.println("Enter the manager salary: ");
		 salary=sc.nextDouble();
		 sc.close();
		}
	void displayDetails() {
		System.out.println("Name of the Manager  is: "+"yyy");
		System.out.println("Department of the Manager is: "+"MCA");
		System.out.println("Salary of the Manager is: "+"salary");
	}
}
class Developer extends Employee1{
	void enter() {
	long name;
	long programmingLanguage;
	double salary;
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the develpoer name : ");
	 name=sc.nextLong();
	 System.out.println("Enter the developer programmingLanguage: ");
	 programmingLanguage=sc.nextLong();
	 System.out.println("Enter the developer salary: ");
	 salary=sc.nextDouble();
	 sc.close();
	}
	
	void displayDetails() {
		System.out.println("Developer name is: "+"zzz");
		System.out.println("Developer programmingLanguage is: "+"JAVA");
		System.out.println("Developer Ssalary is: "+"salary");
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		e.displayDetails();
		Manager m=new Manager();
		m.displayDetails();
		Developer d=new Developer();
		d.displayDetails();

	}
}