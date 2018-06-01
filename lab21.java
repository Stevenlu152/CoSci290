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

//7-12

import java.util.Scanner;
public static void main(String[] args) {
	  Scanner input = new Scanner(System.in)
	  int[] numbers = new int[10];

	  System.out.print("Enter ten numbers: ");
	  for (int i = 0; i < numbers.length; i++)
	    numbers[i] = input.nextInt();
	
       for (int e: numbers) {
	    System.out.print(e + " ");
	  }
	  System.out.println();
	}

	public static void reverse(int[] list) {
	  int temp;
	  for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
	    temp = list[i];
	    list[i] = list[j];
	    list[j] = temp;
	  }
	}
}

