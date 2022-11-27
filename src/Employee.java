/**
 * Program Name: Employee.java
 * Purpose: Abstract superclass
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */
 
public abstract class Employee implements Payable
{
	//Properties
	private String firstName;
	private String lastName;
	private String sinNumber;
	
	//Three-argument constructor
	Employee(String frtName, String lstName, String sinNum)
	{
		firstName = frtName;
		lastName = lstName;
		sinNumber = sinNum;
	}//end constructor

	
	//getters and setters
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}
	
	public String getSinNumber()
	{
		return sinNumber;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	
	//Methods
	
	/*Method Name: getEarnings()
	*Purpose: abstract method
	*Accepts: double
	*Returns: double
	*/
	public abstract double getEarnings();
	

	/*Method Name: toString()
	*Purpose: concatenate strings and variables.
	*Accepts: Many types
	*Returns: String
	*/
	public String toString()
	{
		return "Last Name    First Name      SIN\n" + lastName + "          "+ firstName + "      " + sinNumber;
	}
	
	
	/*Method Name: generatePaymentAmount()
	*Purpose: override Method
	*Accepts: double
	*Returns: double
	*/
	public double generatePaymentAmount()
	{
		return 0;
	}
	
}//end class