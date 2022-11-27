/**
 * Program Name: Invoice.java
 * Purpose: models a request for payment
 * Author: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: March 1, 2019
 */

public class Invoice implements Payable
{
	//Properties
	private String invoiceNumber;
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double unitPrice;
	
	//Five-argument constructor
	Invoice(String invoiceNum, String partNum, String partDescrip, int qnty, double unitPri)
	{
		invoiceNumber = invoiceNum;
		partNumber = partNum;
		partDescription = partDescrip;
		quantity = qnty;
		unitPrice = unitPri;		
	}//end constructor
	
	//getters and setters
	public String getInvoiceNumber()
	{
		return invoiceNumber;
	}
	
	public String getPartNumber()
	{
		return partNumber;
	}
	
	public String getPartDescription()
	{
		return partDescription;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getUnitPrice()
	{
		return unitPrice;
	}
	
	
	//Methods
	
	/*Method Name: generatePaymentAmount()
	*Purpose: Override method that calculates total cost
	*Accepts: double
	*Returns: double
	*/
	public double generatePaymentAmount()
	{
		double roundOff = getQuantity() * getUnitPrice();
		roundOff = roundOff*100;
		roundOff = ((int)(roundOff));
		return (double)roundOff/100;
	}
	
	/*Method Name: toString()
	*Purpose: concatenate strings and variables.
	*Accepts: Many types
	*Returns: String
	*/
	public String toString()
	{
		return "Invoice#    PartNumber   Description   Quantity   Unit Price      Total\n" + getInvoiceNumber() + 
				"     " + getPartNumber() + "          " + getPartDescription() + "        " + getQuantity() + 
				"         $" + getUnitPrice() + "         $" + generatePaymentAmount() +  "\nPayment amount generated is $"; 
	}// end method
	
}//end class