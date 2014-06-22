package inheritanceExample;

import shapeLib.Shape;

public class Trapezium extends Shape {
	private double base1;
	private double base2;
	private double base3;
	private double base4;
	private double height;
	
	public Trapezium(double base1, double base2, double height) {
		super(4);
		this.base1 = base1;
		this.base2 = base2;
		this.base3 = base3;
		this. base4 = base4;
		this.height = height;
		
				
	}

	@Override
	public double getArea() {
		return ((base1 + base2)/2) * height;
	}

	@Override
	public double getPerimeter() {
		return base1 + base2 + base3 + base4;
		
	}

	@Override
	public String description() {
			return "This is a Trapezium. It has " + sides + "sides.; The area is "
					+getArea();
	}
	

}
