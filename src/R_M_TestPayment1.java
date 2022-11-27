/**
 * Program Name: R_M_TestPayment1.java
 * Purpose:Test a polymorphic behaviour
 * Coder: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: Mar 8, 2019 
 */

public class R_M_TestPayment1
{

	public static void main(String[] args)
	{
		//testArray that can hold any type of Employee or an Invoice
		Payable[] testArray = new Payable[10];
		
		//create invoice objects
		testArray[0] = new Invoice("Feb0001","AW234","Widget",25,2.99);
		testArray[1] = new Invoice("Feb0002", "AF235", "Flange", 125, 3.37);
		testArray[2] = new SalariedEmployee("Diana", "Orr", "111-111-111", 2459.85);
		testArray[3] = new CommissionEmployee("David", "Kimberly", "222-222-222", 0.125, 49378.98);
		testArray[4] = new SalPlusCommEmployee("Ken", "Bonvanie", "333-333-333", 8477.95, 0.085, 500);
		testArray[5] = new HourlyEmployee("Jane", "Robertson", "444-444-444", 17.85, 87.5);
		
		
		// process each element in array testArray
		Payable presentPayable;
		for (int i=0; i< 6; i++) 
		{
			presentPayable = testArray[i];
			System.out.println(presentPayable.toString()+" "+ presentPayable.generatePaymentAmount() +"\n"); 
		} // end for	

	}	//end main
}
//end class