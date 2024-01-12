import java.util.Scanner;

public class name {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fullName = " ";
    int pos = 0;
    String first = " ";
    String last  = " ";
    char initial = 0;

    System.out.print("Enter name: ");
    fullName = scan.nextLine();
    fullName = fullName.toUpperCase();
    pos = fullName.lastIndexOf(" ");
    first = fullName.substring(0,pos);
    last = fullName.substring(pos+1);
    initial = first.charAt(0);

    System.out.printf("Honorific: %s, %c., DR.",last, initial);



        scan.close();
    }
}
