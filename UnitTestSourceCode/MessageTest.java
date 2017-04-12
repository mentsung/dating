/*
 * Title: Driver program for Message.java - 4th Unit Test
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: MessageTest.java
 * Purpose: Driver program for Message.java - 4th Unit Test
 * Assumptions: This file should be renamed to Dating.java for testing purposes.
 * During tesing, the Customer.java and Responder.java classes should also be 
 * available to the IDE
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
        System.out.println ("Message Test Program");
        
        System.out.println ("\n");
        System.out.println ("Test 1: Default Constructor");
        Message M1 = new Message();
        System.out.println ("M1 is: ");
        System.out.print(M1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 2: Specific Constructor");
        Message M2 = new Message("FunnyLady", "GDW^8754", 'F', 36, 75000, 'R', 
                "Hey there it sounds like we might get along. Would you like to meet up for coffee? Kik me at FunnyLady if you are keen.");
        System.out.println ("M2 is: ");
        System.out.print(M2.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 3: setMessageText()");
        M1.setMessageText("I enjoy Marxist theory too much myself. Send me a text at 8773 3872 if you'd like to chat further.");
        System.out.println ("M1 is now: ");
        System.out.print(M1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 4: setMessage()");
        M1.setMessage("MindWanderer", "7cd6GHW", 'F', 30, 30000, 'R', 
                "Hello! I like the sound of your reading list. Email me at hosco@gmail.com. I'd love to chat more.");
        System.out.println ("M1 is now: ");
        System.out.print(M1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 5: getMessageText()");
        System.out.println ("Text of M2 is: " 
                + M2.getMessageText());
        
        System.out.println ("\n");
        System.out.println ("Test 6: getMessage()");
        System.out.println ("M2 is: " 
                + M2.getMessage());
        
    }
    
}
