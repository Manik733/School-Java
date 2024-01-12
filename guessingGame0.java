import java.util.Random;

public class guessingGame0 {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int c = 0;
        char pickChar = '0';

        String phrase = "The happy, blue dog chased the ball";
        phrase = phrase.toUpperCase();
        phrase = phrase.replace(" ", "");
        phrase = phrase.replace(",", "");
        phrase = phrase.replace(".", "");
        phrase = phrase.replace("!", "");

        c = rand.nextInt(0, phrase.length());
        pickChar = phrase.charAt(c);

        System.out.print(pickChar);


    }
}
