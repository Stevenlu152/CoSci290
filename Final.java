/*
  Steven Lu
  Comp Sci 290 
  Final 
*/ 

public class Final{
  
  public static void main(String[] args){
    
    int[] number = new int[300];
    
    
    for(int i = 0; i < 14; i++)
    {
      number[i] = (int)(Math.random() * (14 - 0) + 1);
    }
       for(int i = 0; 1 < 14; i++)
       {
      System.out.println(number[i] + " ");
       }

     for(int i = 1; i < 14; i++) 
     {
      if (i % 2 != 0) 
      {
	      System.out.println(" odd : " + i);
	    }
     }
     for(int i = 1; i < 14; i++)
        {
            if(i%2==0)
            {
                System.out.print("even : " + i);
            }
        }   
    
    
      
  }

}