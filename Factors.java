import java.io.PrintStream;
import java.util.Scanner;

public class Factors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        
		output.print("Enter a number to factor: ");
		int n = input.nextInt();
		output.print("The factors are:");
		for (int i = 2; i <= n / 2; i++)
		{
			if (n % i == 0)
			{
				output.print(" " + i);
			}
		}
		output.println();
    }
}
