/*
  Steven Lu
  Co Sci 290 
  2/15/2018
*/ 

import java.util.Scanner;
public class Lab2{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int living = 0; 
    int lived = 0;
        System.out.print("oOoOOoOOo  o                o          `O     o      o \n"
                    + "     o     O                 O           o o  O      O  \n"
                    + "     o     o                 o           O    o      o  \n"
                    + "     O     O                 O           O    O      o  \n"
                    + "     o     OoOo. .oOo.       o     o     o O  o  .oOoO \n"  
                    + "     O     o   o OooO'       O     O     O o  O  o   O \n" 
                    + "     O     o   O O           `o   O o   O' O  o  O   o \n" 
                    + "     o'    O   o `OoO'        `OoO' `OoO'  o' Oo `OoO'o \n"
                                                       
                                                       
+ "OooOOo.   o                            .oOOOo.                       o    \n"
+ "O     `O O                            .O     o                      O     \n"
+ "o      O o                            o                             o     \n"
+ "O     .o O                            o                             O     \n"
+ "oOooOO'  o  .oOoO' 'OoOo. .oOo.       o         `OoOo. .oOoO' .oOo  OoOo. \n"
+ "o        O  O   o   o   O OooO'       O          o     O   o  `Ooo. o   o \n"
+ "O        o  o   O   O   o O           `o     .o  O     o   O      O o   O \n"
+ "o'       Oo `OoO'o  o   O `OoO'        `OoooO'   o     `OoO'o `OoO' O   o \n");
      
    
    System.out.println("HEY, HOW MANY DO YOU THINK SURVIVED");
      
    living = input.nextInt();
    
    System.out.println("HOW MANY FINGERS AM I HOLDING UP");
    
    living = input.nextInt();
    
    System.out.println("WRONG MY HANDS ARE GONE.....");
    System.out.println("My fingers....how many do I see?");
    
    lived = input.nextInt();
    
    System.out.println("This is bad...I think its infected...what number should I call?");
    
    lived = input.nextInt();
    
    System.out.println("yeah, perhaps i should try to call for help but i doubt there will be signal.");
    
      
  
  
  }
}