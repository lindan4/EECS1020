import java.util.Scanner;
import java.io.PrintStream;
import type.lib.GlobalCredit;
import type.lib.CreditCard;
import java.util.Iterator;

public class Check08D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final double HUNDRED = 100;
		
		output.print("Enter trigger level [1-100] ... ");
		double trigger = input.nextDouble() / HUNDRED;
		
		GlobalCredit overseas = new GlobalCredit().getRandom();
		int numbers = overseas.size();
		double nummers = (double) numbers;
		double available = 0;
		double oldAvailable = 0;
		for (CreditCard cre : overseas)
		{
			String nummer = cre.getNumber();
			double firstPrinciple = cre.getLimit();
			int lim = (int) firstPrinciple;
			String limits = "" + lim;
			available = cre.getBalance();
			String round = String.format("%.2f", available);
			
			double div = available / firstPrinciple;
			if (div < trigger)
			{
				output.println(nummer + "\t" + limits + "\t" + round);
			}
			else if (div > trigger)
			{
				output.println(nummer + "*\t" + limits + "\t" + round + "\t\t" + "<");
			}
			available = available + oldAvailable;
			oldAvailable = available;
			
		}
		double average = available / nummers;
		String form = String.format("%.2f", average);
		output.print("\n");
		output.println("Number of cards = " + numbers);
		output.println("Average balance = " + form);
		
		//output.println("" + firstPrinciple);
	}
}
		
//Goal: input a trigger and output an average balance
//Purpose of trigger:
//card balance / credit limit < trigger = line ends
//card balance / credit limit > trigger = <

// Steven used Iterator<CreditCard> = gc.iterator()
