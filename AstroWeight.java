/* AstroWeight - the purpose is to calculate the relative weight of a mass on the “surface” of different planets
 *  Author: Manik Singh (T00715263)
 */

import java.util.Scanner; // import class for console input

public class AstroWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // console input object

        double mass = 0; // declare double variables for relative weight on different planets &
                         // planetoids
        double moon = 0;
        double mercury = 0;
        double venus = 0;
        double mars = 0;
        double jupiter = 0;
        double saturn = 0;
        double uranus = 0;
        double neptune = 0;
        double pluto = 0;
        double krypton = 0;
        double vulcan = 0;
        double tatooine = 0;

        System.out.println("Calculate the relative weight of a mass on the surface of different planets"); // dislay
                                                                                                           // prompts
        System.out.println();
        System.out.print("Enter mass of the object on Earth (kgs): ");

        mass = scan.nextDouble(); // input double as the mass on earth, and store
                                  // use input to calculate the weights on different planets & planetoids
        moon = mass * 0.166;
        mercury = mass * 0.378;
        venus = mass * 0.907;
        mars = mass * 0.377;
        jupiter = mass * 2.364;
        saturn = mass * 0.916;
        uranus = mass * 0.889;
        neptune = mass * 1.125;
        pluto = mass * 0.067;
        krypton = mass * 1.520;
        vulcan = mass * 1.314;
        tatooine = mass * 0.770;

        System.out.println(); // output results
        System.out.printf("A mass of %.4f kgs on Earth weighs: \n", mass);
        System.out.println();
        System.out.printf(" %.3f kgs on Moon \n", moon);
        System.out.printf(" %.3f kgs on Mercury \n", mercury);
        System.out.printf(" %.3f kgs on Venus \n", venus);
        System.out.printf(" %.3f kgs on Mars \n", mars);
        System.out.printf(" %.3f kgs on Jupiter \n", jupiter);
        System.out.printf(" %.3f kgs on Saturn \n", saturn);
        System.out.printf(" %.3f kgs on Uranus \n", uranus);
        System.out.printf(" %.3f kgs on Neptune \n", neptune);
        System.out.printf(" %.3f kgs on Pluto \n", pluto);
        System.out.printf(" %.3f kgs on Krypton \n", krypton);
        System.out.printf(" %.3f kgs on Vulcan \n", vulcan);
        System.out.printf(" %.3f kgs on Tatooine \n", tatooine);

        scan.close(); // closes the scanner
    } // end of main()
} // end of class
