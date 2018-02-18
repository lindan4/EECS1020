import java.util.Scanner;
import java.io.PrintStream;
import type.lib.ToolBox;

public class EellerO

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("State a number: ");
		int statenumber = input.nextInt();
		int determinant = (statenumber % 2);
		
		ToolBox.crash(determinant == 0, "The number" + statenumber + "is even.");
		ToolBox.crash(determinant != 0, "The number" + statenumber + "is odd.");
	}
}
