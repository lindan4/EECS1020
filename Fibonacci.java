import java.io.PrintStream;
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        int f0 = 0;
		int f1 = 1;
		int f = f0 + f1;
		
		output.print("Enter an index for the Fibonacci number (>= 2): ");
		int n = input.nextInt();
		for (int i = 2; i <= n; i++)
		{
			f = f0 + f1;
			f0 = f1;
			f1 = f;
		}
		output.println(f);
    }
}
