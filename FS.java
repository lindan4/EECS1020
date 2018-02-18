import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class FS
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the file name: ");
		String fileName = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(fileName));
		
		final int LIMIT = 5;
		
		while (fileInput.hasNextInt())
		{
			int a = fileInput.nextInt();
			int b = fileInput.nextInt();
			int c = fileInput.nextInt();
			
			for (int i = 0; i < LIMIT; i = i + 1)
			{	
				a = b;
				b = c;
				c = a + b;
				output.println(c);
			}
		}	
	}
}
		

		
		
		
//Goal: output the fibonacci sequence of the nth number using an external file that has the initial values
//1. 

