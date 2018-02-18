import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;
import java.util.StringTokenizer;

public class BAMI
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter weight in lbs. ");
		double weight = input.nextDouble();
		
		output.print("Enter height in ft'in. ");
		String height = input.next();
		
		final int INCHES_IN_FEET = 12;
		final int TO_BMI = 703;
		
		StringTokenizer st = new StringTokenizer(height, "'");
		
		String feet = st.nextToken();
		double feetToInchesParsed = (Double.parseDouble(feet)) * INCHES_IN_FEET;
		String inches = st.nextToken();
		double inchesParsed = Double.parseDouble(inches);
		
		double totalInches = feetToInchesParsed + inchesParsed;
		
		double totalInchesRaised = Math.pow(totalInches, 2);
		
		double bmi = (weight / totalInchesRaised) * TO_BMI;
		String bmiFormat = String.format("%.1f", bmi);
		output.println("BMI: " + bmiFormat);
		
	}
}
