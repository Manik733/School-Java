import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputPounds = 0.0;
        double resultKilos = 0.0;

        System.out.println ("Pounds to Kilograms Converter");
 System.out.print ("How many Pounds? ");
    inputPounds = sc.nextDouble(); 

    resultKilos = inputPounds*0.453592;

    System.out.printf("Converted: %.4f pounds \t = %.4f kilograms \n", inputPounds, resultKilos);

    sc.close();
    }
    
}
