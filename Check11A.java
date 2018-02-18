import java.util.*;
import java.io.PrintStream;
import type.lib.ToolBox;

public class Check11A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter h:m:AM or PM > ");
		String inp = input.nextLine();
		
		final String DAY = "00AM12PM";
		final int SIXTY = 60;
		
		try
		{
			StringTokenizer st = new StringTokenizer(inp, ":");
			
			String hh = st.nextToken();
			String mm = st.nextToken();
			String tid = st.nextToken().toUpperCase();
			
			int h = Integer.parseInt(hh);
			ToolBox.crash(h <= 0 || h > 12, "");
			int m = Integer.parseInt(mm);
			ToolBox.crash(m < 0 || m >= SIXTY, "");
			
			int ind = DAY.indexOf(tid);
			String extr = DAY.substring(ind-2, ind);
			int a = Integer.parseInt(extr);
			
			int computation = SIXTY * (h + a) + m;
			output.println(computation);
		}
		catch (NoSuchElementException e)
		{
			output.println("Missing colon!");
		}
		catch (NumberFormatException e)
		{
			output.println("Non-numeric data!");
		}
		catch (IndexOutOfBoundsException e)
		{
			output.println("Invalid AM/PM indicator!");
		}
		catch (RuntimeException e)
		{
			output.println("Values out of range!");
		}
		/*
		
		*/
	}
}
	
