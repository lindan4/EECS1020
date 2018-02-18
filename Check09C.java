import java.util.Scanner;
import java.io.PrintStream;
import java.text.DecimalFormat;
import type.lib.Fraction;
import type.lib.MixedNumber;
import type.lib.Money;

public class Check09C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Sample size?");
		int samSize = input.nextInt();
		
		Money peso = new Money();
		int counter = 0;
		int mixedCounter = 0;
		String ins = "";
		for (int i = 0; i < samSize; i = i + 1)
		{
			Fraction fract = peso.getRandom();
			
			if (fract instanceof Money)
			{
				ins = fract.toString();
			}
			if (fract instanceof MixedNumber)
			{
				ins = fract.toString();
				if (ins.startsWith("-") == true)
				{
					mixedCounter = mixedCounter + 1;
				}
			}
			if (fract instanceof Fraction)
			{
				ins = fract.toString();
			}
			counter = counter + 1;
			output.println(i + "\t" + ins);
		}
		int positiveCounter = counter - mixedCounter;
		output.println(counter);
		output.println(mixedCounter);
		output.println(positiveCounter);
	}
}
