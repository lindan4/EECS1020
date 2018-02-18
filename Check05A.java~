import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Equation;

public class Check05A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter a,b,c pressing ENTER after each...");
		final double a = input.nextDouble();
		final double b = input.nextDouble();
		final double c = input.nextDouble();
		
		Equation secondDegree = new Equation(a, b, c);
		
		int count = secondDegree.getRootCount();
		String quadraticEquation = secondDegree.toString();
		if (count == 0)
		{
			output.print("The equation: " + quadraticEquation + " has no real\nroots.");
		}
		else if (count == 1)
		{
			double singleRoot = secondDegree.getRoot(1);
			output.print("The equation: " + quadraticEquation + " has the single\nroot: " + singleRoot); 
		}
		else if (count == 2)
		{
			double doubleRoot = secondDegree.getRoot(1);
			double doubleRoot2 = secondDegree.getRoot(2);
			output.print("The equation: " + quadraticEquation + " has the two\nroots: " + doubleRoot);
			output.print(" and " + doubleRoot2);
		}
		//Program terminates after inputting a, b, and c as zero
		//To counter this, set the count condition so that it does not equal zero, one, or two
		else if (count != 0 && count != 1 && count != 2)
		{
			output.print("The equation: " + quadraticEquation + " is an identity - any value is a root.");
		}
	}
}
		
		
		
		
