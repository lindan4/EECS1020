import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Item;
import java.lang.String;

public class Check04D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		String milknumber = "750";
		String milkname = "Milk carton";
		final double price = 3.45;
		
		Item milch = new Item(milknumber, milkname, price);
		
		output.println("First order:");
		output.print("Quantity purchased ... ");
		final int qtotal1 = input.nextInt();		
		output.print("Cost of purchase ... ");
		final double ctotal1 = input.nextDouble();
		
		output.println("Second order:");
		output.print("Quantity purchased ... ");
		final int qtotal2 = input.nextInt();
		output.print("Cost of purchase ... ");
		final double ctotal2 = input.nextDouble();
		
		// use mutator method purchase() on milch
		milch.purchase(qtotal1, ctotal1);
		milch.purchase(qtotal2, ctotal2);
		
		String barcode = milch.toString();
		output.print("toString yields ...... " + barcode);
			
		
		//gives unit sale price
		double unitcost = milch.getUnitCost();
		output.print("\ngetUnitCost yields ... ");
		output.printf("%.2f", unitcost);
	}
}
