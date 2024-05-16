package encapsulation;

public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setName("xxx");
		System.out.println("Name: "+person.getName());
		person.setName("");
		System.out.println("Name: "+person.getName());
	}

}
