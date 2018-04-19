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
    
    System.out.println("Operation on a = " +  a + " and B = " + b + " : ");
    System.out.println("addition = " + add(a, b)); 
    System.out.println("Subtraction = " + subtract(a, b));
    System.out.println("Multiply = " + multiply(a,b));
    System.out.println("Divide = " + divide(a,b));
    
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
  public static int multiply(int num1, int num2)
  {
    int Zeno = 0;
    
    Zeno = num1 * num2;
      
      return Zeno;
    
  }
  
  public static int divide(int num1, int num2)
  {
    int Zero = 0; 
    
    Zero = num1/num2;
    
    return Zero;
  }
   
  
 
}//end of class