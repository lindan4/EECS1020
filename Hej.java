import java.util.Scanner;
import java.io.PrintStream;

public class Hej

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("What is your name?");
		String namn = input.nextLine();
		output.print("Hello " + namn);
	}
}
