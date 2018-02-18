import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import type.lib.Stock;
import java.io.IOException;

public class Check05BB
{
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter filename ... ");
		String filename = input.nextLine();
		
		Scanner fileinput = new Scanner(new File(filename));
		
		while (fileinput.hasNext())
		{
			String symbol = fileinput.next();
			int shares = fileinput.nextInt();
			
			Stock s = new Stock(symbol);
			
			final int LIMIT = 00006;
			
			int d;
			for (d = 00000; d <= LIMIT; d = d + 00002)
			{	
				
				output.printf("\n%05d", d);
				if (s.getName() == null)
				{
					output.print("Symbol " + symbol + " does not exist!");
				}	
	
			}
		}
	}
}
			
		
