/*
 * Title: PartnerSought.java 
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: PartnerSought.java 
 * Purpose: Class managing details of partner sought by an Advertiser
 * Assumptions: Each advertiser can only place one description of a partner sought 
 */
package dating;

public class PartnerSought 
{

	// define attributes	
	
		private char gender;
		private int minimumAge;
		private int maximumAge;
		private int minIncome;
		private int maxIncome;

	//constructor 
	//default constructor //assigns default values to attributes; has no parameters
	public PartnerSought()
	{
		gender = ' ';
		minimumAge = 0;
		maximumAge = 0;
		minIncome = 0;
		maxIncome = 0;
	}

	//constructor with parameters 
	// aka specific constructor 
	// will contain arguments or specific names for objects
	public PartnerSought(char gp, int mina, int maxa, int mini, int maxi)
	{
		gender = gp;
		minimumAge = mina;
		maximumAge = maxa;
		minIncome = mini;
		maxIncome = maxi;
	}

	//setters 
	public void setPSGender (char gp)
	{
		gender = gp;
	}

	public void setPSminimumAge (int mina)
	{
		minimumAge = mina;
	}

	public void setPSmaximumAge (int maxa)
	{
		maximumAge = maxa;
	}

	public void setPSminimumIncome (int mini)
	{
		minIncome = mini;
	}
	
	public void setPSmaximumIncome (int maxi)
	{
		maxIncome = maxi;
	}
	
	public void setPartnerSought (char gp, int mina, int maxa, int mini, int maxi)
	{
		gender = gp;
		minimumAge = mina;
		maximumAge = maxa;
		minIncome = mini;
		maxIncome = maxi;
	}

	// getters
	public char getPSGender ()
	{
		return gender;
	}
	
	public int getPSminimumAge  ()
	{
		return minimumAge;
	}

	public int getPSmaximumAge  ()
	{
		return maximumAge;
	}
	
	public int getPSminimumIncome ()
	{
		return minIncome;
	}
	
	public int getPSmaximumIncome ()
	{
		return maxIncome;
	}
	
	public PartnerSought getPartnerSought ()
	{
		return this;
	}	
	
	// to print PartnerSought details
        
       @Override
	public String toString()
	{
            return ("Preferred Gender: " + this.gender + "\nPreferred Age: " + this.minimumAge + " to " + this.maximumAge + "\nPreferred Income: " + this.minIncome + " to " + this.maxIncome);
	}      
}