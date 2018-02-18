import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;

public class Check05DD
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final double TWO = 2;
		final double THREE = 3;
		final double ONE_OUT_THOUSAND = 0.001;
		
		output.print("Enter any real number ... ");
		double a = input.nextDouble();
		
		//input initial values for difference and output x
		
		double tol = 2;
		double xnew = 2;
		
		for (double x = a; tol > ONE_OUT_THOUSAND; x = xnew)
		{
			double xold = xnew;
			xnew = x - (Math.pow(x, THREE) - a) / Math.pow(THREE * x, TWO);
			tol = Math.abs(xold - xnew);
		}
		output.print("Within 0.0010 the limit is: ");
		output.printf("%.4f", xnew); //we're trying to figure out the value of xnew where the diffrence between it and xold is less than 0.001
	}
}
