package encapsulation;

public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
			}else {
				System.out.println("invalid name.please provide a non empty name");
			}
	}
}
