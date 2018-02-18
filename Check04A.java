import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Fraction;

public class Check04A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		Fraction.isQuoted = false;
		
		output.println("For each fraction enter its numerator/denominator, pressing ENTER after each");
		output.println("Enter x");
		final long x1 = input.nextLong();
		final long x2 = input.nextLong();
		
		output.println("Enter y");
		final long y1 = input.nextLong();
		final long y2 = input.nextLong();
		
		output.println("Enter z");
		final long z1 = input.nextLong();
		final long z2 = input.nextLong();
		
		output.println("Enter t");
		final long t1 = input.nextLong();                                                  
		final long t2 = input.nextLong();
		
		Fraction x = new Fraction(x1, x2);
		Fraction y = new Fraction(y1, y2);
		Fraction z = new Fraction(z1, z2);
		Fraction t = new Fraction(t1, t2);
		
		x.add(y);
		z.add(t);
		
		x.divide(z);
		
		long nummer = x.getNumerator();
		long zummer = x.getDenominator();
		
		double nummer2 = (double) nummer;
		double zummer2 = (double) zummer;

		output.print("A = ");
		output.print(nummer);
		output.print(" / ");
		output.print(zummer);
		
		output.print(" = ");
		String s = x.toProperString();
		output.print(s);
		
		
		output.print(" = ");
		output.print(nummer2 / zummer2);
		
		
		

	}
}
		
