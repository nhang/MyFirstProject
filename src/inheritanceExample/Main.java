package inheritanceExample;

import shapeLib.Circle;
import shapeLib.Shape;
import shapeLib.Square;
import shapeLib.Triangle;
import inheritanceExample.Child;
import inheritanceExample.Parent;


public class Main {
	
	public static void main (String args []) {
		
		Shape s = new Square(456.456d);
		Shape s1 = new Circle(34534.3453);
		Triangle s2 = new Triangle(3,2d);
		Shape s3 = new Rectangle(4,3d);
		Shape s4 = new Square(4.0d);
		Rhombus s5 = new Rhombus(3,6d);
		Shape s6 = new Trapezium(3,2,4d);
		
		s5.resize (5,7d);
		s2.resize (2,4d);
		
		System.out.println(s.description());
		System.out.println(s1.description());
		System.out.println(s2.description());
		System.out.println(s3.description());
		System.out.println(s4.description());
		System.out.println(s5.description());
		System.out.println(s6.description());
		
		//Parent p;
		//first child is the static type
		//second child is the dynamic type
		//Child c = new Child();
		//p = c; //this will work
		//c = (Child) p; //this wont work
		
		//this will be false if p is null or
		//doesnt reference/subclass a Child 
		
		//if(p instanceof Child) {
			//p = (Child) c;
		}
		//Child c = new Child();
		//c.childMethod(); //will work
		
		//Parent p = new Child();
		//p.childMethod(); //compile time error
		
	}

