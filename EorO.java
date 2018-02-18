import java.util.Scanner;
import java.io.PrintStream;

public class EorO
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("State a number: ");
		int nummer = input.nextInt();
		
		if(nummer % 2 == 0)
		output.print("The number " + nummer + " is even.");
		else
		output.print("The number " + nummer + " is odd.");
	}
}
		
		
		
		
