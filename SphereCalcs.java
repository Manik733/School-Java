import java.util.Scanner;

public class SphereCalcs {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); 
        double radius = 0, volume = 0, area = 0; 
        
        System.out.println("Calculate the Surface area and Volume of a Sphere");
        System.out.println();
        System.out.print("Enter radius of Sphere : ");

radius = scan.nextDouble();

volume = 4.0/3*Math.PI*Math.pow(radius,3);
area = 4*Math.PI*Math.pow(radius,2);


System.out.printf ("With radius of %,.2f , Volume = %,.2f and Surface Area = %,.2f", radius, volume, area);


scan.close();
    }
}
