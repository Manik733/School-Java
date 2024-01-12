import java.util.Scanner;

public class arraySplit {
    public static void main(String[] args) {
        String phrase = " ";
        String[] words = null;

        System.out.println("Enter phrase: ");
        Scanner scan = new Scanner(System.in);

        phrase = scan.nextLine();
        words = phrase.split(" ");

        for(int i = 0; i < phrase.length(); i++){
            System.out.println(words[i]);
        }

        scan.close();
    }
}
