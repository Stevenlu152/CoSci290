/*
  Steven Lu
  Co Sci 290 
  Mid Term part 2 
  Modify your last lab to prompt the user to enter a FIVE-digit integer instead and determines whether it is a palindrome number. 
  
  Professor Tuy helped me with correcting the code. 
*/


import java.util.Scanner; 
public class MidTerm{

public static void main(String[] args){
  
int last = 0, secondLast = 0, thirdlast = 0, middle = 0, third = 0, second = 0, first = 0;

System.out.println("Give me 7 numbers:");
    
Scanner input = new Scanner(System.in);
  
int num = input.nextInt();
  
last = num % 10;
num /= 10;
                   
secondLast = num % 10;
num /= 10;
  
thirdlast = num % 10; 
  num /= 10;

middle = num % 10; 
  num /= 10;
  
third = num % 10; 
  num /= 10;

second = num % 10;
  num /= 10;
  
first = num % 10;
  num /= 10;
  
System.out.println(""+ last + secondLast + thirdlast + middle + third + second + first);
  
 /*int r,sum=0,temp;    
  int n=454;
  
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  */
  
  
  if(first==last && second == secondLast && third == thirdLast)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
   
}  
}   

