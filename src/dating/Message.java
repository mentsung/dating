/*
 * Title: Message.java 
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: Message.java 
 * Purpose: Class managing details of Messages sent by Responders. Contains an
 * instance of Responder in a composition relationship. Stored in an ArrayList
 * and the ArrayList is a member of the Advertiser class. 
 * Assumptions:  
 */
package dating;
public class Message 
{

	// define attributes	
	
		private Responder R1;
		private String messageText;

	//constructor 
	//default constructor //assigns default values to attributes; has no parameters
	public Message()
	{
		R1 = new Responder();
		messageText = " ";
	}

	//constructor with parameters 
	// aka specific constructor 
	// will contain arguments or specific names for objects
	public Message(String l, String p, char g, int a, int i, char ct, String mt)
	{
		R1 = new Responder(l,p,g,a,i,ct);
		messageText = mt;
	}

	//setters 
	public void setMessageText (String mt)
	{
		messageText = mt;
	}

	public void setMessage (String l, String p, char g, int a, int i, char ct, String mt)
	{
            R1.setResponder(l, p, g, a, i, ct);
            messageText = mt;
	}

	// getters
	public String getMessageText ()
	{
		return messageText;
	}
	
	public Message getMessage  ()
	{
		return this;
	}
	
	// to print Message details
       @Override
	public String toString()
	{
		return ("\nFrom: " + R1.getLogin() + "\nMessage: " + messageText);
	}
}