/*
  Steven Lu
  Co Sci 290 
  Mid Term part 2 
  Modify your last lab to prompt the user to enter a FIVE-digit integer instead and determines whether it is a palindrome number. 
*/


import java.util.Scanner; 
public class MidTerm{

public static void main(String[] args){
  
int a = 0, b = 0, c = 0, d = 0, e = 0;

System.out.println("Give me 5 numbers:");
    
Scanner input = new Scanner(System.in);
  
int num = input.nextInt();
  
a = num % 10;
num /= 10;
                   
b = num % 10;
num /= 10;
  
c = num % 10; 
  num /= 10;

d = num % 10; 
  num /= 10;

e = num % 10;
  num /= 10; 
  
System.out.println(""+ a + b + c + d + e);
  
 int r,sum=0,temp;    
  int n=454;
  
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}   

