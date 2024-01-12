import java.util.Random;
import java.util.Scanner;


public class RandSymbol {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int val = 0;
    String phrase = "";
    char c = 0;

    System.out.print("Enter phrase: ");
    phrase = scan.nextLine();
    
    phrase = phrase.replace(" ","");
    val = rand.nextInt(0,phrase.length());
    c = phrase.charAt(val);

    System.out.println(val);
    System.out.print(c);
    scan.close();
    }
}
