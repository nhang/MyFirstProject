package shapeLib;

import inheritanceExample.Rectangle;

//public class Square extends Shape{
public class Square extends Rectangle {
	
	private double sideLength;

	
	public Square(double sideLength) {
		super(4,0);
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public double getPerimeter() {
		return sides * sideLength;
	}

	@Override
	public String description() {
		return "This is a Square object. It has " + sides + "sides.; The area is"
				+getArea() + "and the perimeter is " + getPerimeter() + "." ;
	}

}
