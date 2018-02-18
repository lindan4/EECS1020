import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Portfolio;
import type.lib.Investment;
import type.lib.Stock;
import java.text.DecimalFormat;

//Issue: format double number to include comma between third and fourth digit
//Issue: incorporate 'no stock below cutoff' string

public class Check08B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Cutoff Price........ ");
		double cutoff = input.nextDouble();
		
		Portfolio myPort = new Portfolio().getRandom();
		DecimalFormat fort = new DecimalFormat("###,###,###,###.00");
		String name = myPort.getName();
		int capacity = myPort.getCapacity();
		int count = myPort.size();
		
		output.println("Portfolio Name...... " + name);
		output.println("Portfolio Capacity.. " + capacity);
		output.println("Investment Count.... " + count + "\n");
		double oldPrice = 0;
		double newPrice = 0;
		for (Investment it : myPort)
		{
			Stock stok = it.getStock();
			int quan = it.getQty();
			double quant = (double) quan;
			String nehm = stok.getName();
			double pris = stok.getPrice();
			String prisForm = String.format("%.2f", pris);
			
			if (pris < cutoff)
			{
				double prod = quant * pris;
				newPrice = prod + newPrice;
				oldPrice = newPrice;
				output.println(quan + "\t" +  prisForm + "\t" + nehm);
			}
		}
		if (newPrice == 0)
		{
			output.println("\nThere are no stocks below your cutoff!");
		}
		else
		{
			String nyaa = fort.format(newPrice);
			//String nya = String.format("%.2f", newPrice);
			output.println("\nValue of portfolio below cutoff is: " + nyaa);
		}	
			
		
	}
}
		
		
