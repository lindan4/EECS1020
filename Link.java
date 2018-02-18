import java.util.Scanner;
import java.io.PrintStream;

public class Link

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Type in the first fragment of a sentence: ");
		String forst = input.nextLine();
		output.print("Type in the second fragment of the sentence: ");
		String andra = input.nextLine();
		
		output.print("Combining the fragments gives you: ");
		output.println(forst + " " + andra);
		
	}
}
