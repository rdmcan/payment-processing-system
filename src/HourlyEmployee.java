/**
 * Program Name: HourlyEmployee.java
 * Purpose: sub class of Employee
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */

public class HourlyEmployee extends Employee
{
	//Properties
	private double rate; //hourly pay rate
	private double hours; //hours worked in a a month
	
	//Five-argument constructor
	HourlyEmployee(String firstName, String lastName, String sinNumber, double rt, double hrs)
	{
		super(firstName, lastName, sinNumber);
		rate = rt;
		hours = hrs;
	}//end constructor
	
	//getters and setters
	public double getRate()
	{
		return rate;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public void setRate(double rate)
	{
		this.rate = rate*100;
	}

	//Methods
	
	/*Method Name: getEarnings()
	*Purpose: Override method
	*Accepts: double
	*Returns: double
	*/
	public double getEarnings()
	{
		double roundOff = getRate() * getHours();
		roundOff = ((int)((roundOff)*100));
		roundOff =roundOff/100;
		return roundOff;
	}
	
	/*Method Name: generatePaymentAmount()
	*Purpose: override Method
	*Accepts: double
	*Returns: double
	*/
	public double generatePaymentAmount()
	{
		return getEarnings();
	}
		
	/*Method Name: toString()
	*Purpose: concatenate strings and variables.
	*Accepts: Many types
	*Returns: String
	*/
	public String toString()
	{
		
		return super.toString() + "\nThis employee is a hourly paid employee with an hourly rate of $" + 
				rate + "\nThis employee's earnings for the month are: $" + getEarnings() + " base on: " + getHours() +
				" hours" + "\nPayment amount generated is $";
	}

}//end class