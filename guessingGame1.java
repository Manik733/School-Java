import java.util.Random;
import java.util.Scanner;


public class guessingGame1 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int c = 0;
        char pickChar = '0';
        char guessChar = '0';

        String phrase = "The happy, blue dog chased the ball";
        
        System.out.println(phrase);
        System.out.println();
        System.out.println("Guess which letter I picked: ");

        guessChar = scan.next().toUpperCase().charAt(0);

        phrase = phrase.toUpperCase();
        phrase = phrase.replace(" ", "");
        phrase = phrase.replace(",", "");
        phrase = phrase.replace(".", "");
        phrase = phrase.replace("!", "");

        c = rand.nextInt(0, phrase.length());
        pickChar = phrase.charAt(c);

        if ( !phrase.contains( ""+guessChar ) ) {
            System.out.println("Your guess is not in the phrase."); 
        }else if ( pickChar == guessChar ){
            System.out.println("Your guess matches!");
        }else if( pickChar < guessChar){
            System.out.println("The letter comes before your guess ,in the alphabet.");
            System.out.println("The computer's pick is: "+ pickChar);
        }else if( pickChar > guessChar){
            System.out.println("The letter comes after your guess , in the alphabet. " + pickChar);
            System.out.println("The computer's pick is: "+ pickChar);}
            scan.close();
    }
}
