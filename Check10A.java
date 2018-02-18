import java.util.*;
import java.io.PrintStream;

public class Check10A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter your integers\n(Negative=sentinel)");
		int nummer;
		
		int totalSum = 0;
		List<Integer> st = new LinkedList<Integer>();
		Set<Integer> stNya = new TreeSet<Integer>();
		
		for (nummer = input.nextInt(); nummer >= 0; nummer = input.nextInt())
		{
			st.add(nummer);
			totalSum = totalSum + nummer;	
		}
		int size = st.size();
		if (size == 0)
		{
			output.println("Your list is empty!");
		}
		else
		{
			double avg = (double) totalSum / (double) size;
			//String avgForm = String.format("%.2f", avg);
			
			output.println("The average is: " + avg);
			output.println("The sorted, distinct, above-average elements:");
			Iterator<Integer> it = st.iterator();
			for (; it.hasNext(); )
			{
				int nya = it.next();
				if (nya > avg)
				{
					stNya.add(nya);
				}
			}
			for (Integer i : stNya)
			{
				output.print(i + " ");
			}
		}
	}
}
