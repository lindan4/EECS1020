import java.util.*;
import java.io.PrintStream;
import type.lib.*;

public class Check12B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter item number ... ");
		String itemNo = input.nextLine();
		AbstractFoods at = AbstractFoods.getRandom();
		Map<String, Item> list = at.getInventory();
		Map<String, Contact> kontakt = at.getContacts();
		
		Item desig = list.get(itemNo);
		if (desig == null)
		{
			output.println("No such item!");
		}
		else
		{
			output.println("Item Details:");
			output.println("Description:\t" + desig.getName());
			output.println("Qty in stock:\t" + desig.getStock());
			String salePrice = String.format("%.2f", desig.getUnitPrice());
			output.println("Sale Price:\t" + salePrice);
			output.println("Sold Quantity:\t" + desig.getSoldQty());
			String sales = String.format("%.2f", desig.getSales());
			output.println("Sales [in $]:\t" + sales);
			
			Set<String> sk = kontakt.keySet();
			for (String no : sk)
			{
				Contact person = kontakt.get(no);
				if (person instanceof Supplier)
				{
					Supplier usePerson = (Supplier) person;
					Map<Item, Double> katalog = usePerson.getCatalog();
					Set<Item> itemKatalog = katalog.keySet();
					for (Item matchItem : itemKatalog)
					{
						String itemNoKatalog = matchItem.getNumber();
						
						if (itemNoKatalog.equals(itemNo))
						{
							output.println("Supplier:\t" + usePerson.getName());
						}
					}
				}
			}
		}
	}
}
