import java.util.Scanner;

public class arrayDeviation {
    public static void main(String[] args) {
        int n = 0;
        double sum = 0;
        double average = 0.0;
        double sumOfDiff = 0.0;
        double standardDeviation = 0.0;

        Scanner scan = new Scanner(System.in);

        double[] values = new double[5];
        n = values.length;

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextDouble();
        }

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        average = sum / n;

        System.out.println(average);

        for (int i = 0; i < values.length; i++) {
            sumOfDiff = sumOfDiff + Math.pow((values[i] - average), 2);
        }
        standardDeviation = Math.sqrt(sumOfDiff / (n - 1));

        System.out.println(standardDeviation);

        scan.close();
    }
}
