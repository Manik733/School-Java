
import java.util.Scanner;

public class accelaration {
    
    public static void main(String[] args) {

        double xo, vo, x, t, a;

        Scanner sc = new Scanner(System.in);

        System.out.println();

    System.out.print("Enter Strting Distance: "); 
    xo = sc.nextDouble();

    System.out.print("Enter Initial Velocity: "); 
    vo = sc.nextDouble();

    System.out.print("Enter Time: "); 
    t = sc.nextDouble();

    System.out.print("Enter Rate of Acceleration: "); 
    a = sc.nextDouble();

    x = xo + vo*t + 1/2.0*a*t*t;

    System.out.print("Distance :" + x);
    sc.close();

    }
}
