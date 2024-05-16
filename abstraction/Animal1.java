package abstraction;

abstract class Animal {
	public abstract void sound();
}
class Lion extends Animal{
	public void sound(){
		System.out.println("Lion Rorrr");	
	}
}
class Tiger extends Animal{
	public void sound() {
		System.out.println("Tiger Meowww");
	}
}
public class Animal1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion li=new Lion();
		li.sound();
		Tiger ti=new Tiger();
		ti.sound();
	}
}

