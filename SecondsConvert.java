/* SecondsConvert - the purpose is to convert seconds to equivalent hours, minutes, and seconds,
 *  Author: Manik Singh (T00715263)
 */

import java.util.Scanner; // import class for console input

public class SecondsConvert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // console input object

        int inputSeconds, seconds, hours, minutes; // declare input objects for seconds, hours and minutes

        System.out.print("How many Seconds: "); // display prompts, and input values
        inputSeconds = scan.nextInt();
        seconds = inputSeconds; // calculate the time
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(); // display results
        System.out.printf("For the total seconds : %d \nThis equals: %d hours, %d minutes, %d seconds", inputSeconds,
                hours, minutes, seconds);

        scan.close(); // close scanner
    } // end of main()
} // end of class