package inheritanceExample;

public class Parent extends GrandParents {
	


public String voice= "I am the Parent";
public final int age = 7;

public Parent (){
	//super();
	//System.out.println("Parent is born");
	
}
	
	public void speak() {
		System.out.println(voice);
		
	}
}

