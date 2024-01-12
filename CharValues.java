import java.util.Scanner; // import Scanner for console input
/* CharValues - display the Unicode/ASCII values for each character in a string of 3 characters.
* Unicode - "unified" coding scheme
* ASCII - American Standard Code for Information Interchange (a 'subset' of Unicode)
*/
public class CharValues
{
 public static void main (String[] args)
 {
 Scanner scan = new Scanner (System.in); // scanner for console input

 String input = ""; // input string (of 3 chars)

 char ch1 = 0, ch2 = 0, ch3 = 0; // chars extracted from string
 int un1 = 0, un2 = 0, un3 = 0; // Unicode/ASCII values for each ch value

 System.out.print ("Input a string of exactly 3 symbols: ");
 input = scan.nextLine(); // input ALL characters until user presses ENTER

 // extract and convert characters
 ch1 = input.charAt(0); // extract first char (index 0)
 ch2 = input.charAt(1); // extract second char (index 1)
 ch3 = input.charAt(2); // extract third char (index 2)

 un1 = (int)ch1; // convert from char to numeric (integer)
 un2 = ch2; // actually, char datatype is a numeric
 un3 = ch3; // auto promoted, so casting (int) not necessary

 System.out.println ("String: " + input); // original string

 System.out.println ("Symbols: " + ch1 + ", " + ch2 + ", " + ch3); // with concatenation
 System.out.printf ("Symbols: %c, %c, %c \n", ch1, ch2, ch3); // with formatting

 System.out.println ("Unicode: " + un1 + ", " + un2 + ", " + un3); // with concatenation
 System.out.printf ("Unicode: %d, %d, %d Decimal\n", un1, un2, un3); // with formatting
 // with formatting in Hexdecimal
 System.out.printf ("Unicode: %x, %x, %x Hexadecimal \n", un1, un2, un3);

 scan.close();
 }// end of main()
}// end of class