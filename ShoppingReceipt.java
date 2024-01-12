/* ShoppingReceipt -  An application to create a simple shopping receipt. Purchases records are read from a data file, and output sent to
 *  report file for a formatted receipt. 
 *  Author: Manik Singh (T00715263)
 */

import java.io.File; // import class for input - output properties
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; // import class for console input
import java.util.Date; // import class date ad time

public class ShoppingReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);// console input object
        String inputFileName = " "; // the name of the input file
        String outputFileName = " ";// the name of the output file
        String todayStr = "" + new Date();// string for date and time
        int subtotal = 0;// calculated subtotal of the items
        String item = " ";// name of the items
        int price = 0;// price of the items
        double tax = 0.0;// calculated tax
        double total = 0.0;// total after tax
        int maxPrice = 0;// most expensive item price
        String maxItem = "";// most expensive item name

        System.out.print("Enter the name of the input file: ");
        inputFileName = input.nextLine();// asks the user for input file name

        System.out.print("Enter the name of the output file: ");
        outputFileName = input.nextLine();// asks the user for output file name
        File inputFile = new File(inputFileName);// file object attached to actual file
        Scanner scanFile = new Scanner(inputFile);// scanner object for input, attaching to file
        PrintWriter outputFile = new PrintWriter(outputFileName);// attach to output file

        outputFile.println("      Java Superstore");// formatting the header for output file
        outputFile.println(todayStr);
        outputFile.println();

        while (scanFile.hasNext()) {// loop while input file has data
            item = scanFile.next();// read an item, and transform to uppercase
            price = scanFile.nextInt();// read a price
            outputFile.printf("%-15s %6.2f\n", item.toUpperCase(), (price / 100.0));// output to file
            subtotal += price;// calculating total
            if (price > maxPrice) {// calculating most expensive item
                maxPrice = price;// price of the most expensive item
                maxItem = item;// name of the most expensive item
            }
        }

        tax = subtotal * 0.14;// calculating tax
        total = subtotal + tax;// total after tax

        outputFile.println("--------------------");// a formatted line
        outputFile.printf("%-15s %6.2f\n", "Sub-total", (subtotal / 100.0));// calculated output to file showing the
                                                                            // results
        outputFile.printf("%-15s %6.2f\n", "Tax", (tax / 100.0));
        outputFile.printf("%-15s %6.2f\n", "Total", (total / 100.0));
        outputFile.println();
        outputFile.printf("Most expensive\n%-15s %6.2f", maxItem.toUpperCase(), (maxPrice / 100.0));

        scanFile.close();// detach from input file, and close file
        outputFile.close();// close the output file
        input.close();// close the scanner
    }

}
