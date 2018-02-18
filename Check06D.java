//Issue: regex statement cannot be read properly

import java.util.Scanner;
import java.io.PrintStream;

public class Check06D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		String sOne = args[0];
		//String sTwo = args[1];
		
		//String regex = "[\\w*\\&+\\w*]+";
		String[] drei = sOne.split("&"); 
		for (int i = 0; i < drei.length; i = i + 1)
		{
			String strasse = "" + drei[i];
			
			
			String[] zwei = strasse.split("=");
			
			for (int j = 0; j < zwei.length; j = j + 1)
			{
				String strasseTwo = "Piece #" + j + zwei[j];
				output.println(strasseTwo);
			}
			
		}
		
	}
}
//Goal: output indicated variable based on information in query string (eg. country, id, name)
//1. Create two string variables with each representing one argument
//2. Using the split method, isolate all declared variables in string sOne
//3. Variable in argument 1 should be searched for
