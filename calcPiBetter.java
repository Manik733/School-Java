import java.util.Scanner;

public class calcPiBetter {
    
public static void main (String[] args)
{
    Scanner scan = new Scanner(System.in);
int x = 0; // number of terms (loops)

double pFinal = 0.0; // final approximate value
System.out.print("Enter x: ");
x = scan.nextInt();
for (int n=0; n<=x; n++) // loop n from 0 to x (inclusive)
{
pFinal= pFinal + ( (1/Math.pow(16.0, n))*(4.0/(8*n+1)- 2.0/(8*n+4)- 1.0/(8*n+5)-1.0/(8*n+6))); // summation formula
}
System.out.println ("PI: " + pFinal );
System.out.println("Math PI: " + Math.PI);
scan.close();
}// end of main()
} // end of class
