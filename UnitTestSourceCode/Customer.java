/*
 * Title: Customer.java 
 * Date: 20 June 2015
 * Author: z4pu
 * Filename: Customer.java 
 * Purpose: Class managing details common to all Customers. Inherited by 
 * Advertiser and Responder classes
 * Assumptions:  
 */

package dating;
public class Customer 
{

	// define attributes	
	
		private String login;
		private String password;
		private char gender;
		private int age;
		private int income;
		private char customerType;

	//constructor 
	//default constructor //assigns default values to attributes; has no parameters
	public Customer()
	{
		login = " ";
		password = " ";
		gender = ' ';
		age = 0;
		income = 0;
		customerType = ' ';
	}

	//constructor with parameters 
	// aka specific constructor 
	// will contain arguments or specific names for objects
	public Customer(String l, String p, char g, int a, int i, char ct)
	{
		login = l;
		password = p;
		gender = g;
		age = a;
		income = i;
		customerType = ct;
	}

	//setters 
	public void setLogin (String l)
	{
		login = l;
	}

	public void setPassword (String p)
	{
		password = p;
	}

	public void setGender (char g)
	{
		gender = g;
	}

	public void setAge (int a)
	{
		age = a;
	}
	
	public void setIncome (int i)
	{
		income = i;
	}
	
	public void setCustomerType (char ct)
	{
		customerType = ct;
	}
	
	public void setCustomer(String l, String p, char g, int a, int i, char ct)
	{
		login = l;
		password = p;
		gender = g;
		age = a;
		income = i;
		customerType = ct;
	}

	// getters
	public String getLogin ()
	{
		return login;
	}
	
	public String getPassword ()
	{
		return password;
	}

	public char getGender ()
	{
		return gender;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	public int getIncome ()
	{
		return income;
	}

	public char getCustomerType ()
	{
		return customerType;
	}
	
	public Customer getCustomer ()
	{
		return this;
	}	
	
	// to print PartnerSought details
        
       @Override
	public String toString()
	{
		return ("Login: " + login + "     Password: " + password + 
                        "\nGender: " + gender + "     Age: " + age+ 
                        " \nIncome: " + income + "     Customer Type: " + customerType);
	}
}



