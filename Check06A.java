import java.util.Scanner;
import java.io.PrintStream;
import java.lang.String;
import java.lang.Integer;

public class Check06A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter a slashed month embedded in any string");
		
		String n;
		final String SENTINEL = "-1";
		
		for (n = input.nextLine(); n != SENTINEL; n = input.nextLine())
		{
			String results = new String(n);
		
		
		//1. Program finds first pair of slashes
			int beginIndex = results.indexOf('/');
			int endIndex = results.indexOf('/', beginIndex+1);
		
		//2. Digits between pair are to be converted into a number
			String firstNumber = results.substring(beginIndex+1, endIndex);
		
			int monthNumber = Integer.parseInt(firstNumber);
		
		//output.print("" + monthNumber);
		//output.print("" + endIndex);
		
			output.println("*********************************************");
			final int THREE = 3; 
		
		//3. The number is to seen as the number of a month
			if (monthNumber / THREE == 0)
			{
				output.println("This is the first quarter.");
			} else if (monthNumber / THREE == 1)
			{
				output.println("This is the second quarter.");
			} else if (monthNumber / THREE == 2)
			{
				output.println("This is the third quarter.");
			} else if (monthNumber / THREE == 3 || monthNumber / THREE == 4 && monthNumber % THREE == 0)
			{
				output.println("This is the fourth quarter.");
			}
			output.println("Enter a slashed month embedded in any string");
		}
	}
}
		// Return index of first slash
		// Return index of sceond slash
		
		
//1. Program finds first pair of slashes
//2. Digits between pair are to be converted into a number
//3. The number is to seen as the number of a month
//4. The quarter which the month is in is outputted

//substring = 
