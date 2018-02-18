//Issue: need to find difference between years

import java.util.Scanner;
import java.io.PrintStream;
import type.lib.CreditCard;
import type.lib.GlobalCredit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Check08A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter report range in years ... ");
		final int DAYS_IN_YEAR = 365;
		int jahr = input.nextInt();
		int range = jahr * DAYS_IN_YEAR;
		
		//final String delim = "/";
		SimpleDateFormat eur = new SimpleDateFormat("dd/MM/yyyy");
		
		GlobalCredit neu = new GlobalCredit().getRandom();
		
		int counter = 0;
		
		output.println("Cards expiring before " + jahr + " years from now:");
		for (CreditCard cre : neu)
		{
			String nummer = cre.getNumber();
			Date present = cre.getIssueDate();
			Date expiry = cre.getExpiryDate();
			
			String issueForm = eur.format(present);
			long tid = present.getTime();
			long datum = TimeUnit.MILLISECONDS.toDays(tid);
			
			
			
			String expiryForm = eur.format(expiry);
			long tidTwo = expiry.getTime();
			long datumTwo = TimeUnit.MILLISECONDS.toDays(tidTwo);
			
			long diff = datumTwo - datum;
			int differ = (int) diff;
			
			if (differ < range)
			{
				output.println(nummer + "\t" + expiryForm + "    *");
				counter = counter + 1;
			}
			else if (differ > range)
			{
				output.println(nummer + "\t" + expiryForm);
			}
		}
		output.println("\nFlagged-card count = " + counter);
	}
}
			
			
