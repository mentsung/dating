/*
 * Title: Driver program for Responder.java - 3rd Unit Test
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: ResponderTest.java
 * Purpose: Driver program for Responder.java - 3rd Unit Test
 * Assumptions: This file should be renamed to Dating.java for testing purposes.
 * The file Customer.java should be included for testing purposes.
 */
package dating;

/**
 *
 * @author z4pu
 */
public class Dating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println ("Responder Test Program");

        System.out.println ("\n");
        System.out.println ("Test 1: Default Constructor");
        Responder R1 = new Responder();
        System.out.println ("R1 is: ");
        System.out.print(R1.toString());

        System.out.println ("\n");
        System.out.println ("Test 2: Specific Constructor");
        Responder R2 = new Responder("TallDarkHandsome", "cd986sb", 'M', 45, 100000, 'R');
        System.out.println ("R2 is: ");
        System.out.print(R2.toString());

        System.out.println ("\n");
        System.out.println ("Test 3: setResponder()");
        R1.setResponder("ACaffrey", "Gd73h", 'F', 29, 50000, 'R');
        System.out.println ("R1 is now: ");
        System.out.print(R1.toString());

        System.out.println ("\n");
        System.out.println ("Test 4: getResponder()");
        System.out.println ("R2 is: "
                + R2.getResponder());

    }

}
