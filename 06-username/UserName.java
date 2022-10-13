import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("What is your favorit number?");
    String favNum = s.nextLine();
    System.out.print("Are you Student and Tercher?");
    String role = s.nextLine();
    

    // test output
    if(role.equals("Student")) {
    System.out.println("Hello " + firstName + "" + initialize(lastName) + "" + favNum + "@nycstudents.net");
}
    else {
    System.out.println("Hello " + firstName + "" + initialize(lastName) + "" + favNum + "@schools.nyc.org" );
}

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
