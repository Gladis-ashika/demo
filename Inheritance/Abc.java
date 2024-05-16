package Inheritance;

 class Employee {
	int salary=50000;
	}
class Programmer extends Employee{
	int bonus=25000;
	int extrabonus=10000;
}
class Abc{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Programmer p=new Programmer();
    	System.out.println("Programmer salary is:"+p.salary);
    	System.out.println("Programmer bonus is:"+p.bonus);
    	System.out.println("programmer extra bonus is"+p.extrabonus);
	}
}



