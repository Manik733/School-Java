import java.util.Scanner; 

public class distanceLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double x1 = 0;
        double x2= 0;
        double y1 = 0;
        double y2 = 0;
        double result = 0;


        System.out.print("Enter coordinates of first point: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();


        System.out.print("Enter coordinates of second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        result = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.print("The Distance between the points is : " + result + " units");

        scan.close();

    }
}
