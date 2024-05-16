package abstraction;

public abstract class shape {
	public abstract double calculateArea();
	public abstract double  calculatePerimeter();
}
class Circle extends shape{
	private double r;
	public Circle (double r) {
		this.r=r;
	}
	public double calculateArea() {
		return Math.PI*r*r;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*r;
	}
}
class Triangle extends shape{
	private double base;
	private double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
    public double calculateArea() {
		return 0.5*base*height;
	}
	public double calculatePerimeter() {
		double hypotenuse=Math.sqrt(base*base+height*height);
		return base+height+hypotenuse;
		
	}
}

