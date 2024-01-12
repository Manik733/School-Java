import java.util.Scanner;

public class SumRangeEven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n =0; int total = 0;

        System.out.print("Summation of 1 to n? ");
        n = sc.nextInt();

        for( int count =2; count<=n; count+=2){
        total += count;
        }

        System.out.println("Sum: " + total);

        sc.close();
    }
}
