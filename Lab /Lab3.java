/*
 Steven Lu
 Co sci 290
 Lab 3
 1. Using if - else, create a scenario that sets up your character/user with random objects.1
 2. The random number generator
 
*/

public class Lab3{
  
    //entry point of applicatio
  public static void main(String[] args){
    
    //setting up random generator
  int minimum = 1;
  int maximum = 100;
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  //using if - else if - else to give user a random survival tool
  if(randomNum >= 90){
    System.out.println("You gain a fire starter and a spear!");
      }
  else if (randomNum <= 80 && randomNum >=70){
    System.out.println("You gain a Long fishing rod with worms!");
      }
  else{
    System.out.println("You found a useless partner!");
      } 
  }
}