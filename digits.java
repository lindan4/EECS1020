import java.util.Scanner;
import java.io.PrintStream;

public class digits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter a string:");
		String str = input.nextLine();
		
		boolean containsDigits = false;
		
		for (int i = 0; i < str.length(); i++)
		{
			
