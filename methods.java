/*Methods - Testing and calling 4 methods in a single application
 * Author: Manik Singh (T00715263)
 */

import java.util.Scanner; // import class for console input

public class methods {
    public static void main(String[] args) {

        int count = 4;// an integer variable for count
        printHellos(count); // display 4 "Hello World #" messages
        printHellos(2); // display 2 "Hello World #" messages
        printHellos(0); // display 0 "Hello World #" messages, so display nothing

        System.out.println();

        String src = "Chocolate Cake!"; // the source string, to be reversed
        String rev;
        rev = reverse(src); // call to reverse the string
        System.out.println(rev);
        System.out.println(reverse("Bob Smith").toUpperCase()); // reverse Bob Smith
        System.out.println(reverse("")); // reverse of an empty string is an empty string
        System.out.println(reverse("radar")); // reverse a palindrome -- no change!

        System.out.println();

        double cost = 0.0, grade = 0.0; // declare input objects for cost and grade
        cost = inputDouble("What is the item cost $"); // display prompt, input cost value
        System.out.printf("Cost is $%.2f\n", cost); // display cost
        grade = inputDouble("Student grade: "); // display prompt, input grade value
        System.out.println("Grade: " + grade); // display grade

        System.out.println();
        
        double res = 0.0;// a double variable for calculation of PI
        res = calcPI(1); // approximate PI to 1 term:
        System.out.println(res); // calculations for PI
        System.out.println(Math.PI);
        System.out.println(calcPI(0));
        System.out.println(calcPI(5));
        System.out.println(calcPI(9));
        System.out.println(calcPI(10));
    } // end of main()

    public static void printHellos(int n) { // method for printHellos()
        for (int i = 1; i <= n; i++) { // loop from 1 to n, displaying "Hello World #" each time
            System.out.println("Hello World " + i);
        }
    } // end of printHellos()

    public static String reverse(String str) { // method for reverse()
        String ret = ""; // the string returned
        for (int i = str.length() - 1; i >= 0; i--) { // loop from end of the string to the beginning
            ret = ret + str.charAt(i); // formation of reversed string
        }
        return (ret);// return the String
    }// end of reverse()

    public static double inputDouble(String prompt) { // method for inputDouble()
        double ret = 0; // the double value returned
        Scanner scan = new Scanner(System.in); // console input object
        System.out.print(prompt); // display the prompt
        ret = scan.nextDouble();
        scan.close();
        return (ret); // return the input double
    }// end of inputDouble()

    public static double calcPI(int x) { // method for calcPI()
        double ret = 0; // the double value returned
        for (int n = 0; n <= x; n++) { // loop n from 0 to x (inclusive)
            ret = ret + ((1 / Math.pow(16.0, n))
                    * (4.0 / (8 * n + 1) - 2.0 / (8 * n + 4) - 1.0 / (8 * n + 5) - 1.0 / (8 * n + 6))); // summation
                                                                                                        // formula

        }
        return (ret);// return the double
    }// end of calcPI()

}// end of class
