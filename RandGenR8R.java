import java.util.Random;

public class RandGenR8R {
    public static void main(String[] args) {
        Random genR8R = new Random();
        int val = 0;

        val = genR8R.nextInt(20); 
        System.out.println(val);
        val = genR8R.nextInt(8) + 1; 
        System.out.println(val);
        val = genR8R.nextInt(45) + 10; 
        System.out.println(val);
        val = genR8R.nextInt(100) - 50;
        System.out.println(val);
    }
}
