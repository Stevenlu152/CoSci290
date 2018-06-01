/*
  Steven Lu
  Co Sci 290 
  
*/



public class Lab20{

public static void main(String[] args){
  int[] numbers = new int[5];
  
   numbers[0] = 3;
    numbers[1] = 6;
    numbers[2] = 23;
    numbers[3] = 92;
    numbers[4] = 37;
  
  numbers[0] = 13;
  numbers = new int[17];
  numbers[4] = 5;
  
  for(int i = 0; i < 17; i++){
      numbers[i] = (int)(Math.random() * 100) + 1;
    }
  
  
  for(int i = 0; i < 17; i++){
      System.out.print(numbers[i] + " ");
 
}
}
}