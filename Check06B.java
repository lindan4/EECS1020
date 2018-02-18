//Issue with program: supposed to output check number

import java.util.Scanner;
import java.io.PrintStream;

public class Check06B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter a string of digits: ");
		String zipcode;
		for (zipcode = input.nextLine(); zipcode != "stop"; zipcode = input.nextLine())
		{
			final String POSTCODE_NUMBER = "0     1     2     3     4     5     6     7     8     9    ";
			final String POSTCODE_WUNBAR = "||::: :::|| ::|:| ::||: :|::| :|:|: :||:: |:::| |::|: |:|::";
		
			String locationTwo;
			final int LENGTHS = zipcode.length();
			final int ENCAPSULATE = 5;
			final int TWO = 2;
			final int TEN = 10;
		
			int checkDigit = 0;
			int checkNum = 0;
			output.print("POSTNET Code: |");
			for (int postIndex = 0; postIndex < LENGTHS; postIndex++)
			{
				char charValue = zipcode.charAt(postIndex);
				int location = POSTCODE_NUMBER.indexOf(charValue);
			
			
				locationTwo = POSTCODE_WUNBAR.substring(location, location+ENCAPSULATE);
				//check digit: determines if there are reading errors
				//Algorithm for check digit:
				// 10 - (sum of digits % 10)
				output.print(locationTwo);
			
				//Method
				// First character is obtained, add it to 0 to get the first sum
				// Once the second character is obtained, add the first sum to the second character
			
				// Convert character into an integer by parsing
				int value = Integer.parseInt("" + charValue);
				checkDigit = checkDigit + value;
			
			
				//checkDigit = checkNum;
			
				//checkDigit = charValue + checkNum;
			
				//output.println(checkDigit);
			
			}
			int totalNum = TEN - (checkDigit % TEN);
			String cDigit = "" + (totalNum);
			
			if (totalNum == 10)
			{
				cDigit = 0 + "";
			}
			else
			{
				char charValue2 = cDigit.charAt(0);
				int locationThree = POSTCODE_NUMBER.indexOf(charValue2);
				String capsulate = POSTCODE_WUNBAR.substring(locationThree, locationThree+ENCAPSULATE);
				output.print(capsulate);
			}
			output.print("|");
			output.print("\nEnter a string of digits: ");
		}
		//output.println(cDigit);
	}	
}		
//Goal, output POSTNET code based on inputted zipcode
//1. Create parallel strings: one for numbers and one for codes
//2. Program is to read first number of inputted code
//3. Program will then idenitfy the associated character
//4. Program will then return the index of the first number in the string POSTCODE_NUMBER
//5. With the idea of character substitution, subsititute number with designated set of 5 bars
//6. The output must have a code that is concatenated with surrounding frane bars

//check digit: determines if there are reading errors
//Algorithm for check digit:
// 10 - (sum of digits % 10)

//Method
// First character is obtained, add it to 0 to get the first sum
// Once the second character is obtained, add the first sum to the second character




