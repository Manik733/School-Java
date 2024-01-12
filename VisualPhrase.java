/* VisualPhrase - An that displays the user’s input string in two (2) ways,
 * - diagonal form (see below), and
 * - staggered form (odd/even) on two lines
 *  Author: Manik Singh (T00715263)
 */

import java.util.Scanner;// import class for console input

public class VisualPhrase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// console input object
        String phrase = " ";// input phrase by user
        String even = " ";// string for characters at even index
        String odd = " ";// string for characters at odd index

        System.out.print("Enter a phrase: ");
        phrase = scan.nextLine();// asks the user for phrase
        System.out.println();
        for (int i = 0; i < phrase.length(); i++) {// for loop for displaying phrase in diagonal form
            for (int j = 0; j < i; j++) {// nested for loop for adding space
                System.out.print(" ");// displaying space
            } // nested for loop ends
            System.out.println(phrase.charAt(i));// displaying char
        } // for loop ends
        System.out.println();
        for (int i = 0; i < phrase.length(); i++) {// for loop for displaying phrase in straggered form
            if (i % 2 == 0) {// conditional statement to add characters to string based on even and odd
                even += phrase.charAt(i) + " ";
            } else {
                odd += " " + phrase.charAt(i);
            }
        } // for loop ends

        System.out.println(even);// diplaying set of characters at even index
        System.out.println(odd);// diplaying set of characters at odd index

        scan.close();// close the Scanner

    }
}
