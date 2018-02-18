import java.util.*;
import java.io.PrintStream;
import java.io.*;
import type.lib.ToolBox;


public class Check11B
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Entry ... ");
		String inp = input.nextLine();
		
		final String monthNo = "1   2   3   4   5   6   7   8   9    10  11  12  ";
		final String monthNa = "Jan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec ";
		
		try
		{
			StringTokenizer st = new StringTokenizer(inp, "/");
				
			String en = st.nextToken();
			String arbi = st.nextToken();
				
			int n = Integer.parseInt(en);
				
			int ind = monthNo.indexOf("" + n);
			String su = monthNa.substring(ind, ind+3);
			String fileName = su + ".txt";
			
			output.println("The Filename is: " + fileName);
			
			File fileNamn = new File(fileName);
			String absolute = fileNamn.getAbsolutePath();
			try
			{
				Scanner fileInput = new Scanner(fileNamn);
				
				if (!(fileInput.hasNext()))
				{
					output.println("File Empty");
				}
				else
				{
					while (fileInput.hasNext())
					{
						double stored = fileInput.nextDouble();
						output.println("The double # is: " + stored);
					}
				}
				
			}
			catch (FileNotFoundException e)
			{
				output.println("File not found");
			}
			catch (InputMismatchException e)
			{
				output.println("Non-numeric Record");
			}
			
		}
		
		catch (NoSuchElementException e)
		{
			output.println("Invalid Input");
		}
		
		catch (NumberFormatException e)
		{
			output.println("Non-numeric Entry");
		}
		catch (IndexOutOfBoundsException e)
		{
			output.println("Invalid Input");
		}
			
		
	}
}
		
		
