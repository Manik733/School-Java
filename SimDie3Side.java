import java.util.Random;

public class SimDie3Side {
    public static void main(String[] args) {

        Random rand = new Random();

        int countHeads = 0;
        int countMiddle = 0;
        int countTails = 0;
        int face = 0;

        for (int loop=0; loop<10; loop++){
        face = rand.nextInt(3); 
        System.out.printf ("%d - %d \n", loop, face); 
        if (face == 0){
             countHeads++;
        }else if (face == 1){
             countTails++;
        }else if (face == 2){
            countMiddle++;
        }
        }
        System.out.printf ("Counts: heads: %d, middle: %d, tails: %d \n", countHeads, countMiddle, countTails);
    }
}
