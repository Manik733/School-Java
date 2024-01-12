import java.util.Scanner;

public class CalcPi {
    
public static void main (String[] args)
{
    Scanner scan = new Scanner(System.in);
int x = 0; // number of terms (loops)
double pTemp = 0.0; // intermediate summation result
double pFinal = 0.0; // final approximate value
System.out.print("Enter x: ");
x = scan.nextInt();
for (int n=0; n<=x; n++) // loop n from 0 to x (inclusive)
{
pTemp = pTemp + ( Math.pow(-1,n) / ( 2*n + 1 ) ); // summation formula
}
pFinal = 4 * pTemp; // final calculation: 4 * summation
System.out.println ("PI: " + pFinal );
System.out.println("Math PI: " + Math.PI);
scan.close();
}// end of main()
} // end of class

