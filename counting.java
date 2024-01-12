import java.util.Random;

public class counting {
    
    public static void main(String[] args) {

        String a = "", b="";
        int c=0;

        Random rand = new Random();
        for( int i = 0; i<= 100; i++){
            c = rand.nextInt(41)-20;
            
            a = (i%2==0)?"Even":"Odd";

            b = (i%10==0)?"-----":"";
           
            System.out.println(c +" "+ a);
            System.out.println(b);
            
        }
    }
}
