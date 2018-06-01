/* 
  Steven Lu
  Co Sci 290 
  Lab7
*/
import java.util.Scanner;
public class Lab7B{

  public static void main(String[] args){
    
  System.out.println(
 "   _  _  _                                                                                       _                                                         _   \n"
+ " _ (_)(_)(_) _                                                                                   (_)                                                       (_) \n"
+ "(_)         (_)          _       _  _             _  _  _                  _  _  _  _            (_) _  _  _              _  _  _  _               _  _  _ (_) \n"
+ "(_)                     (_)_  _ (_)(_)           (_)(_)(_) _             _(_)(_)(_)(_)           (_)(_)(_)(_)_           (_)(_)(_)(_)_           _(_)(_)(_)(_) \n"
+ "(_)                       (_)(_)                  _  _  _ (_)           (_)_  _  _  _            (_)        (_)         (_) _  _  _ (_)         (_)        (_) \n"
+ "(_)          _            (_)                   _(_)(_)(_)(_)             (_)(_)(_)(_)_          (_)        (_)         (_)(_)(_)(_)(_)         (_)        (_) \n"
+ "(_) _  _  _ (_)           (_)                  (_)_  _  _ (_)_             _  _  _  _(_)         (_)        (_)         (_)_  _  _  _           (_)_  _  _ (_) \n"
+ "   (_)(_)(_)              (_)                    (_)(_)(_)  (_)           (_)(_)(_)(_)           (_)        (_)           (_)(_)(_)(_)            (_)(_)(_)(_)");

    int randomNum = 0; 
    int minimum = 2;
    int maximum = 20;
    int response = 0; 
    Scanner input = new Scanner(System.in); 
    
    System.out.println("I wonder if anyone is alive? \n"
                      + " wait a second, I see someone... \n"
                      + "Should I go to him/her? \n");
    System.out.println("press 1 for yes and press 2 for no");
      
   response = input.nextInt();
     
  if(response == 1){ 
    System.out.println("OH SHIT, IT'S A NAKED MAN!");
  }
  if(response == 2){
    System.out.println("I ran passed the man that stared me in the eyes.");
  }
    
    System.out.println("I saw the plane that crashed into the forest. \n" 
                       + " should I go into the plane for supplies?"); 
      
   if(response == 1){
     System.out.println("Yes! I found some crates full of first aid supplies, food, and some clothes for the naked man!");
   }
   if(response == 2){
     System.out.println("Phew! the plane probably didnt have anything anyways. But luckly I found this long stick that can be used like a spear or fishing rod!");
   }
    
    System.out.println("I see a plane! It's close to the ground! Should I shout?!");
    
    if(response == 1){
      System.out.println("phew, Good thing the supplies we had came with a flare! The plane is coming this way!");
    }
    if(response == 2){
      System.out.println("HEY! HEY! HEY! *LOUD POP SOUND* WHAT WAS THAT?!");
    }
    
    System.out.println("The plane is coming this way! Should I wait?");
    
    if(response == 1){
      System.out.println("I'm going to use the fire to guide the plane around to a safe landing spot! ");
    }
    if(response == 2){
      System.out.println("THE PLANE FLEW OVER ME AND THE GUY IS MISSING!? I'M RUNNING TO THE PLANE FOR SUPPLIES!");
    }
    System.out.println("The plane landed! should I get in?");
      
     if(response == 1){
       System.out.println("Thank god! We're safe!");
     }  
     if(response == 2){
       System.out.println("The plane flew off without me...BUT THE GUY ON THE GROUND IS ON THE PLANE WITH THE SUPPLIES!");
     }
    
    System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                     + "  ___    ____                                                                   \n" 
                     + " |   |  |    |                                                                  \n" 
                     + " |___| |    _|                                                                  \n" 
                     + "  ___  |   |                                                                    \n" 
                     + " |   | |   |                                                                    \n" 
                     + " |___| |   |_                                                                   \n" 
                     + "        |____|                                                                  \n");
     
    
  }
}