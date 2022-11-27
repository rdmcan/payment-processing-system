/**
 * Program Name: CommisionEmployee.java
 * Purpose: sub class of Employee
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */

public class CommissionEmployee extends Employee
{
	//Properties
	private double commRate; //percentage commission //entered as a decimal value
	private double salesMade; //dollars worth of goods the employee has sold this month.
	
	//Five-argument constructor
	CommissionEmployee(String firstName, String lastName, String sinNumber, double cRate, double salMade)
	{
		super(firstName, lastName, sinNumber);
		setCommRate(cRate);
		salesMade = salMade;
	}//end constructor

	//getters and setters
	public double getCommRate()
	{
		return commRate;
	}

	public void setCommRate(double commRate)
	{
		if (commRate > 0.0 && commRate < 1.0)
			this.commRate = commRate;
	}

	public double getSalesMade()
	{
		return salesMade;
	}

	public void setSalesMade(double salesMade)
	{
			this.salesMade = salesMade;
	}
		
	//Methods
	
	/*Method Name: getEarnings()
	*Purpose: Override
	*Accepts: double
	*Returns: double
	*/
	public double getEarnings()
	{
		double roundOff = getSalesMade() * getCommRate();
		roundOff = ((int)((roundOff)*100));
		return (double)roundOff/100;
	}

	/*Method Name: toString()
	*Purpose: concatenate strings and variables.
	*Accepts: Many types
	*Returns: String
	*/
	public String toString()
	{
		return super.toString() + "\nThis employee is commision employee with a commision rate of: " 
	+ getCommRate()*100 + "%. " + "\nThis employee's earnings for the month are $" + getEarnings() 
	+ " on sales of $" + getSalesMade() + "\nPayment amount generated is $";
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
	
}//end class