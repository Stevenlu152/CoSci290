/*
  Steven Lu
  Co sci 290
  
  Testing datatypes and input from the user
  
*/
import java.util.Scanner; //is a Java object that allows you take user input
public class TestInput{

  //main method - starting point of application
    public static void main(String[] args){
      //datatype varibleName = expression
      //1. Identifier can only tart with a letter, _, or $
      //2. Indentifier with multiple words are camelCased
      //e.g. - numer0fStudents, name, interestRate, 
      
      //primititive datatypes (the only ones we're using in this class)
      //int - interger - whole number => 3, 420, -69
      //double - decimals number => 3, 33, 0 , 2, 0.3333, -6.969
      //char - single character inside single quotations => "3", "!", " "
      //boolean - true or false => true, false
      
      //object/reference dayatypes 
      //String - characters surrounded with oduble quotations => "wsgfjkas", cat "3"
      /*There are other object in java that come with Java and that are custom
         => Objects/Class that comes with Java; Scanner, System, etc. Objects
         => Customer classes; Zombie, SpaceInvader, Person, etc.Customer
     */
      
      final double PI_VALUE = 3.1415; //constants are all capital, multiples of words seperated by underscores.
      int numberOfStudents = 29;
      double avgGPA = 3.78;
      String name = "";
      boolean gameOver = false; //or true
      Scanner input = new Scanner(System.in);
      int age = 0; 
      
      System.out.println("Hello, give me your name;  "); 
      
      name = input.next(); //.next() is for String types
      //name input.next();
      
      System.out.println("Hi " + name);
      
      System.out.println("How old are you?");
      
      age = input.nextInt(); //.next()is for int types
      
      System.out.println("You are " + age + "years old!"); 
      
      /*
        Arithemetic Operators
        +  addition
        - Subtraction 
        * Multpiliction
        / division 
         = asignment operator, equals
         
         Math operation follow the same order of operation as in Math () exponents, mupltiplication OR division, addition or subtraction from left to right. 
        */
      int month = age * 12; 
      int days = age * 365;
      int hours = days * 24; 
      
      System.out.println("You are " + month + "Month old Or" + days + "days old OR"
                         + hours + "hour old!"); 
      
      //double for user input is input.nextDouble();
      //
      
    }
}