package shapeLib;

public class Triangle extends Shape{

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super(3);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return base * height;
	}

	@Override
	public double getPerimeter() {
		return base * height;
	}
	
	private double getBase() {
		return base * height;
	}
	
	@Override
	public String description() {
		return "This is a Triangle object. It has " + sides + "sides.; The area is"
				+getArea() + "and the base is " + getBase() + "." ;
	}

	public void resize(double base,double height) {
		this.base = base;
		this.height = height;
	}

}
