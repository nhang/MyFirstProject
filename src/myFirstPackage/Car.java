package myFirstPackage;

public class Car {
	public String carType;
	public int yearMade = 1983;
	public int tires = 4;
	public int acceleration = 5;
	public int currentSpeed = 0;
	public int decceleration = 10;



	public void setCarType(String name) {
		carType = name;

	}
	public void setYearMade(int year) {
		yearMade= year;


	}

	public void setAcceleration(int speed) {
		acceleration = speed;
	}


	public void accelerate() {
		currentSpeed += acceleration;
		System.out.println(currentSpeed);

	}

	public void deccelerate() {
		if (currentSpeed >= acceleration) {
			currentSpeed -= acceleration;
		} else {
			currentSpeed=0;
			System.out.println("current speed is 0, you cannot deccelerate anymore");
		}

		System.out.println("current speed is 0, you cannot deccelerate anymore");

	}


}





