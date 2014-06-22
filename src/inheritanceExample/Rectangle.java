package inheritanceExample;

import shapeLib.Shape;

public class Rectangle extends Shape{
	
	private double height;
	private double width;
	private double length;

		public Rectangle(double height, double width) {
		super(4);
		this.height = height;
		this.width = width;
		this.length = length;
	}
		

		@Override
		public double getArea() {
			return height * width;
		}
		
		@Override
		public double getPerimeter() {
			return 2 * (length * width);
		}
		@Override
		public String description() {
			return "This is a Rectangle object. It has " + sides + "sides.; The area is"
					+getArea() + "and the perimeter is " + getPerimeter() + "." ;
		}
}
