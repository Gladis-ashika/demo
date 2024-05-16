package exam;

class Employeee1 {
	String name;
	double salary;
	
	public Employeee1(String name,double salary) {
		this.name= name;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
	}

}
class Manager extends Employeee1{
	String name;
	double salary;
	String department;
	
	 Manager(String name, double salary,String department) {
		 super(name,salary);
		this.department=department;
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("Department: "+department);
	}
}
class Developer extends Employeee1{
	String name;
	double salary;
	String programmingLanguage;
	
	public Developer(String name,double salary,String programmingLanguage ) {
	    super(name,salary);
		this.programmingLanguage=programmingLanguage;
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("ProgrammingLanguage: "+programmingLanguage);
	}
}

class Emp {
public static void main(String args[]) {
	Employeee1[] ee=new Employeee1[1];
	ee[0]=new Employeee1("aaaa", 34.88);
	for(Employeee1 em:ee) {
		em.displayDetails();
	}
	Manager[] m=new Manager[1];
	m[0]=new Manager("bbb", 50.000,"IT");
	for(Manager ma:m) {
		ma.displayDetails();
	}	
}
}
