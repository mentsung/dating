/*
 * Title: Driver program for Customer.java - 2nd Unit Test
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: CustomerTest.java
 * Purpose: Driver program for Customer.java - 2nd Unit Test
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
        System.out.println ("Customer Test Program");
        
        System.out.println ("\n");
        System.out.println ("Test 1: Default Constructor");
        Customer C1 = new Customer();
        System.out.println ("C1 is: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 2: Specific Constructor");
        Customer C2 = new Customer("WRobinson", "cd986sb", 'M', 31, 60000, 'A');
        System.out.println ("C2 is: ");
        System.out.print(C2.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 3: setLogin()");
        C1.setLogin("LTan");
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 4: setPassword()");
        C1.setPassword("&HGB&76");
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 5: setGender()");
        C1.setGender('F');
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 6: setAge()");
        C1.setAge(40);
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 7: setIncome()");
        C1.setIncome(90000);
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 8: setCustomerType()");
        C1.setCustomerType('R');
        System.out.println ("C1 is now: ");
        System.out.print(C1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 9: setCustomer()");
        C2.setCustomer("WRobinson", "cd986sb", 'M', 31, 90000, 'A');
        System.out.println ("C2 is now: ");
        System.out.print(C2.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 10: getLogin()");
        System.out.println ("Login of C2 is: " 
                + C2.getLogin());
        
        System.out.println ("\n");
        System.out.println ("Test 11: getPassword()");
        System.out.println ("Password of C2 is: " 
                + C2.getPassword());
        
        System.out.println ("\n");
        System.out.println ("Test 12: getGender()");
        System.out.println ("Gender of C2 is: " 
                + C2.getGender());
        
        System.out.println ("\n");
        System.out.println ("Test 13: getAge()");
        System.out.println ("Age of C2 is: " 
                + C2.getAge());
        
        System.out.println ("\n");
        System.out.println ("Test 14: getIncome()");
        System.out.println ("Income of C2 is: " 
                + C2.getIncome());
        
        System.out.println ("\n");
        System.out.println ("Test 15: getCustomerType()");
        System.out.println ("Customer Type of C2 is: " 
                + C2.getCustomerType());
        
        System.out.println ("\n");
        System.out.println ("Test 16: getCustomer()");
        System.out.println ("C2 is: " 
                + C2.getCustomer());
    }
    
}
