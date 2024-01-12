import java.util.Random;

public class arrayNumbers {
    
    public static void main(String[] args) {
        int sum = 0;
        int numbers[] = new int[5];
        int min  = 0;
        int max = 0;
        Random rand = new Random();

        for(int i = 0; i < numbers.length; i++){
        numbers[i] = rand.nextInt(10 + 10 +1) - 10;
        }

        for (int i=0; i<numbers.length; i++){
            System.out.println ("i: "+numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            sum +=numbers[i];  
        }
        System.out.println(sum); 

        min = numbers[0];
        max = numbers[0];

        for( int i = 0; i< numbers.length;i++){
            if(numbers[i]<min)
            min = numbers[1];

            if(numbers[i]>max)
            max= numbers[i];
         
        }
        System.out.println(min +" " +max);
    }
}
