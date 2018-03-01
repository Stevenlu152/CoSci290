/*
  Steven
  Co Sci 290
  
  Demo on the String Class
*/
import java.util.Scanner;
public class TestStrings{

  //main mathod
  public static void main(String[] args){
  
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    //ask the user a question  

    //answer = answer.toLowerCase();
    
    /*
      impose some rules on user input
      name.length() - gives a int of how many characters the String is long
    */ 
   

    
    int nameLength = 0;
    String answer = "";
    boolean flag = false;
    
     //example of a while loop    
    while(answer.length() < 2){
      System.out.println("What is your name?")
}
    //get answer from console
    String answer = input.next();
    
      if(answer.length() < 2){
        System.out.println("Please enter in a name that is at least"
                           + "two characters long");
      }
    else{//name is at least 2 characters
      //check if name contains letters 
        
     //for example. go through each letters in the name "Logan"
     //name.CharAt(0) to look at the character index 0 
      
      //use a for-loop because we know how many letters it has
      for(int index = 0; index < answer.length(); index ++){
        
          //check if the character is a letter 
        if(isLetter(answer.CharAt(index))){ //if it's not a letter
          flag = true; 
          break; //gets out of current loop
          
          
        }
        }
      }
    nameLength = anwser.length();
    
    } //end while loop
    /* 
    when you want to code to run at least once, use a do-while loop
      do{
        the body with code. 
        . . . 
      
      }while(some condition)
    
    /*
    answer . toLowerCase() - makes all letters lowercase
    answer . toUppercase() - makes all letters uppercase 
    answer . equals("some other string") - checks if two Strings are exactly the same 
    answer . equalsIgnoreCase("n") - checks if two Strings are equal regardless of case.
    */
    
    //check if answer is spefically yes or no
    if(answer.equalsIgnoreCase("no")){ //"no" != "No"
        System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }
    
  }
}