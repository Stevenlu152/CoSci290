/* 
  Steven
  Co sci 290 
  Lab 9
*/


import java.util.Scanner;
public class Lab9{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); 
    
    int number = 0; 
    
    System.out.println("Type in a number that is between 0 - 10000 ");
    
    number = input.nextInt();
    
    int potato = number % 10; 
      number /= 10; 
    
    
    
    int GuardianAngel = number % 10;
      number /= 10;
    
    
    int IMTIRED = number % 10; 
      number /= 10; 
    
    System.out.println(potato + GuardianAngel + IMTIRED); 
    
    
  
  
  }
}