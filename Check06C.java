import java.util.Scanner;
import java.io.PrintStream;

public class Check06C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);

		String s = args [0];
		
		if (s.matches("[a-z[A-Z]]+"))
		{
			final int TOTAL_LENGTH = s.length();
			int fragLength = 0;
			for (int index = 0; index < TOTAL_LENGTH; index = index + fragLength)
			{	
				char firstOccurence = s.charAt(index);
				int firstIndex = s.indexOf(firstOccurence);
				int secondIndex = s.lastIndexOf(firstOccurence);
				String sub = s.substring(firstIndex, secondIndex+1);
				fragLength = sub.length();
				output.print("" + fragLength + firstOccurence);
			}
		}
		else
		{
			output.print("The string must consist of letters!");
		}
		
	}	
}


// Goal: replace repetitions of letters with the number of repetitions and the number next to it
// 1. Use regex to allow only letter inputs
// 2. Once it passes that, identify the first occurence letter of a run 
// 2. Find last occurence letter of the run, create a substring and determine its length
