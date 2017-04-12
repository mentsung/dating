/*
 * Title: Main driver program
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: Dating.java
 * Purpose: Main driver program for the classes Advertiser, Customer, Message, PartnerSought and Responder
 * Assumptions:
 */
package dating;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author z4pu
 */
public class Dating
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

	displayStudentDetails();
        System.out.println ();
	System.out.println ("Welcome to the OKEros Programme");
        System.out.println ("--------------------------------");
        System.out.println ("Creating initial list of customers...");

        ArrayList<Responder> ResponderList = new ArrayList<Responder>();
        ArrayList<Advertiser> AdvertiserList = new ArrayList<Advertiser>();

        Responder R1 = new Responder("PTimms", "cd986sb", 'M', 45, 100000, 'R');
        Responder R2 = new Responder("ACaffrey", "Gd73h", 'F', 29, 50000, 'R');
        Responder R3 = new Responder("AllenKey", "87csh6s", 'M', 29, 70000, 'R');
        Responder R4 = new Responder("HattieW", "8UHDGL6s", 'F', 19, 0, 'R');

        Advertiser A1 = new Advertiser("CoolTrix", "Ghdt685", 'F', 25, 60000,'A', "Outdoorsy lady looking for a rock-climbing partner.", 'M', 25, 30, 0, 100000);
        Advertiser A2 = new Advertiser("4EyesBlue", "jd7sg685", 'M', 35, 90000,'A', "Bookworm and coffee snob looking for a lady to share thoughts and biscuits with.", 'F', 30, 50, 50000, 100000);
        Advertiser A3 = new Advertiser("LadyGrey", "Ka86BaCRh", 'F', 40, 95000,'A', "Thoughtful wanderer seeks gentleman for fun times and perhaps romance.", 'M', 40, 50, 70000, 200000);

        ResponderList.add(R1);
        ResponderList.add(R2);
        ResponderList.add(R3);
        ResponderList.add(R4);

        AdvertiserList.add(A1);
        AdvertiserList.add(A2);
        AdvertiserList.add(A3);

        displayCustomerList(AdvertiserList, ResponderList);

        displayMenuOptions();

        Scanner keyboard = new Scanner(System.in);
        int menuOption = keyboard.nextInt();

        while (menuOption != 1 && menuOption !=2
                && menuOption != 3 && menuOption != 4
                && menuOption != 5 && menuOption != 6)
        {
            System.out.println("Enter an integer from 1 to 6: ");
            menuOption = keyboard.nextInt();
        }
         switch (menuOption)
         {
             case 6: // Exit program
            {
                System.out.println ("Exiting... Goodbye!");
                System.exit(0);
            }

             case 5: // search for matches for a Responder
             {
                System.out.println();
                System.out.println("Checking matches for a Responder");
                System.out.println("---------------------------------");

                System.out.println("Enter the login of the Responder you would like to find matches for. ");
                System.out.println("This information is case-sensitive: ");
                Scanner findMatches = new Scanner(System.in);
                String findMatchesFor = findMatches.next();
                boolean foundResponder = false;
                boolean foundAdvertiser = false;

                System.out.println("Now checking list of Responders...");


                for (Responder r : ResponderList)
                    {   if (r.getLogin() != null && r.getLogin().contains(findMatchesFor))
                            {
                                foundResponder = true;
                                for (Advertiser a : AdvertiserList)
                                {
                                    if(
                                            r.getGender()== a.PS1.getPSGender() &&
                                            r.getAge() >= a.PS1.getPSminimumAge() &&
                                            r.getAge() <= a.PS1.getPSmaximumAge() &&
                                            r.getIncome() >= a.PS1.getPSminimumIncome() &&
                                            r.getIncome() <= a.PS1.getPSmaximumIncome()
                                      )
                                        {
                                            foundAdvertiser = true;
                                            int indexOfMatch = AdvertiserList.indexOf(a);
                                            System.out.println("Match Found!");
                                            System.out.println("-------------");
                                            System.out.println (AdvertiserList.get(indexOfMatch));

                                            System.out.println ("Would you like to send a message? Y or N: ");
                                            Scanner sendMessage = new Scanner(System.in);
                                            String sendMsgYorN = sendMessage.next();
                                           if (sendMsgYorN.equals("Y"))
                                           {
                                               System.out.println ("Type in the text of your message.");
                                               System.out.println ("Please end your message with a ~ before pressing Enter: ");
                                               sendMessage.useDelimiter("\\s*~\\s*");
                                               sendMsgYorN = sendMessage.next();
                                               Message M1 = new Message(r.getLogin(),r.getPassword(), r.getGender(), r.getAge(), r.getIncome(), 'R', sendMsgYorN);
                                               a.messageList.add(M1);
                                               System.out.println ("Sending message!");
                                               System.out.println ();
                                               System.out.println ("Showing details of Advertiser who received the message...");
                                               System.out.println ("----------------------------------------------------------");
                                               System.out.println (a.getAdvertiser());
                                           }
                                           else
                                           {
                                               System.out.println ("Exiting... Goodbye!");
                                               System.exit(0);
                                           }
                                        }
                                }
                            }
                    }
                if (foundResponder == false)
                {
                    System.out.println ("No such Responder found.");
                }

                if (foundAdvertiser == false)
                {
                    System.out.println ("No matches found.");
                }
                 break;
             }

             case 4: // Display ResponderList
            {
                displayResponderList(ResponderList);
                break;
            }
             case 3: // DisplayAdvertiserList
            {
                displayAdvertiserList(AdvertiserList);
                break;
            }
             case 2: // Deleting a customer
            {
                System.out.println();
                System.out.println("Deleting a customer");
                System.out.println("--------------------");

                System.out.println("Enter the login of the customer you would like to delete. ");
                System.out.println("This information is case-sensitive: ");
                Scanner deleteCustomer = new Scanner(System.in);
                String loginOfDeleteCustomer = deleteCustomer.next();

                boolean foundCustomer = false;

                System.out.println("Checking list of Advertisers...");

                for (Advertiser a : AdvertiserList)
                {
                    if (a.getLogin() != null && a.getLogin().contains(loginOfDeleteCustomer))
                    {
                        int indexOfElemToBeDeleted = AdvertiserList.indexOf(a);
                        AdvertiserList.remove(indexOfElemToBeDeleted);
                        foundCustomer = true;
                        System.out.println("Removing Advertiser...");
                        System.out.println("The Advertisers are now:");
                        System.out.println("-------------------------");
                        displayAdvertiserList(AdvertiserList);
                    }
                }

                System.out.println("Now checking list of Responders...");

                for (Responder r : ResponderList)
                    {   if (r.getLogin() != null && r.getLogin().contains(loginOfDeleteCustomer))
                            {
                                int indexOfElemToBeDeleted = ResponderList.indexOf(r);
                                ResponderList.remove(indexOfElemToBeDeleted);
                                foundCustomer = true;
                                System.out.println("Removing Responder...");
                                System.out.println("The Responders are now:");
                                System.out.println("-------------------------");
                                displayResponderList(ResponderList);
                            }
                    }
                if (foundCustomer == false)
                {
                    System.out.println("Could not find customer with this login.");
                }
            break;
            }
             case 1: //Adding a customer
            {
                System.out.println();
                System.out.println("Adding a customer");
                System.out.println("--------------------");

                System.out.println("Enter A if you want to add an Advertiser, or ");
                System.out.println("R if you want to add a Responder: ");
                Scanner addC = new Scanner(System.in);
                String cType = addC.next();

                if (cType.equals("A"))
                    {
                        String newLogin;
                        String newPassword;
                        char newGender;
                        int newAge;
                        int newIncome;
                        char newCustomerType = 'A';
                        String newAdvertisement;
                        char newPreferredGender;
                        int newMinimumAge;
                        int newMaximumAge;
                        int newMinimumIncome;
                        int newMaximumIncome;

                        System.out.println ("Enter your new login: ");
                        newLogin = addC.next();

                        System.out.println ("Enter your new password, then press enter: ");
                        newPassword = addC.next();

                        System.out.println ("Enter your gender as M or F, then press enter: ");
                        newGender = (addC.next()).charAt(0);

                        System.out.println ("Enter your age, then press enter: ");
                        newAge = addC.nextInt();

                        System.out.println ("Enter your income as an integer, then press enter: ");
                        newIncome = addC.nextInt();

                        System.out.println ("Enter the text of the advertisement that you would like to place, then press enter: ");
                        newAdvertisement = addC.next();

                        System.out.println ("Enter the gender of your desired partner as M or F, then press enter: ");
                        newPreferredGender = (addC.next()).charAt(0);

                        System.out.println ("Enter your desired partner's minimum age, then press enter: ");
                        newMinimumAge = addC.nextInt();

                        System.out.println ("Enter your desired partner's maximum age, then press enter: ");
                        newMaximumAge = addC.nextInt();

                        System.out.println ("Enter your desired partner's minimum income as an integer, then press enter: ");
                        newMinimumIncome = addC.nextInt();

                        System.out.println ("Enter your desired partner's maximum income as an integer, then press enter: ");
                        newMaximumIncome = addC.nextInt();

                        Advertiser newA = new Advertiser(newLogin, newPassword,
                                newGender, newAge, newIncome, newCustomerType,
                                newAdvertisement, newPreferredGender, newMinimumAge,
                                newMaximumAge, newMinimumIncome, newMaximumIncome);
                        AdvertiserList.add(newA);
                        System.out.println("New Advertiser has been added. Printing new list of Advertisers... ");
                        displayAdvertiserList(AdvertiserList);
                    }
                else if (cType.equals("R"))
                    {
                        String newLogin;
                        String newPassword;
                        char newGender;
                        int newAge;
                        int newIncome;
                        char newCustomerType = 'R';

                        System.out.println ("Enter your new login: ");
                        newLogin = addC.next();

                        System.out.println ("Enter your new password, then press enter: ");
                        newPassword = addC.next();

                        System.out.println ("Enter your gender as M or F, then press enter: ");
                        newGender = (addC.next()).charAt(0);

                        System.out.println ("Enter your age, then press enter: ");
                        newAge = addC.nextInt();

                        System.out.println ("Enter your income as an integer, then press enter: ");
                        newIncome = addC.nextInt();


                       Responder newR = new Responder(newLogin, newPassword,
                                newGender, newAge, newIncome, newCustomerType);
                        ResponderList.add(newR);
                        System.out.println("New Responder has been added. Printing new list of Responders... ");
                        displayResponderList(ResponderList);
                    }
                else
                {
                    System.out.println("You did not enter a valid option. Ending program...");
                    System.exit(0);
                }
                break;
            }
    }
    }


	public static void displayStudentDetails()
	{
           System.out.println ("Name: z4pu");
	}

    public static void displayCustomerList(ArrayList<Advertiser> al, ArrayList<Responder> rl)
    {
        System.out.println();
        displayAdvertiserList(al);
        displayResponderList(rl);
    }

    public static void displayAdvertiserList(ArrayList<Advertiser> al)
    {
        System.out.println();
        System.out.println ("Advertisers:");
        System.out.println ("------------");
        for (Advertiser a : al)
            System.out.println(a + "\n");
    }

    public static void displayResponderList(ArrayList<Responder> rl)
    {
        System.out.println();
        System.out.println ("Responders:");
        System.out.println ("------------");
        for (Responder r : rl)
            System.out.println(r + "\n");
    }

    public static void displayMenuOptions()
    {
        System.out.println();
        System.out.println("OPTIONS:");
        System.out.println("---------");
        System.out.println("1: Add a new customer.");
        System.out.println("2: Delete an existing customer.");
        System.out.println("3: Display details of all advertisers.");
        System.out.println("4: Display details of all responders.");
        System.out.println("5: Get matches for a selected responder.");
        System.out.println("6: Exit program.");
        System.out.println("Enter an integer from 1 to 6: ");
    }

}
