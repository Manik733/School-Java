import java.util.Random;
import java.util.Scanner;

public class RandSubstring {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int rpos1 = 0;
    int rpos2 = 0;
    String phrase = "";
    int minPos = 0;
    int maxPos = 0;
    System.out.print("Enter phrase: ");
    phrase = scan.nextLine();
    
    phrase = phrase.replace(" ","");
    rpos1 = rand.nextInt(0,phrase.length());
    rpos2 = rand.nextInt(0,phrase.length());
    minPos = Math.min(rpos1,rpos2);
    maxPos = Math.max(rpos1,rpos2);
    phrase = phrase.substring(minPos,maxPos+1);
    System.out.println(minPos);
    System.out.println(maxPos);
    System.out.println(phrase);

    scan.close();
    }
}
