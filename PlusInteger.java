import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class PlusInteger
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter file name: ");
		String fileName = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(fileName));
		
		while (fileInput.hasNextInt())
		{
			int Number = fileInput.nextInt();
			//fileInput.close();
			int Division = 0;
			if (Number < 0)
			{
				output.println("Invalid integer!");
			}
			else
			{
				for (int n = 1; Division != 1; n = n + 1)
				{
					Division = Number / n;
					if ( Number % n == 0)
					{
						output.println(n);
					}
				}
			}
			
		}
		
	}
}	
		
		
//Goal: divide an integer by any number and output its factors
//1. if statement to negate values below zero
//2. Divide the integer by the number n until the factor is 1
//3. As this is happening, output all numbers that result in whole numbers and 
