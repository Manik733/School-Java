/* FunnyName -  prompts and inputs for 4 Strings, and displays the total number of 
 * characters as well as showing the strings n reverse order
 *  Author: Manik Singh (T00715263)
 */

import java.util.Scanner;                           // import class for console input

public class RevStringList {
public static void main(String[] args) {            // console input object
                                                    // declare storage for words & total length input, and calculations
    String word1, word2, word3, word4;              // String objects for input words
    int totalLength=0;                              // an integer variable for total length of the input

    Scanner scan = new Scanner(System.in);          // console input object

    System.out.print ("Hi user, give me four words: ");         // display prompts, and input values
    word1 = scan.next(); 
    word2 = scan.next(); 
    word3 = scan.next(); 
    word4= scan.next(); 

    totalLength = word1.length() + word2.length() + word3.length() + word4.length();       // calculates the total length of the input

    System.out.printf("WIth a total of %d chars, in reverse they are: %s %s %s %s", totalLength, word4, word3, word2, word1);                                                                                // displays result

    scan.close();                                                                          // closes the scanner
   
}                                                                                          //end of main()
}                                                                                          //end of class
