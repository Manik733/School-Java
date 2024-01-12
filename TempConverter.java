import java.util.Scanner;

public class TempConverter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahr = 0.0;
        double cel = 0.0;
        double kel = 0.0;

        System.out.println ("Temperature Converter");
        System.out.print ("Enter Temperature in Fahrenheit: ");
    fahr = sc.nextDouble(); 

    cel = (fahr-32)*(5.0/9);
    kel = (fahr + 459.67)*(5.0/9);

    System.out.printf("Converted: %.4f fahrenheit \t = %.4f Celsuis and %.4f Kelvin \n ", fahr, cel, kel);

    sc.close();
    }
}
