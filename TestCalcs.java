public class TestCalcs
{
     public static void main (String[] args)
     {
double aD = 0.0;
double bD = 0.0;
int cI = 0;
int dI = 0;
byte eB = 0;
char fC = 0;

fC = 65535;
fC++; // adds 1 to value in fC, stores back to fC
dI = fC;
System.out.println ( dI );
System.out.println(aD + bD + cI + eB);
} }