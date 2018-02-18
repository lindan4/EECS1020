import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Stock;
import java.io.File;
import java.io.IOException;

public class Check05BA
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter filename ... ");
		String filename = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(filename));
		//PrintStream fileOutput = new PrintStream(filename);
		
		final double LIMIT = 00006;
		
		for (; fileInput.hasNext();)
		{
			String symbol = fileInput.next();
			double shares = fileInput.nextDouble();
			
			Stock s = new Stock(symbol);
			String extension = s.getSymbol();
			String name = s.getName();
			
			double stockPrice = s.getPrice();

			for (double d = 00000; d <= LIMIT; d = d + 2)
			{
				output.println(d);
				if (name != null)
				{
					output.print(" ");
					output.printf("%.2f", stockPrice);
				}
				else if (name == null)
				{
					output.println("Symbol " + extension + " does not exist!");
				}
				//fileInput.close();
			}
			double totalValue = stockPrice * shares;
			output.println("Total value = " + totalValue);			
		}
	}
}
