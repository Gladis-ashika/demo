public class thiExample {
   
	int balance=1000;
	
	void deposit(int balance) {
	this.balance+=balance;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiExample ob=new thiExample();
		ob.deposit(200);
		System.out.println(ob.balance);
	}

}
