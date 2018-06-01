/*
  Steven Lu
  co sci 290 
  Lecture : 
  introduction to methods
   lab 13: 
    finish the multiply and division methods
    
*/ 

public class Lab13
{
  
  // start of program
  public static void main(String[] args)
  {
   
    //declare variables 
    int a = 1;
    int b = 3;
    int c = 0;
    int d = -5;
    
    System.out.println("Operation on a = " +  a + " and B = " + b + " : ");
    System.out.println("addition = " + add(a, b)); 
    System.out.println("Subtraction = " + subtract(a, b));
    System.out.println("Multiply = " + multiply(a,b));
    System.out.println("Divide = " + divide(a,b));
    
    System.out.println("Operation on c = " +  c + " and d = " + d + " : ");
    System.out.println("addition = " + add(c, d)); 
    System.out.println("Subtraction = " + subtract(c, d));
    System.out.println("Multiply = " + multiply(c,d));
    System.out.println("Divide = " + divide(c,d));
    
  } //end of main methods

  
  //this cusotom method adds two integers,, int always gives something back in method and 
  //                                       if void is in the method there is nothing returned
  public static int add(int num1, int num2)
  {
    
    //declaring varibles; intalizing sum to equal 0
    int sum = 0;
    
      //add num1 and num2 and assign to sum
      sum = num1 + num2; 
    
      //return sum of num1 and num2
    return sum;
  }//end of add 
  
    public static int subtract(int num1, int num2)
    {
      //declare varibles
      int difference = 0; 
      
      //subtract num1 by num2 
      difference = num1 - num2;
      
      //return difference of num1 and num2
      return difference; 
    }
  //custom method 
  public static int multiply(int num1, int num2)
  {
     //instalizing or delcaring varibles
    int Zeno = 0;
    
    //multiply num1 and num2 to get Sum
    Zeno = num1 * num2;
      //return Sum of num1 and num2 
      return Zeno;
    
  }
  //custom method 
  public static int divide(int num1, int num2)
  {
    //instalizing or delcaring varibles
    int Zero = 0; 
    //divide num1 and num2 
    Zero = num1/num2;
     //return Sum of num1 and num2 
    return Zero;
  }
   
  
 
}//end of class


// tea party codes 
// public int teaParty(int tea, int candy) {
//  if(tea<5 || candy<5)
//  return 0;
//  if(tea>=candy*2 || candy>=tea*2)
// return 2;
//  if(tea>=5 && candy>=5)
//  return 1;
//  else
//  return 0;

//public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  //if(isAsleep == true)
  //return false;
  //if(isMorning == true && isMom == true)
  //return true; 
  //if(isMorning == false || isMom == true)
  //return true;
  //else
  //return false; 
