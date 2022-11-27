/**
 * Program Name: SalariedEmployee.java
 * Purpose: sub class of Employee
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */

public class SalariedEmployee extends Employee
{
	//Properties
	private double salary;
	
	//Four-argument constructor
	SalariedEmployee(String firstName, String lastName, String sinNumber, double slry)
	{
		super(firstName, lastName, sinNumber);
		salary = slry;		
	}//end constructor
	
	
	//getters and setters
	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	//Methods
	
	/*Method Name: getEarnings()
	*Purpose: Override method
	*Accepts: double
	*Returns: double
	*/
	public double getEarnings()
	{
		return getSalary();
	}
	
	/*Method Name: toString()
	*Purpose: concatenate strings and variables.
	*Accepts: Many types
	*Returns: String
	*/
	public String toString()
	{
		return super.toString() + "\nThis employee is a salaried employee with a mothly salary $" + salary 
				+ "\nPayment amount generated is $";
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