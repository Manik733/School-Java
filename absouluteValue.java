import java.util.Scanner;

public class absouluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double value = 0;

        System.out.print("Enter Value: ");
        value = scan.nextDouble();

        value = (value < 0) ? -value : value;

        System.out.println("Absolute Value: " + value );
        scan.close();
       
    }
}
