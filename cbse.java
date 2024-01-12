import java.util.Scanner;
public class cbse {
    public static void main (String[]args){
        System.out.println("Percentage in CBSE");
        System.out.println("");
Scanner scan = new Scanner (System.in);
    
        System.out.print("Marks in English:");
        double eng = scan.nextInt();
        System.out.print("Marks in Hindi:");
        double hin = scan.nextInt();
        System.out.print("Marks in Math:");
        double mat = scan.nextInt();
        System.out.print("Marks in SST:");
        double sst = scan.nextInt();
        System.out.print("Marks in Science:");
        double sci = scan.nextInt();


        System.out.println("Result:"+(eng+hin+mat+sci+sst)/5);

        scan.close();

        


}
}
