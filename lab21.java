/*
  Steven Lu
  Co sci 290
*/

public class Lab21{
  public static void main(String[] args){
    
    int[] single = new int[10];
    
    for (int i = 1; i <= 100; i++) {
	    single[(int)(Math.random() * 10)]++;
    }
      for (int i = 0; i < single.length; i++) {
	    System.out.println(i + "s: " + single[i]);
      }
  }
}