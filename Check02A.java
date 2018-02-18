import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;

public class Check02A

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter any double to test: ");
		double vrai = input.nextDouble();
		
		
		System.out.print("Method Math.rint returns: ");
		double rn = Math.rint(vrai);
		output.println(rn);
		System.out.print("While Math.round returns: ");
		long rou = Math.round(vrai);
		output.println(rou);
	}
}
		
