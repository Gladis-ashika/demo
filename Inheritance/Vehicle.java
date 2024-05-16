package Inheritance;

class Vehicle1 {
	void start() {
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Car driving");
	}
}
class Sportscar extends Car{
	void drive() {
		System.out.println("Sports car driving fast");
	}
}

class Vehicle{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v=new Vehicle1();
		v.start();
		Car c=new Car();
		c.drive();
		Sportscar s=new Sportscar();
		s.drive();
		
	}
}
