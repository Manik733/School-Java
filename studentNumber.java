import java.util.Random;

public class studentNumber {
  public static void main(String[] args) {
    
    Random rand = new Random();

    int aa = 0;
    int b = 0;
    int ccccc = 0;


    aa = rand.nextInt(75 - 10 + 1) + 10;
    b = rand.nextInt(8 - 3 + 1) + 3;
    ccccc = rand.nextInt(69999 - 30001 + 1) + 30001;


    System.out.printf("Student Number : T%d%d%d", aa,b,ccccc);
  }  
}
