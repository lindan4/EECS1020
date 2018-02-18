import java.util.Scanner;
import java.io.PrintStream;
import java.util.Date;
import type.lib.Stock;

public class Check04B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		Date d = new Date();
		
		output.print("Enter a stock symbol... ");
		String kompo = input.nextLine();
		Stock stok = new Stock(kompo);
		
		String name = stok.getName();
		double price = stok.getPrice();
		
		output.print("As of " + d + ", the price of a\n" + name + "\nshare is: ");
		output.printf("%.2f", price);
	
	}
}
