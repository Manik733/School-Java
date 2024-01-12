import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double first = 0;
        double second = 0;
        double third = 0;

        double min = 0;
        double max = 0;

        System.out.print("Hi user, I need three numbers: ");
        first = scan.nextDouble();
        second = scan.nextDouble();
        third = scan.nextDouble();
       
        if (first <= second){
            min = first;
        }else {
            min = second;
        }

        if (min > third){
            min = third;
        }

        if(first >= second){
            max = first;
        } else {
            max =  second;
        }

        if (max < third){
            max = third;
        }

        System.out.printf("The smallest number is %f nad the largest number is %f", min, max);
       scan.close();
    }
}
