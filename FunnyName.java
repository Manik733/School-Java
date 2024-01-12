/* FunnyName - the purpose is to prompt the user for their full name and performs some funny manipulations
 *  Author: Manik Singh (T00715263)
 */

import java.util.Scanner; // import class for console input

public class FunnyName {
    public static void main(String[] args) {

        String name, mut1, mut2, mut3, mut4, mut5; // declare string objects for name and different mutations

        Scanner scan = new Scanner(System.in); // console input object
                                               // display prompts, and input values
        System.out.print("What is your name? ");
        name = scan.nextLine(); // input String as the full name, and store

        mut1 = name.toLowerCase(); // converts the input to UPPERCASE
        mut2 = name.toUpperCase(); // converts the input to lowercase
        mut3 = mut2.replace("A", "@"); // replaces characters in the input
        mut4 = mut3.replace("E", "#");
        mut5 = mut4.replace("I", "%");

        System.out.printf("Name fun: %s and %s and %s ", mut1, mut2, mut5); // displays results
        scan.close(); // closes the scanner
    } // end of main()
} // end of class
