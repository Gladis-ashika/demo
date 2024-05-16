package abstraction;

public class Shape1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
	
		System.out.println("Area of the circle is: "+c.calculateArea());
		c.calculatePerimeter();
		System.out.println("Perimeter of the circle is: "+c.calculatePerimeter());
		Triangle t=new Triangle(3,5);
		
		System.out.println("Area of the triangle is: "+t.calculateArea());
		
		System.out.println("Perimeter of the triangle is: "+t.calculatePerimeter());
	}
}