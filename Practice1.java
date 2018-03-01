/*
  Steven Lu
  Co Sci 290 
  
  Lab - comment every single line of code
  
  output; 
  
*/
import java.util.Scanner; //enables Java to use user inputs. 
public class Practice1{ //names the java profile. 
  
   //entry point of app 
  public static void main(String[] args){ //starting point of main method, datatype. 
    
    Scanner input = new Scanner(System.in); //allows the program to have user input
    
    int operand1; // allows the user to set a whole number for operand 1
    int operand2; //allows the user to assign a whole number to operand 2 
    
    System.out.println("Please enter a whole number. . ."); //It's a comment that tells the user to input a number 
    
    operand1 = input.nextInt(); //enjects operand1 to an equation to operand2 
    
    System.out.println("Please enter another whole number. . . "); //a comment that tells the user to input the second number for an equation
    
    operand2 = input.nextInt(); //enjects the assigned number to operand2  
    
    System.out.println("Let's do some basic math! \n"
                      + "Here are the numbers you chose. "); // a comment that makes the program comment,  
      
      System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2); // solves the equation. 
      System.out.println(operand1 + operand2); //checks the problem for the entry of addition 
      System.out.println(operand1 * operand2); //chedcks the problem for entry of multiplication 
      System.out.println(operand1 / operand2); // checks the problem for entry of division 
      System.out.println(operand1 - operand2); // checks the problem for entry of subraction. 
    
  }
}