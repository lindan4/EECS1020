import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Character;
import java.lang.String;

public class CharUndFor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter a character: ");
		
		//final int SENTINEL = -1;
		
		String character;
		for (character = input.nextLine(); character == input.nextLine() ; character = input.nextLine())
		{
				String s = ("" + character);
				int value = s.charAt(0);
				output.println("The character value of " + s + " is " + value); 
		}
		output.print("Enter a character: ");
		}
		
	}
}
