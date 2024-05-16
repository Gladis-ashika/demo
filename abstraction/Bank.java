package abstraction;

abstract class Bank {
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class IOB extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
