import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;
import type.lib.ToolBox;

public class Check05CC
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final int p = 607;
		
		output.println("Enter an integer g [1 < g < 607]");
		int g = input.nextInt();
		ToolBox.crash(g > p, "Integer exceeds limit!");
		
		int remainder = ((g * g) % p);
		int e;
		for (e = 2; remainder != g;)
		{
			remainder = (remainder * g) % p;
			e = e + 1;
		}
		output.println("The smallest e [e > 1 & g^e = g]");
		output.print(e);
	}
}
