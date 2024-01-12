import java.util.Scanner;

public class SquareCalcs {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); 
        double length = 0, perimeter = 0, area = 0;   
System.out.print("Enter length : ");

length = scan.nextDouble();

perimeter = length*4;
area = length*length;

System.out.print ("With length of " + length + ", ");
System.out.println ("perimeter: " + perimeter + ", area: " + area);

scan.close();
    }
}
