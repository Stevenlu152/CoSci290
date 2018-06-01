/*
Steven Lu
Co Sci 290 

	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code and/or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	NOTE: Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
import java.util.Scanner; // import scanner
public class Lab12
{ //this is the name of the file. 

	public static void main(String args[])
	{ //insert of main method

	  Scanner input = new Scanner(System.in); //input Scanner
	  Double num; //intalizing int

	  //statement to address or let the programmer runner know what the program does
	  System.out.println("This program will check if a number"
	    +  "is even or odd..."); 
	  
	  System.out.println("Please enter in a whole number...");
	  //Doubles the inputted num
	  num = input.nextDouble(); 
	  //divides the num by 2 and if it's 0 it becomes an even num 
	  if(num % 2 == 0)
	  {
    	System.out.println("The number " + num  + " is even...");
    }
	  //every number that doesnt equal 0 remainder is odd 
	  else
	    {
	    System.out.println("The number " + num  + " is odd...");
	    }
	}
}