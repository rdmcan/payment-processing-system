/**
 * Program Name: R_M_TestSetters.java
 * Purpose:Test setters and getters
 * Coder: Ruben Dario  Mejia Cardona   0864646  Section 2
 * Date: Mar 9, 2019 
 */

public class R_M_TestSetters
{

	public static void main(String[] args)
	{
		//Instantiate for employees as individual objects
		SalariedEmployee Orr = new SalariedEmployee("Diana", "Orr", "111-111-111", 2459.85);
		CommissionEmployee Kimberly = new CommissionEmployee("David", "Kimberly", "222-222-222", 0.125, 49378.98);
		SalPlusCommEmployee Bonvanie =  new SalPlusCommEmployee("Ken", "Bonvanie", "333-333-333", 8477.95, 0.085, 500);
		HourlyEmployee Robertson = new HourlyEmployee("Jane", "Robertson", "444-444-444", 17.85, 87.5);
		
		//print out their current earnings
		System.out.println("getEarnings for each employee:\n");
		System.out.println("Salaried Employee, Diana Orr, earnings $" + Orr.getEarnings());
		System.out.println("Commission Employee, David Kimberly, earnings $" + Kimberly.getEarnings());
		System.out.println("SalPlusComm Employee, Ken Bonvanie, earnings $" + Bonvanie.getEarnings());
		System.out.println("HourlyEmployee, Jane Robertson, earnings $" + Robertson.getEarnings());
		
		//Setter methods to make changes
		Orr.setSalary(2875.95);
		Orr.setLastName("Iron-Orr");
		
		Kimberly.setSalesMade(67875.56);
		Kimberly.setCommRate(0.15);
		
		Bonvanie.setSalesMade(32579.59);
		Bonvanie.setBaseSalary(200);
		
		Robertson.setRate(0.1865);
		
		//print out their earnings after changes
		System.out.println("getEarnings for each employee:\n");
		System.out.println("Salaried Employee, Diana Orr, earnings $" + Orr.getEarnings());
		System.out.println("Commission Employee, David Kimberly, earnings $" + Kimberly.getEarnings());
		System.out.println("SalPlusComm Employee, Ken Bonvanie, earnings $" + Bonvanie.getEarnings());
		System.out.println("HourlyEmployee, Jane Robertson, earnings $" + Robertson.getEarnings());
		
		//call toString()
		System.out.println("\nCall toString() method:\n");
		System.out.println(Orr.toString() + Orr.getEarnings());
		System.out.println(Kimberly.toString() + Kimberly.getEarnings());
		System.out.println(Bonvanie.toString() +  Bonvanie.getEarnings());
		System.out.println("");
		System.out.println(Robertson.toString() + Robertson.getEarnings());
		
	}	//end main
}//end class