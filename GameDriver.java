/* 
  Steven Lu
  Co sci 290
*/

import java.util.Scanner;
public class GameDriver{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int numberOfSurvivor = 0;
    String Survivor = "";
    int randomNum = 0; 
    int minimum = 2;
    int maximum = 20;
    
    System.out.println("oh");
    
      //story
      System.out.println("It was a bright and wonderful day, Father decided to take us all on a trip to fly to Hawaii.");
      System.out.println("It was the first time papa has taken us on a trip.....");
      System.out.println("It was a Thursday morning, we woke up at 2am to take a flight from LA to Hawaii, everything was going so well until we heard a loud boom...");
      System.out.println("A loud screech came through the plane speakers..We can barely makeout the pilots voice...");
      System.out.println("EMERGENCY LANDIND! Said the pilot, everyone panics to run towards to closes window but there was nothing but darkness...");
      System.out.println("I was sitting at a window seat staring outside till we landed but....We flew right into a mountain..");
   
    
    System.out.println("What? I don't see anyone... wait! I do see someone! Should I go see them?");
    System.out.println("Hey! hey! WAKE UP! ARE YOU ALIVE?!");
    
      System.out.println("WHAT'S WRONG ARE YOU ALIVE? ");
      System.out.println("I need to find some supplies maybe if I can scavage some stuff from the plane..");
    
      randomNum = minimum + (int)(Math.random() * maximum);
      if(randomNum < 3){
          System.out.println("YOU FOUND A FISHING ROD!");            
      }
    else if(randomNum<= 10 && randomNum >=5){
       System.out.println("YOU FOUND A FIRE STARTER!!");
    }
    else{
      System.out.println("YOU FOUND A PHYSCO THAT IS AFTER YOUR LIFE! RUNNN!");
    }
    
        System.out.println();
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