import java.util.Scanner;
import java.io.PrintStream;
import java.util.Date;

public class Check02D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the number of milliseconds since the epoch: ");
		long tiden = input.nextLong();
		
		output.print("After that many milliseconds, the date is: ");
		long datum = Date.setTime(tiden);
		void datumn = toString();
		output.print(datumn);
	}
} 
