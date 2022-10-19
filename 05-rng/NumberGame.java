
/**
 * Write a description of class NumberGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    Random r= new Random();
    
    System.out.println("What game mode?\nEasy\nMedium\nHard");
    String mode = s.nextLine();
    mode = mode.toLowerCase();
   
    
    int maximum;
    if(mode .equals("easy")){
        maximum = 10;
    } // end if statement
    else if(mode .equals("medium")){
        maximum =50;
    } // end else if statement
    else{
        maximum =100;
    } // end else
        
    Scanner in =new Scanner(System.in);
    System.out.println("Im thinking of a number from 1-100");
    int random = (int)(Math.random() * 100);
    if (true){
      int guess = in.nextInt();
      if (guess==random){
        System.out.println("You guessed correctly!");
      } else { 
        System.out.println("The number was " + random); 
        System.out.println("You were off by " + (random-guess)); 
    }
    }
    } // end of mathod
} // end class
