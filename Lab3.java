/*

  Steven Lu
  Co sci 290 
  (no due date)
*/

public class Lab3{

  public static void main(String[] args){
    
    int minimum = 1; 
    int maximum = 50; 
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum >= 40){
      System.out.println("YOU GOT A FLARE AND KNIVES FOR HUNTING AND SIGNALING FOR HELP!");
    }
    else if(randomNum >= 30){
      System.out.println("YOU GOT A SPEAR AND FLINT N STEEL FOR FIRE!!");
    } 
    else{
      System.out.println("YOU GOT SOME RANDOM DUDE TRYING TO KILL YOU FOR FOOD");
    }
  
  }
}