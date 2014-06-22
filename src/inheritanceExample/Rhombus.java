package inheritanceExample;

import shapeLib.Shape;

public class Rhombus extends Shape {
	private double diagonal1; 
	private double diagonal2;
	
	

	public Rhombus(double diagonal1, double diagonal2) { 
		super(4);
			this.diagonal1 = diagonal1; 
			this.diagonal2 = diagonal2;
			
	}



	@Override
	public double getArea() {
		return (diagonal1 * diagonal2)/2;
	}
	
	
	@Override
	public String description() {
		return "This is a Rhombus. It has " + sides + "sides.; The area is"
				+getArea();
	}


	@Override
	public double getPerimeter() {
		return (diagonal1 + diagonal2)*2;
	}

public void resize(double newDiagonal1, double newDiagonal2) {
	this.diagonal1 = newDiagonal1;
	this.diagonal2 = newDiagonal2;
	
}



	}

