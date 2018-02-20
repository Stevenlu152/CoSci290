/* 
  Steven Lu
  Co sci 290 
  
  Topics: 
   - multi-way if-else
   -logical operators
   -symbolic logic
*/
import java.util.Scanner;
public class TestLogic{ 
  
//entry point of application
  Scanner input = new Scanner(System.in);
  
  //prompt the user to enter in a Grade
  public static void main(String[] args){
    
    //setting up Scanner for user input
    int grade = 90;
    
    //simple if
    if(grade >= 90){
        System.out.println("A")   
    }
  else{
      System.out.println("grade is an A");
    }
    //multi if-else-elseif
    if(grade >= 90){
       System.out.println("A");
    }
    else if(grade >= 80){
        System.out.println("B");
    }
    else if(grade >= 70){
        System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    /* Logical operators 
    ! - NOT
    != - NOT equal to
    == - NOT equal to?
    && - AND
    || - OR 
    */
    
    //using if-else. write code that checks whether
    //a student grade is good, average, or bad
    if(grade >= 80){
      System.out.println("This is a good grade.");
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average.");
    }
    else{
      System.out.println("This is a bad grade");
      
    }
    }
    
  }
