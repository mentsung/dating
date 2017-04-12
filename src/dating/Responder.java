/*
 * Title: Responder.java 
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: Responder.java 
 * Purpose: Class managing details of Responders to advertisements
 * placed by Advertisers. Inherits from Customer class. 
 * Assumptions:  
 */

package dating;
public class Responder extends Customer
{

	// no additional attributes	
	

	//constructors 
	//default constructor //assigns default values to attributes; has no parameters
	public Responder()
	{
		super();
	}

	// specific constructor 
	// will contain arguments or specific names for objects
	public Responder(String l, String p, char g, int a, int i, char ct)
	{
		super(l,p,g,a,i,ct);
	}

	//setters 
	
	public void setResponder(String l, String p, char g, int a, int i, char ct)
	{
		setCustomer(l,p,g,a,i,ct);
	}

	// getters
	public Responder getResponder ()
	{
		return this;
	}
	
	// print Responder details
       @Override
	public String toString()
	{
		return(super.toString());
	}
}