import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;
import java.io.File;

public class Table
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		output.print("Enter the file name: ");
		String fileName = input.nextLine();
		Scanner fileInput = new Scanner(new File(fileName));
		
		while (fileInput.hasNext())
		{
			
		
	}
}


//Goal: create a multiplication table
//1. Declare variable for the horizontal axis
//2. Declare variable for the vertica axis
//3. Initialize first variable to be 1
//4. Initialize second variable to be 1
		
		

