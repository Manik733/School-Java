/* GallonsToLitres - converts user input of US gallons to equivalent litres
*/
import java.util.Scanner; // use Scanner class for console input
public class GallonsToLitres
{
 public static void main (String[] args)
 {
 Scanner scan = new Scanner (System.in); // attach input to console (System.in)
 double inputGallons = 0.0; // gallons value provided by user
 double resultLitres = 0.0; // calculated litres value

 System.out.println ("Gallons to Litres Converter");
 System.out.print ("How many gallons? ");
 inputGallons = scan.nextDouble(); // get gallons from user

 resultLitres = inputGallons * 3.78541; // calc gallons to litres (1 gal = 3.78541 lt)

 // display result, \t (tab) used to help format output
 System.out.printf ("Converted: %.5f gal \t = %.5f litrne ", inputGallons, resultLitres);
 
 scan.close();
 } // end of main()
} // end of class