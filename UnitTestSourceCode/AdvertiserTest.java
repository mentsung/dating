/*
 * Title: Driver program for Advertiser.java - 5th Unit Test
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: AdvertiserTest.java
 * Purpose: Driver program for Advertiser.java - 5th Unit Test
 * Assumptions: This file should be renamed to Dating.java for testing purposes.
 * During testing, the Customer.java, Advertiser.java, Message.java, 
 * PartnerSought.java and Responder.java classes should also be 
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
        System.out.println ("Advertiser Test Program");
        
        System.out.println ("\n");
        System.out.println ("Test 1: Default Constructor");
        Advertiser A1 = new Advertiser();
        System.out.println ("A1 is: ");
        System.out.print(A1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 2: Specific Constructor");
        Advertiser A2 = new Advertiser("CoolTrix", "Ghdt685", 'F', 25, 60000, 'A', "Outdoorsy lady looking for a rock-climbing partner.", 'M', 25, 30, 0, 100000);
        System.out.println ("A2 is: ");
        System.out.print(A2.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 3: setAdvertisement()");
        A1.setAdvertisement("Bookworm and coffee snob looking for a lady to share thoughts and biscuits with.");
        System.out.println ("A1 is now: ");
        System.out.print(A1.toString());
        
        System.out.println ("\n");
        System.out.println ("Test 4: setAdvertiser()");
        A1.setAdvertiser("4EyesBlue", "jd7sg685", 'M', 40, 90000, 'A', "Bookworm and coffee snob looking for a lady to share thoughts and biscuits with.", 'F', 30, 50, 50000, 100000);
        System.out.println ("A1 is now: ");
        System.out.print(A1.toString());
       
        System.out.println ("\n");
        System.out.println ("Test 5: getAdvertisement()");
        System.out.println ("Advertisement of A1 is: " 
                + A1.getAdvertisement());
        
        System.out.println ("\n");
        System.out.println ("Test 6: getMessageList()");
        System.out.println ("Message list of A1 is: " 
                + A1.getMessageList());
        
        System.out.println ("\n");
        System.out.println ("Test 7: getAdvertiser()");
        System.out.println ("A2 is: " 
                + A2.getAdvertiser());
        
        System.out.println ("\n");
        System.out.println ("Test 8: messageList.add()");
        Message M1 = new Message();
        Message M2 = new Message("Goldie", "7dgst7", 'F', 27, 60000, 'R', "You sound cool!");
        A2.messageList.add(M1);
        A2.messageList.add(M2);
        System.out.println ("A2 has " + A2.messageList.size() + " messages.\n" 
                + A2.getMessageList());
        
        
    }
    
}
