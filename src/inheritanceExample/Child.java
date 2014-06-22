package inheritanceExample;

public class Child extends Parent{

	/*
	 * It can declare new fields
	 * It can declare new methods
	 * It can override existing methods with new implementations
	 * 
	 * keyword: super
	 */

	public String giggle= "HAHAHA!!!";
	public Child() {
		//super(); //if this isn't here the computer would do it anyway
		System.out.println("Parent is born");
		voice= "WAHHHH!!";

	}
	
	

	//in order to oveeride a method
	//right click
	//go to source
	//go to override/implement methods


	

	
	public void brag (){
		System.out.println(netWorth + "in my bank account baby!!!");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
	}
}


