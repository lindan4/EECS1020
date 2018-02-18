import java.util.Scanner;
import java.io.PrintStream;
import type.lib.CreditCard;
import type.lib.RewardCard;
import type.lib.GlobalCredit;

public class Check09A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Credit or Reward card? [C or R] ... ");
		String typ = input.nextLine().toUpperCase();
		CreditCard nya;
		
		int passCounter = 0;
		int failCounter = 0;
		
		if (typ.equals("C"))
		{
			nya = new CreditCard(1, "Adam");
			double lim = nya.getLimit();
			output.println("Enter the transactions of this card");
			output.println("(0ne per line, empty line=sentinel)");
			String namn;
			for (namn = input.nextLine(); namn.length() != 0; namn = input.nextLine())
			{
				char ins = namn.charAt(0);
				String inss = namn.substring(0, 1).toUpperCase();
				
				if(inss.equals("C"))
				{
					String subs = namn.substring(1);
					double parseIt = Double.parseDouble(subs);
					boolean cent = nya.charge(parseIt);
					double balans = nya.getBalance();
					if (cent == true)
					{
						passCounter = passCounter + 1;
					}
					else if (cent == false)
					{
						passCounter = passCounter + 1;
						failCounter = failCounter + 1;
						output.println("Failed!");
					}
				}
				if (inss.equals("P"))
				{
					String subsT = namn.substring(1);
					double parseItr = Double.parseDouble(subsT);
					nya.pay(parseItr);
					
					if (parseItr >= 0)
					{
						passCounter = passCounter + 1;
					}
					else if (parseItr < 0)
					{
						passCounter = passCounter + 1;
						failCounter = failCounter + 1;
						output.println("Failed!");
					}
				}
			}
			output.println("Transaction Count = " + passCounter);
			output.println("Rejected Transactions = " + failCounter);
			String bal = String.format("%.2f", nya.getBalance());
			output.println("Card balance = " + bal);
		}
		if (typ.equals("R"))
		{
			nya = new RewardCard(1, "Adam");
			double limR = nya.getLimit();
			output.println("Enter the transactions of this card");
			output.println("(0ne per line, empty line=sentinel)");
			String namnR;
			for (namnR = input.nextLine(); namnR.length() != 0; namnR = input.nextLine())
			{
				char insR = namnR.charAt(0);
				String inssR = namnR.substring(0, 1).toUpperCase();
				
				if(inssR.equals("C"))
				{
					String subsR = namnR.substring(1);
					double parseItR = Double.parseDouble(subsR);
					boolean centR = nya.charge(parseItR);
					double balansR = nya.getBalance();
					
					if (centR == true)
					{
						passCounter = passCounter + 1;
					}
					else if (centR == false)
					{
						passCounter = passCounter + 1;
						failCounter = failCounter + 1;
						output.println("Failed!");
					}
				}
				if (inssR.equals("P"))
				{
					String subsTP = namnR.substring(1);
					double parseItrP = Double.parseDouble(subsTP);
					nya.pay(parseItrP);
					
					if (parseItrP >= 0)
					{
						passCounter = passCounter + 1;
					}
					else if (parseItrP < 0)
					{
						passCounter = passCounter + 1;
						failCounter = failCounter + 1;
						output.println("Failed!");
					}
				}
			}
			output.println("Transaction Count = " + passCounter);
			output.println("Rejected Transactions = " + failCounter);
			String bal = String.format("%.2f", nya.getBalance());
			output.println("Card balance = " + bal);
		}
		
	}
}
			
	

