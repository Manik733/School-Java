import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = 0;
        String LG = "";
        double GP = 0;


        System.out.print("Enter your Grade in Percentage: ");

        grade = scan.nextDouble();

        grade = Math.round(grade);

        if(grade >= 90 && grade <= 100){
            LG = "A+";
        }else if(grade >=85 && grade <= 89){
            LG = "A";
        }else if(grade >=80 && grade <= 84){
            LG = "A-";
        }else if(grade >=77 && grade <= 79){
            LG = "B+";
        }else if(grade >=73 && grade <= 76){
            LG = "B";
        }else if(grade >=70 && grade <= 72){
            LG = "B-";
        }else if(grade >=65 && grade <= 69){
            LG = "C+";
        }else if(grade >=60 && grade <= 64){
            LG = "C";
        }else if(grade >=55 && grade <= 59){
            LG = "C-";
        }else if(grade >=50 && grade <= 54){
            LG = "D";
        }else if(grade >=0 && grade <= 49){
            LG = "F";
        }else{
            LG = "DNC";
        }



        if(grade >= 90 && grade <= 100){
            GP = 4.33;
        }else if(grade >=85 && grade <= 89){
            GP = 4.00;
        }else if(grade >=80 && grade <= 84){
            GP = 3.67;
        }else if(grade >=77 && grade <= 79){
            GP = 3.33;
        }else if(grade >=73 && grade <= 76){
            GP = 3.00;
        }else if(grade >=70 && grade <= 72){
            GP = 2.67;
        }else if(grade >=65 && grade <= 69){
            GP = 2.33;
        }else if(grade >=60 && grade <= 64){
            GP = 2.00;
        }else if(grade >=55 && grade <= 59){
            GP = 1.67;
        }else if(grade >=50 && grade <= 54){
            GP = 1.00;
        }else if(grade >=0 && grade <= 49){
            GP = 0.00;
        }else{
            GP = 0.00;
        }

        System.out.printf("LG: %-2s and GP: %4.2f \n",LG,GP);

        scan.close();
    }
}
