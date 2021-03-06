//Issue: Need to figure out how to ignore blank space
//Solution: use continue

//Issue: incorrect card balance
//Solution: 

import java.util.Scanner;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.io.File;
import type.lib.CreditCard;
import java.util.Formatter;

public class Check07A
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter name, limit, and trx filename (comma-delimited):");
		final String delim = ",";
		String title = input.nextLine();
		StringTokenizer st = new StringTokenizer(title, delim);
		
		String name = st.nextToken();
		String limit = st.nextToken();
		String fileName = st.nextToken();
		
		final String complete = "done.";
		final String incomplete = "rejected.";
		
		double cardLimit = Double.parseDouble(limit);
		
		CreditCard neu = new CreditCard(1120, name, cardLimit);
		
		Scanner fileInput = new Scanner(new File(fileName));
		
		int recordNumber = 0;
		for (String x = fileInput.nextLine(); fileInput.hasNextLine(); x = fileInput.nextLine())
		{
			String pormatter = String.format("%05d", recordNumber);
			StringTokenizer tu = new StringTokenizer(x);
			
			if (tu.countTokens() != 2)
			{
				output.println(pormatter + " invalid record.");
				recordNumber = recordNumber + 1;
				continue; //if there aren't 2 tokens, re-execute the loop
			}
			
			String y = tu.nextToken().toUpperCase();
			String z = tu.nextToken();
			Double change = Double.parseDouble(z);
			String sormatter = String.format("%.2f", change);
			
			char letter = y.charAt(0);
			
			if(letter == 'C')
			{
				neu.charge(change);
				if (neu.charge(change) == true)
				{
					output.println(pormatter + " " + y + "     " + sormatter + " " + complete);
				}
				else
				{
					output.println(pormatter + " " + y + "     " + sormatter + " " + incomplete);
				}
				
			}
			
			if (letter == 'P')
			{
				neu.pay(change);
				output.println(pormatter + " " + y + "     " + sormatter + " " + complete);

			}
			if (letter == 'L')
			{
				neu.setLimit(change);
				if (neu.setLimit(change) == true)
				{
					output.println(pormatter + " " + y + "     " + sormatter + " " + complete);
				}
				else
				{
					output.println(pormatter + " " + y + "     " + sormatter + " " + incomplete);
				}
			}
			recordNumber = recordNumber + 1;
		}
		double available = neu.getBalance();
		String seqBalance = String.format("%.2f", available);
		double limits = neu.getLimit();
		String seqLimits = String.format("%.2f", limits);
		
		output.print("Card Balance =   " + seqBalance + "\nCredit Limit =   " + seqLimits);
	}
}


//Goal: initiate transactions on a credit card through the information in a file
//1. Read string and separate information wherever there's a comma
//2. Parse limit into double
//3. Split first line statement

// C = Charge to card
// P = Pay from card
// L = change Limit

