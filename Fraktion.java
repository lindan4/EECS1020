import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Fraction;

public class Fraktion

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		Fraction f1 = new Fraction(3, 5);
		
		Fraction f2 = f1;
		
		output.print(f1 == f2);
	
}
