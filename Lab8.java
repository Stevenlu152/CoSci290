/* 

  Steven Lu
  co sci 290 
  Lab8
  Group 1
*/

import java.util.Scanner; 
public class Lab8{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Trying to convert Celsius to Fahrenheit, so enter a Celsius");
    
    Double Celsius = input.nextDouble();
    
    Double Fahrenheit = ((9.0/5.0) * Celsius) + 32.0;
      
      System.out.println("The convertsion of Celsius to Fahrenheit " + Celsius + " is " + Fahrenheit);
  }

}