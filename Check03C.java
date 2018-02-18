import java.util.Scanner;
import java.io.PrintStream;
import type.lib.ToolBox;

public class Check03C

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final double MANADER_I_AR = 12;
		
		output.print("Mortgage amount: ");
		double amount = input.nextDouble();
		
		output.print("Annual interest percent: ");
		double rate = input.nextDouble();
		
		output.print("Number of years: ");
		int period = input.nextInt();
		
		double MonthlyPayment = ToolBox.mortgagePayment(amount, rate, period);
		double MonthToYear = period * MANADER_I_AR;
		
		output.print("Monthly payment = $");
		output.printf("%.2f", MonthlyPayment);
		
		output.print("\nTotal of all payments = $");
		output.printf("%.2f", MonthlyPayment * MonthToYear);
	}
}
		
		
		
