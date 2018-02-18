import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Character;
import java.lang.String;

public class CharUnd
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter a character: ");
		String s = new String(input.nextLine());
		int value = s.charAt(0);
		
		output.print("The character value of " + s + " is " + value);
	}
}
