import java.util.Scanner;
import java.util.Random;

public class strangeGraph {
    public static void main(String[] args) {

        int n = 0, x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many values? ");
        n = scan.nextInt();
        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            x = rand.nextInt(29);
            System.out.printf("%4d : ",x);
            for (int j = 0; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
