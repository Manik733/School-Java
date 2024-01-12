
/* QandA – prompt the user for input (name & age), and display the name in uppercase
 *         and older age + 10 years
 * Author: Manik Singh (T00715263)
 */

import java.util.Scanner; // import class for console input

public class QandA {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in); // console input object
                                                 // declare storage for name & age input, and calculations
          String nameFirst = ""; // a String object for person's first name
          String nameFirstUpper = ""; // a String object for person's first name as UPPERCASE
          int age = 0; // an integer variable for person's age
          int olderAge = 0; // an integer variable for person's older age (in 10 years)
                            // display prompts, and input values
          System.out.print("What is your first name? ");
          nameFirst = scan.next(); // input single word (String) as the first name, and store
          System.out.print("How old are you? ");
          age = scan.nextInt(); // input single number as the age, and store
                                // adjust
          nameFirstUpper = nameFirst.toUpperCase(); // transform name to UPPERCASE
          olderAge = age + 10; // calculate: add 10 years to age, and store to olderAge
                               // output results
          System.out.println("Hello " + nameFirstUpper);
          System.out.println("You are " + age + " years old now, and " + olderAge + " in 10 years");

          scan.close(); // closes the scanner
     } // end of main()
} // end of class()
