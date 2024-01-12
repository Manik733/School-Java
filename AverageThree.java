import java.util.Scanner; // include Scanner class for console input
/* AverageTwo - calculate the average of two values input by the user.
*/
public class AverageThree
{
 public static void main (String[] args)
 {
 Scanner scan = new Scanner (System.in); // attach scanner to System.in for console input

 double val1 = 0, val2 = 0, val3 = 0; // input values from user
 double average = 0.0; // calculated average

 // input from console (the two values from the user)
 System.out.print ("Enter two values (space between): ");
 val1 = scan.nextDouble(); // input first value
 val2 = scan.nextDouble(); // second value
 val3 = scan.nextDouble(); // third value

 // calculate average
 average = (val1 + val2 + val3) / 3; // formula for average

 // display results
 System.out.println ("The average of");
 System.out.println ("\t" + val1);
 System.out.println ("and");
 System.out.println ("\t" + val2);
 System.out.println ("and");
 System.out.println ("\t" + val3);
 System.out.println ("is \t" + average);


 scan.close();
 }// end of main()
}// end of class
