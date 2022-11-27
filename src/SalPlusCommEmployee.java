/**
 * Program Name: SalPlusCommEmployee.java
 * Purpose: sub class of  CommisionEmployee
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */

public class SalPlusCommEmployee extends CommissionEmployee
{
	//Properties
	private double baseSalary;
	
	//Six-argument constructor
	SalPlusCommEmployee(String firstName, String lastName, String sinNumber, double salesMade, double commRate, double basSalary)
	{
		super(firstName, lastName, sinNumber, commRate, salesMade);
		baseSalary = basSalary;
	}//end constructor
	
	//getters and setters
	public double getBaseSalary()
	{
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	
	
	//Methods
	
	/*Method Name: getEarnings()
	*Purpose: Override method
	*Accepts: double
	*Returns: double
	*/
	public double getEarnings()
	{
		double roundOff = getSalesMade() * getCommRate();
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
		
		return "\nThis employee is a probationary sales employee who also receives a base salary of: $" + 
				 (int)getBaseSalary() + "\nTheir straight commission earnings for the period were $" + getEarnings() + ""
				 + "\n" + super.toString();
	}
	
}//end class