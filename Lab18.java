/* 
  Steven Lu
  Co sci 290 
  Lab 18 
  John and I worked together on this lab. 
  
*/ 

public class Lab18
{
  public static void main(String[] args)
  {
    
    int i;
    int counter = 0;
    
    for(i = 100; i <= 1000; i++)
    {
      
      if(i % 5 == 0 && i % 6 == 0){
        counter++;
        System.out.print( i + " ");
       
        if(counter % 10 == 0){
          System.out.println();
        }
       }
    }
  }
}
