import java.util.Scanner;
import java.io.PrintStream;
import java.util.Date;

public class test
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.out);
		PrintStream ouput = System.out;
		
		Date date = new Date();
		
		String result = "";
		
		output.println("Enter the number of milliseconds since the epoch: ");
		long number = input.nextLong();
		
		date.setTime(number);
		date.toString(result);
		
		output.println("After that many milliseconds, the date is: " +
			result);
	}
}
	


