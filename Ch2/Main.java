package Ch2;

import java.util.Scanner;  // Import the Scanner class

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}


//if you want to use a try, catch block to get the error message example:
// public class Main {
//   public static void main(String[] args) {
//   	try
//     {
//       int[] myNumbers = {1, 2, 3};
//       System.out.println(myNumbers[10]);
//     } catch (Exception e) 
//     {
//       System.out.println(e.getMessage());
//     }
//   }
// }
