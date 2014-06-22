package shapeLib;

public class Circle extends Shape{

	private double radius;
	
	public Circle(double radius) {
		super(1);
		this.radius = radius;
	
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String description() {
		return "" + getArea() + getPerimeter();
	}

}
