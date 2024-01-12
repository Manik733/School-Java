import java.util.Scanner;

public class MenuTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char option = ' ';
        String name = "";
        int n = 0;
        int m = 0;
        double p = 0;

        while (option != 'X') {
            System.out.printf(
                    "Menu:\n \tA) display \"Hello World\"\n\tB) display your name, one character per line\n\tC) calculate summation 1..n\n\tD) calculate an approximation to PI\n\tX) exit\n\n\tSelect option: ");
            option = scan.nextLine().toUpperCase().charAt(0);

            if (option == 'A') {
                System.out.println("Hello World");
            } else if (option == 'B') {
                System.out.print("Enter Name: ");
                name = scan.nextLine();
                name = name.replace(" ", "");
                for (int i = 0; i < name.length(); i++) {
                    System.out.println(name.charAt(i));
                }
            } else if (option == 'C') {
                System.out.print("Enter n: ");
                n = scan.nextInt();
                for (int i = 0; i <= n; i++) {
                    m += i;
                }
                System.out.println(m);
            } else if (option == 'D') {
                p = Math.round(Math.PI);
                System.out.println(p);
            } else if (option == 'X') {
                System.out.println("Menu Option " + option + " selected");
            } else {
                System.out.println("Invalid menu option. Try again.");
            }
            scan.close();
        }

    }
}
