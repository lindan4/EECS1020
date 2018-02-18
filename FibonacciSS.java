import java.util.Scanner;
import java.io.PrintStream;

public class FibonacciS

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter an integer where n > 2, -1 to exit: ");
		//int n = input.nextInt();
		
		
		final int SENTINEL = -1; //integer that will end program
		for (int n = input.nextInt(); n != SENTINEL; n = input.nextInt()) //n is inputted by the user, 
		{
			if (n > 2)
			{
				int a = 0;
				int b = 1;
				int c = 0;
			
				for (int i = 1; i <= n; i = i + 1 )
				{
					a = b;
					b = c;
					c = a + b;
				}
			output.println(c);
			}
			output.print("Enter an integer where n > 2, -1 to exit: ");
		}
	}
}
			
