/*
 * Title: Advertiser.java 
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: Advertiser.java 
 * Purpose: Class managing details of an Advertiser. Inherits from Customer class. 
 * Three additional attributes. 
 * Assumptions: Each advertiser can only place one description of a partner sought 
 */
package dating;

import java.util.ArrayList;
public class Advertiser extends Customer
{

	// additional attributes	
	private String advertisement;
	PartnerSought PS1; //package access so can be accessed by Responder
	ArrayList<Message> messageList; //package access so can be accessed by Responder

	//constructors 
	//default constructor //assigns default values to attributes; has no parameters
	public Advertiser()
	{
            super();
            advertisement = " ";
            PS1 = new PartnerSought();
            messageList = new ArrayList<>(0);
	}

	// specific constructor 
	// will contain arguments or specific names for objects
	public Advertiser(String l, String p, char g, int a, int i, char ct, String adv, char gp, int mina, int maxa, int mini, int maxi)
	{
            super(l,p,g,a,i,ct);
            advertisement = adv;
            PS1 = new PartnerSought(gp, mina, maxa, mini, maxi);
            messageList = new ArrayList<>(0);
	}

	//setters 
        
        public void setAdvertisement(String adv)
	{
            advertisement = adv;
	}
	
	public void setAdvertiser(String l, String p, char g, int a, int i, char ct, String adv, char gp, int mina, int maxa, int mini, int maxi)
	{
		setCustomer(l,p,g,a,i,ct);
                advertisement = adv;
                PS1.setPartnerSought (gp, mina, maxa, mini, maxi);
                messageList = new ArrayList<>(0);
	}

	// getters
        public String getAdvertisement ()
	{
		return advertisement;
	}
        
        public ArrayList<Message> getMessageList ()
	{
		return messageList;
	}
        
	public Advertiser getAdvertiser ()
	{
		return this;
	}
	
	// print Advertiser details
	@Override
        public String toString()
	{
		return(super.toString() + "\nAdvertisement: " + advertisement 
                        + "\n" + PS1.getPartnerSought() 
                        + "\nThere are " + messageList.size() + " messages in the mailbox."
                        + "\n" + getMessageList());
	}
}