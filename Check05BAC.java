import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Stock;
import java.io.File;
//import java.io.IOException;

public class Check05BAC
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter filename ... ");
		String filename = input.next();
		
		Stock s = new Stock();
		
		Scanner fileInput = new Scanner(new File(filename));
		
		int lineCount = 0; //increments
		double totalOutput = 0; //will be modified soon
		double totalPerStock = 0; //will be modified soon
		double priceOutput;
		String zeros = "0000"; //the zeros preceeding the number
		
		
		while (fileInput.hasNext())
		{
			String symbol = fileInput.next(); //Symbols are read here
			s.setSymbol(symbol); //stock is mutated from blank to having a symbol
			//int shares = fileInput.nextInt(); do not include
			
			if (lineCount >= 10) //if there are more than or is there are 10 increments
			{
				String index = "000";
			}
			if (s.getPrice == 0) //makes sense as there is no price for an invalid symbol
			{
				output.println("Symbol " + symbol + " does not exist!"); // the symbol from the file that was read
				priceOutput = 0;
			}
			else if (s.getPrice != 0)
			{
				double price = s.getPrice();
				output.printf("%.2f\n", price);
			}
			
			double amountStock = fileinput.nextDouble();
			lineCount = lineCount + 2;
			
			double portfolio = price * amountStock;
			
			
				
			//Stock s = new Stock(symbol); should not be part of loop
			String name = s.getName();
			String extension = s.getSymbol();
			double stockPrice = s.getPrice();
			
			int d = 00000;
			final int LIMIT = 00006;
			
			for(; d <= LIMIT; d = d + 2)
			{
				output.println(d);
				output.print(" ");
				if (name != null)
				{
					output.printf("\n%.2f", stockPrice);
				}
				else if (name == null)
				{
					output.print("\nSymbol " + extension + " does not exist!");
				}
			}
			double totalvalue = stockPrice * (double) shares;
			output.println("Total value = " + totalvalue);
		}	
		
	}
}
