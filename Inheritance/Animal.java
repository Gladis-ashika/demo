package Inheritance;
class animal1{
void makeSound() {
	System.out.println("vbbbb");
}
}
class Dog extends animal1 {
	void makesound() { 
		System.out.println("Woof!");
	}
}

public class Animal {

	public static void main(String[] args) {
	animal1  a=new animal1();
	a.makeSound();
	Dog d=new Dog();
	d.makesound();
	
	}

}
