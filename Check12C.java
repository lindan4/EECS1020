import java.util.*;
import java.io.PrintStream;
import type.lib.*;

public class Check12C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter item number:");
		String itemNo = input.nextLine();
		
		AbstractFoods at = AbstractFoods.getRandom();
		
		Map<String, Item> inv = at.getInventory();
		List<Trx> jour = at.getJournal();
		
		Item typ = inv.get(itemNo);
		if (typ == null)
		{
			output.println("No such item!");
		}
		else
		{
			output.println("Sold Qty =\t" + typ.getSoldQty());
			String sales = String.format("%.2f", typ.getSales());
			output.println("Sales $$ =\t" + sales);
			output.println("Drill-down:");
			for (Trx tx : jour)
			{
				Item neue = tx.getItem();
				if (itemNo.equals(neue.getNumber()))
				{
					String amountFormat = String.format("%.2f", tx.getAmount());
					output.println(tx.getRef() + "\t" + tx.getQty() + "\t" + amountFormat);
				}
			}
		}
	}
}
		
