//This program calcualtes a simple income tax based on a flat tax rate.
//You may assume that there are no intentional logic errors in this program and
//that all calculations are correct as written.

inport java.until.scanner;

public class SyntaxErrors
{
	final double TAX_RATE = 0.20;  //The final keywords indicates this is a constant.  
	final double STANDARD_DEDUCTION = 10000.0;  //Constant names are written in all caps by convention.
	final double DEPENDENT_DEDUCTION = 2000.0;
	
	Scanner reader = new Scanner(System.in);
	
	double grossIncome;
	int numDependents;
	int taxableIncome;
	double incomeTax;
	
	System.out.print("Enter the gross income: ")
	grossIncome = reader.nextDouble();
	System.out.print("Enter the number of dependents: ");
	numDependents = reader.nextInt();
	
	taxableIncome = grossincome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
	incomeTax = taxableIncome*TAX_RATE;
	
	System.out.println("The income tax is $" + incomeTax);
}
