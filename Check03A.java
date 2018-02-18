import java.util.Scanner;
import java.io.PrintStream;
import type.lib.ToolBox;

public class Check03A

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter the temperature in Fahrenheit");
		double Fahren = input.nextDouble();
		ToolBox.crash(Fahren < -250, "Invalid amount");
		
		final double A = 5;
		final double B = 9;
		final double subt = 32;
		
		double celsius = (A / B) * (Fahren - subt);
		output.print(Fahren + " F = ");
		output.printf("%.1f", celsius);
		output.print(" C");
	}
}
