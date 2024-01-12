import java.util.Scanner;

public class charDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String phrase = "";
        System.out.print("Enter a phrase: ");
        phrase = scan.nextLine();
        char letter = '0';
        int sum = 0;
        double avg = 0;
        double num=0;

        for(int i = 0; i < phrase.length(); i++){
            letter = phrase.charAt(i);
            int value = (int)letter;
            System.out.println(letter +" - " + value);

            sum +=value;
            num = phrase.length();
        }

        avg = sum/num;

        System.out.println("Average: " + avg);
        scan.close();

    }
}
