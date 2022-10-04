 
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Date
{
    public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    
    System.out.print("What day of the week is it?");
    String day = s.nextLine();
    
    System.out.print("What month is it?");
    String month = s.nextLine();
    
    System.out.print("What year is it?");
    String year =s.nextLine();
    
    System.out.print("What day of the month is it?");
    String num= s.nextLine();
    
    System.out.println("American format:" +day+", " +month+" " +num+", "+year);
    System.out.println("European format: " +day+" " +num+" " +month+" "+year);   
    }// end of main method
    
    
} // end of date class

