/*
  Steven Lu
  Co sci 290 
  Quiz 4a
*/

public class Quiz4a{
  
  public static void main(String[] args){
    
	  float a, b;
	  System.out.println("a b  pow(a, b)"); //displays the tables a , b 
	  a = 1; //sets the value of A
	  b = 2; //sets the value of B 
    System.out.println((int)a + " " + (int)b + "  " + (int)Math.pow(a, b));  //cast from float to int
	  a++; //Increment of one 
	  b++; //Increment of one
    System.out.println((int)a + " " + (int)b + "  " + (int)Math.pow(a, b)); //cast from float to int
	  a++; //Increment of one 
	  b++;//Increment of one 
	  System.out.println((int)a + " " + (int)b + "  " + (int)Math.pow(a, b)); //cast from float to int
	  a++;//Increment of one 
	  b++;//Increment of one 
	  System.out.println((int)a + " " + (int)b + "  " + (int)Math.pow(a, b)); //cast from float to int
	  a++;//Increment of one 
    b++;//Increment of one 
    System.out.println((int)a + " " + (int)b + "  " + (int)Math.pow(a, b)); //cast from float to int
	}
}