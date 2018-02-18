import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;

public class BMItime
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		final int INCHES_IN_FEET = 12;
		final int BMI_CONVERSION = 703;
		
		output.print("Enter weight in lbs. ");
		double weight = input.nextDouble();
		
		output.print("Enter height in ft'in. ");
		String height = input.nextLine();
		
		int quote = height.indexOf("'");

		String feetInString = height.substring(0, quote);
		
		int toInches = (Integer.parseInt(feetInString) * INCHES_IN_FEET);
		
		String inchesInString = height.substring(quote);
		int givInch = Integer.parseInt(inchesInString);
		
		int totalInches = toInches + givInch;
		
		double heightRaised = Math.pow(totalInches, 2);
		
		double bmi = (weight / heightRaised) * BMI_CONVERSION;
		
		String bmiForm = String.format("%.1f", bmi);
		
		output.println("BMI: " + bmiForm);
	}

}
