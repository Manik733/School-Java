import java.util.Scanner;

public class histograph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] values = new int[10];
        int inputVal = 0;
        int start = 0;
        int end =0;
        for(int i = 0; i < values.length; i++){
            values[i]=0;
        }

      
        while(inputVal>=0){
            inputVal = scan.nextInt();
            if(inputVal>=1 && inputVal<=10)
            values[0]+=1;
            else if(inputVal>=11 && inputVal<=20)
            values[1]+=1;
            else if(inputVal>=21 && inputVal<=30)
            values[2]+=1;
            else if(inputVal>=31 && inputVal<=40)
            values[3]+=1;
            else if(inputVal>=41 && inputVal<=50)
            values[4]+=1;
            else if(inputVal>=51 && inputVal<=60)
            values[5]+=1;
            else if(inputVal>=61 && inputVal<=70)
            values[6]+=1;
            else if(inputVal>=71 && inputVal<=80)
            values[7]+=1;
            else if(inputVal>=81 && inputVal<=90)
            values[8]+=1;
            else if(inputVal>=91 && inputVal<=100)
            values[9]+=1;
        }

        for(int i=0; i<values.length; i++){
            start = 1+(i*10); 
            end = start + 9;
            System.out.printf ("%2d - %3d | %s \n", start, end, "*".repeat(values[i]));
        }
        scan.close();
    }
}
