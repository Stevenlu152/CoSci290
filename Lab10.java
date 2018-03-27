/*
  Steven Lu
  Co sci 290 
  Lab 10 
  
  I Steven Lu collaborted with Emmanuel M. 
*/

import java.util.Scanner; 
public class Lab10{
	public static void main(String[] args){

  Scanner input = new Scanner(System.in);


	  System.out.println("Enter three numbers ");
	  int Mola1 = input.nextInt();
	  int Mola2 = input.nextInt();
	  int Mola3 = input.nextInt();
  
	  int temp;
	  if (Mola2 > Mola1 || Mola1 > Mola3)
	  {
	    if (Mola2 < Mola1);
	    {
	      temp = Mola1;
	      Mola1 = Mola2;
	      Mola2 = temp; 
	    }
	    if (Mola3 < Mola1)
	{
	      temp = Mola1;
	      Mola1 = Mola3;
        Mola3 = temp;
	    }
	  }
	  if (Mola3 < Mola2)
	  {
	    temp = Mola2;
	    Mola2 = Mola3;
	    Mola3 = temp;
	  }
  
 System.out.println( Mola1 + " " + Mola2 + " " + Mola3 );
  
	}
}