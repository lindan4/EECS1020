import java.util.Scanner;
import java.io.PrintStream;

public class FibonacciSE
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		
		
		output.print("Enter an integer: ");
		final int SENTINEL = -1;
		
		int n ;
		for (n = input.nextInt(); n != SENTINEL; n = input.nextInt())
		{
			
			int a = 0;	
			int b = 1;
			int c = 0;
		
			int i;
			for (i = 0; i < n;  i++)
			{
				a = b;
				b = c;
				c = a + b;
			}
			output.print(c);
			output.print("\nEnter an integer: ");
		}
	}
}
		
// 1. F0 = 0, F1 = 1
// 2. First F0  and F1 are added to get 1
// 3. From there, the result (1) and the second number (1) are added together
// 4. The result of that (2) is added to the second number from the previous equation (1) 
