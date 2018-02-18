import java.util.*;
import java.io.PrintStream;
import type.lib.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Check12A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter range ... ");
		
		final int RANGE = input.nextInt();
		final int RANGE_IN_DAYS = RANGE * 365;
		SimpleDateFormat neuFormat = new SimpleDateFormat("dd/MM/YYYY");
		Date present = new Date();
		String presentDate = neuFormat.format(present);
		long timeEpo = present.getTime();
		long timeDays = TimeUnit.MILLISECONDS.toDays(timeEpo);
		
		
	
		
		
		AbstractFoods af = AbstractFoods.getRandom();
		Map<String, Item> mp = af.getInventory();
		Set<String> st = mp.keySet();
		
		int counter = 0;
		output.println("Items expiring within your range:");
		for (String itCode : st)
		{
			Item it = mp.get(itCode);
			if (it instanceof Fresh)
			{
				Fresh obj = (Fresh) it;
				Date expiry = obj.getExpiry();
				String expiryDate = neuFormat.format(expiry);
				long itemEpo = expiry.getTime();
				long itemDays = TimeUnit.MILLISECONDS.toDays(itemEpo);
				long diff = itemDays - timeDays;
				
				
				if (diff < RANGE_IN_DAYS)
				{
					output.println(itCode + " " + expiryDate);
					counter = counter + 1;
				}
			
			}
		}
		output.println("count = " + counter);
	}
}
