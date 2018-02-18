import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Stock;
import java.io.File;
import java.io.IOException;

//there is an exception
//hint: try using loops

public class Check05B
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter filename ... ");
		String filename = input.nextLine();
		
		Scanner inputFile = new Scanner(new File(filename));
		PrintStream outputFile = new PrintStream(filename);
		
		String symbol = inputFile.nextLine();
		int values = inputFile.nextInt();
		
		Stock s = new Stock(symbol);
		String namn = s.getName();
		
		if (namn == null)
		{
			output.print("Symbol " + symbol + " does not exist!");
		}
		else if (namn != null)
		{
			double price = s.getPrice();
			double realValues = (double) values;
			
			double portfolio = price * realValues;
			output.print(portfolio);
		}
	}
}	
