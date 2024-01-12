import java. util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class leapYearCheckLoop {

    public static void main(String[] args) throws IOException {
        int year = 0;
        int syear = 0; // input year to test
        int eyear = 0;
        String result = ""; // result string
        String fileName = "";
        // ... obtain year
        Scanner scan = new Scanner(System.in);

        System.out.print("Add start and end years: ");
        syear = scan.nextInt();
        eyear = scan.nextInt();
        System.out.print("Output File: ");
        fileName = scan.next();
        File outFile = new File(fileName);
        PrintWriter outputFile = new PrintWriter(outFile);

        for(year = syear; year <= eyear; year++){
            result = String.format("%d is ", year); // start result output
            if (year < 1582) // if year is before "Leap Years" introduced
                result += "invalid; for years before 1582\n"; // is an invalid year
            else if (year % 4 != 0) // otherwise, if year is not divisible by 4
                result += "not a leap year\n"; // "not a leap year" – ODD years, not leap
            else if (year % 100 != 0) // otherwise, if year is not divisible by 100
                result += "a leap year\n"; // "is a leap year"
            else if (year % 400 != 0) // otherwise, if year is not divisible by 400
                result += "not a leap year\n"; // "not a leap year"
            else // otherwise, for any other year,
                result += "a leap year\n";
            outputFile.println(result); // "is a leap year"
            
            
            outputFile.close();
            scan.close();
            System.out.println(result); // show if a leap year or not
        }
       

        
        System.out.println(result); // show if a leap year or not

    }
}
