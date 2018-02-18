import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class imail
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the file name: ");
		String fileName = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(fileName));
		
		final String regex = "\\w+@+\\w+.+[com|ca|co.uk]+";
		
		for (String x = fileInput.next(); fileInput.hasNext(); x = fileInput.next())
		{
			if (x.matches(regex))
			{
				output.println(x);
			}
		}
	}
	
}
				
