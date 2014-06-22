package shapeLib;

public abstract class Shape {

	public final int sides;
	
	public Shape(int sides) {
		this.sides = sides;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter(); 
	public abstract String description();

	public double getDiagonal1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDiagonal2() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	public double diagonal1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
