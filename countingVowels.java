import java.util.Scanner;

public class countingVowels {
     
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String phrase = "";
        char letter ='0';
        int countA =0, countE=0, countI=0, countO=0, countU=0, countY=0;


        System.out.print("Enter a phrase: ");
        phrase = sc.nextLine();
        phrase = phrase.toUpperCase();

        for(int i = 0; i < phrase.length(); i++){
            letter = phrase.charAt(i);

            /*if(letter == 'A')
                countA +=1;
            else if(letter == 'E')
            countE +=1;
            else if(letter == 'I')
            countI +=1;
            else if(letter == 'O')
            countO +=1;
            else if(letter == 'U')
            countU +=1;
            else if(letter == 'Y')
            countY +=1;
            }*/

            switch (letter){
                case 'A':
                countA +=1;
                break;
                case 'E':
                countE +=1;
                break;
                case 'I':
                countI +=1;
                break;
                case 'O': 
                countO +=1;
                break;
                case 'U':
                countU +=1;
                break;
                case 'Y':
                countY +=1;
                break;
            }
        }
        
            System.out.println();
            System.out.println("Vowels: ");
            if(countA > 0)
            System.out.println("a - " + countA);
            if(countE > 0)
            System.out.println("e - " + countE);
            if(countI > 0)
            System.out.println("i - " + countI);
            if(countO > 0)
            System.out.println("o - " + countO);
            if(countU > 0)
            System.out.println("u - " + countU);
            if(countY > 0)
            System.out.println("y - " + countY);

            sc.close();
        
        }
    }
