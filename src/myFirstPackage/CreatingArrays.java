package myFirstPackage;

import java.util.Random;

//First Problem
//public class CreatingArrays {
/*int totalScore = 0;
 int nof = 0;
 int nop = 0;

 public void firstArrayProblem () {

 int [] a = {50,65,75,50,70,85,90};

 for(int i=0; i <a.length; i++) {
 totalScore += a[i];


 if (a[i] >= 65) {
 nop++;
 }else {
 nof++;

 }	
 }
 System.out.println("nof:" + nof);
 System.out.println("nop:" + nop);
 System.out.println("totalScore/a.length:" + totalScore/a.length);
 }
 //Notes
 public void printArray1(){
 int[] arr= new int [1000000];

 int x;
 x=70;

 arr[0] = 70;
 arr[1] = 50;

 //for (init, cond; post){

 }
 }

 */

//Second Problem 
//Create an array of doubles
//write a method that subtracts each value of the array by 10, and prints out the remaining value of the element

public class CreatingArrays {
	public static void main(String args[]) {

		//Loops var = new Loops();
		//var.printFamilies();

		CreatingArrays creatingArrays = new CreatingArrays();
//		creatingArrays.printArrays();
//		creatingArrays.printTenNumbers();
//		creatingArrays.family();
//		creatingArrays.randomTemp();
//		creatingArrays.classwork();
		creatingArrays.printFamilies();
		creatingArrays.creating2DArrays();

	}



	public void printArrays() {
		double[] numberOfCookies = new double[2];

		numberOfCookies[0] = 10;
		numberOfCookies[1] = 20;

		System.out.println("cookies 0" + numberOfCookies[0]);

		for (int i = 0; i < numberOfCookies.length; i++) {
			System.out.println(numberOfCookies[i] - 10);
		}

	}
	// Third Problem

	/*
	 Create an array that holds a list of 10 Random numbers (1-100). Create a
	 method that iterates through the array and prints out the highest number.
	 Now create an array that prints out the lowest number.
	 */

	public void printTenNumbers() {
		int[] randomNumbers = new int[10];
		int max = 0;
		int min = 100;

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * (100));
			if( max < randomNumbers[i]){
				max = randomNumbers[i];
			}
			if( min > randomNumbers[i]){
				min = randomNumbers [i];
			}
			System.out.println(randomNumbers[i]);
		}
		System.out.println("The highest number is "+max);
		System.out.println("The lowest number is "+min);

	}

	/* Problem 4**
Create a string array that holds the following:
“John, 23yr old, male”
“Jane, 33yr old, female”
“Jacob, 55yr old, male”
“Jessie, 27yr old, female”
“Jordan, 77yr old, male”
“Julian, 23yr old, male”

Iterate through the array and print out how many males and females there are in this list

	 */

	public void family() {
		String[] Names = new String [6];
		Names [0] = "23yr old, male";
		Names [1]= "33yr old, female";
		Names [2]= "55yr old, male";
		Names [3]= "27yr old, female";
		Names [4]= "77yr old, male";
		Names [5]= "23yr old, male";



		int maleCount = 0;
		int femaleCount = 0;
		for (int i = 0; i < Names.length; i++) {
			if(Names[i].contains("female")){
				femaleCount++;
			} else if(Names[i].contains("male")){
				maleCount++;
			}
		}
		System.out.println("Female Count - "+femaleCount);
		System.out.println("Male Count - "+maleCount);

	}		

	/*
 Problem 5
Create an array of strings for 5 people’s first names. Create an equal size array for their last names
Write a method that concatenates each person’s first and last name
put the full name of each person in a separate array (create a new array)
iterate through your new array and print out each persons name if their name has less than 12 characters in it

	 */

	public void friends () {
		//this can be done using a loop
		String [] FirstName = new String [5];
		FirstName[0] = "Rima";
		FirstName[1] = "Tina";
		FirstName[2] = "Carla";
		FirstName[3] = "Angela";
		FirstName[4] = "Maria";

		String [] LastName = new String [5];	
		LastName[0] = "P";
		LastName[1] = "W";
		LastName[2] = "G";
		LastName[3] = "C";
		LastName[4] = "G";

		String [] fullNames = new String[5];
		fullNames[0] = FirstName[0] + LastName[0];
		fullNames[1] = FirstName[1] + LastName[1];
		fullNames[2] = FirstName[2] + LastName[2];
		fullNames[3] = FirstName[3] + LastName[3];
		fullNames[4] = FirstName[4] + LastName[4];


		int First = 0;
		int Last = 0;
		int Full = 0;

		int max = 0;
		int min = 12;

		for (int i = 0; i < fullNames.length; i++) {
			if(fullNames[i].length() < 12) {
				System.out.println(fullNames[i]);
			}
		}
	}


	/*Problem 7
Create an array that holds a list of 20 Randomly generated temperatures (int) between (80 -119). 
Create a method that iterates through the array and prints out how many heatwaves there were during this time
A heat wave consists of 3 or more days where the temp is above 90 
consecutive days can be created with boolean value. boolean is set to false. create an if statement to check... if (numberofheatwavedays >=3) 
IsItAHeatwave boolean= true, if (IsItAHeatWave){ , print out numberOfHeatwaves ++;
int numberOfHeatwaves=0; int numberOfHeatwaveDays= 0; 
	 */

	public void randomTemp () {
		int [] randomTemp = new int [20];
		int heatwaveTemperature = 90;
		int heatWaves = 0;
        int counter = 0;
		Random ranNum = new Random();
		//populat
		for (int i = 0;i < randomTemp.length; i++) {
			if(randomTemp[i] > 90) {
				counter++;
				if(counter >= 3) {
					heatWaves++;
					counter = 0;
				}
			}
			else {
				counter = 0;
			}
			
			

		}

		//80 + (int)(Math.random() * (119 - 80) + 1;



		//use random class to generate random method
		//generate random number and set it to index array
		//randomTemp[i] = ranNum.nextInt(39) + 80;


		//write a loop that checks if the current index's temp is greater than 90 degrees
		for (int i= 0; i <randomTemp. length; i++) {
			//randomTemp[i] = randomTemp > 90;		
		}

	}


	public void classwork ( ){
		//Create an array of anything that isnt an int
		//use the FOR - EACH loop to ITERATE through and print the ELEMENTS
		//edit the loop so that you make some sort of change within the loop 
		//print again and see what happens

		int [] var = {0,1,2,3,4,5};

		for (int i : var ) {
			System.out.println("We are printing out element" + i);
		}
	}


	public void classwork1 () {
		//String [][] multiArray = new String [5][4];

		//multiArray [0] = new String [5]; //
		//multiArray [1] = new String [4];

		//int [] a,b,c;// declares 3 separate ONE DIMENSIONAL arrays on a single line

		//int a[], b, c [][]; //(a) single dimension array
		// (b) is just an integer
		// (c) TWO DIMENSIONAL array
		//THE FOLLOWING WILL WORK, BUT IS BAD PRACTICE
		//int [] a, b[]; //(a) is a single dimension array
		//(b) 2 dimensional array



	}

	//2 dimensional array
	//each array will hold an array of assorted first Names
	//going to give each array inside the 2d array a last name for he entire family

	public void printFamilies() {
		String [][] families = {{"Bryan"}, {"Byron"}, {"Ryan"}, {"Cyan"}
		, {"Sam the man", "The Sam Man"},
		{"Carlos the Great", "King William"} };
		for (int i = 0; i < families.length; i++) {
			for (int x = 0; x<families [i].length; x++) {
				System.out.println( families[i][x] + getFamilyName(i));
			}
		}
	}
	public String getFamilyName(int index) {

		switch(index) {
		case 0:
			return "Williams";
		case 1: 
			return "Copper";
		case 2: 
			return "Clark";
		default:
			return "We dont know your last name";


		}
	}

//Create a 2D array of your choice
//and initialize all the elements using a loop
//Extra credit (smarty pants), make a 2D array of BankAccounts

public void creating2DArrays () {
	int [][] cupcakes = new int[5][2];
	
	int count = 0;
	
	for (int i = 0; i < cupcakes.length; i++) {
		for (int x = 0; x<cupcakes [i].length; x++) {
			cupcakes[i][x] = count++;
			System.out.println( cupcakes[i][x] + cupcakeType(i));
		}
	}
	}
    
	public String cupcakeType(int index) {

		switch(index) {
		case 0:
			return "Chocolate";
		case 1: 
			return "Vanilla";
		case 2: 
			return "Strawberry";
		case 3: 
			return "Red Velvet";
		default:
			return "Flavor of the Day";
	}
}
}