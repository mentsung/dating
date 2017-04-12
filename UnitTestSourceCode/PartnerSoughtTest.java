/*
 * Title: Driver program for PartnerSought.java - 1st Unit Test
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: PartnerSoughtTest.java
 * Purpose: Driver program for PartnerSought.java - 1st Unit Test
 * Assumptions: This file should be renamed to Dating.java for testing purposes. 
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
        System.out.println ("PartnerSought Test Program");
        
        System.out.println ("\n");
        System.out.println ("Test 1: Default Constructor");
        PartnerSought PS1 = new PartnerSought();
        System.out.println ("PS1 is: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 2: Specific Constructor");
        PartnerSought PS2 = new PartnerSought('M', 20, 30, 30000, 60000);
        System.out.println ("PS2 is: ");
        System.out.print(PS2.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 3: setPSGender()");
        PS1.setPSGender('M');
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 4: setPSminimumAge()");
        PS1.setPSminimumAge(18);
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 5: setPSmaximumAge()");
        PS1.setPSmaximumAge(25);
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 6: setPSminimumIncome()");
        PS1.setPSminimumIncome(40000);
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 7: setPSmaximumIncome()");
        PS1.setPSmaximumIncome(80000);
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 8: setPartnerSought()");
        PS1.setPartnerSought('F',25,40,80000,120000);
        System.out.println ("PS1 is now: ");
        System.out.print(PS1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 9: getPSGender()");
        System.out.println ("Preferred Gender of PS2 is: " 
                + PS2.getPSGender());
        
        System.out.println ("\n");
        System.out.println ("Test 10: getPSminimumAge()");
        System.out.println ("Preferred Min Age of PS2 is: " 
                + PS2.getPSminimumAge());
        
        System.out.println ("\n");
        System.out.println ("Test 11: getPSmaximumAge()");
        System.out.println ("Preferred Max Age of PS2 is: " 
                + PS2.getPSmaximumAge());
        
        System.out.println ("\n");
        System.out.println ("Test 12: getPSminimumIncome()");
        System.out.println ("Preferred Min Income of PS2 is: " 
                + PS2.getPSminimumIncome());
        
        System.out.println ("\n");
        System.out.println ("Test 13: getPSmaximumIncome()");
        System.out.println ("Preferred Max Income of PS2 is: " 
                + PS2.getPSmaximumIncome());
        
        System.out.println ("\n");
        System.out.println ("Test 14: getPartnerSought()");
        System.out.println ("PS2 is: " 
                + PS2.getPartnerSought());
    }
    
}
