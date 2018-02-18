import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;

public class Check05D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final double THREE = 3;
		final double TWO = 2;
		final double ONE_OUT_THOUSAND = 0.001;
		
		output.print("Enter any real number ... ");
		double a = input.nextDouble();
		double tolerance1 = 1; //create double variable and set it to 1, will be altered soon
		double xNew = 1; //create XNew and set it to 1
		
		
		for (double x = a; tolerance1 > ONE_OUT_THOUSAND; x = xNew) //for each iteration, the result for xNew in one iteration will equal x in the other iteration 
		{
			double xOld = xNew; //value of xOld won't be affected, x = a = xNew = xOld, must equate or else loop will go on
			xNew = x - (Math.pow(x, THREE) - a) / Math.pow(THREE * x, TWO);
			tolerance1 = Math.abs(xOld - xNew);//at some point, when tolerance1 becomes less than ONE_OUT_THOUSAND, the loop will stop
		}
		output.print("Within 0.0010 the limit is: ");
		output.printf("%.4f", xNew);
	}
}
		
		
