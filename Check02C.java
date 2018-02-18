import java.util.Scanner;
import java.io.PrintStream;
import type.lib.ToolBox;

public class Check02C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Height in ft['in]: ");
		String height = input.nextLine();
		output.print("Weight in lb[>0]: ");
		int weight = input.nextInt();
		
		double bmi = ToolBox.getBMI(weight, height);
		System.out.print("The BMI is ");
		output.printf("%.1f", bmi);
		
	}
}
		
		
		
