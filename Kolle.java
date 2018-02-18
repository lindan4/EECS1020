import java.util.*;
import java.io.PrintStream;
import java.io.File;
import type.lib.Fraction;

public class Kolle
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter filename ...");
		String fileName = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(fileName));
		
		List<Fraction> li = new LinkedList<Fraction>();
		
		while (fileInput.hasNext())
		{
			int x = fileInput.nextInt();
			int y = fileInput.nextInt();
			
			Fraction everCh = new Fraction(x, y);
			
			li.add(everCh);
		}
		//output.println(li);
		
		Set<Fraction> ste = new HashSet<Fraction>();
		
		int counter = 0;
		for (int i = 0; i < li.size()-1; i = i + 1)
		{
			Fraction ob = li.get(i);
			
			Boolean itWork = ste.add(ob);
			
			if (itWork == false)
			{
				counter = counter + 1;
			}
		}
		
		if (counter >= 1)
		{
			output.println("YES");
		}
		else
		{
			output.println("NO");
		}
			
	}
}
			
			
		
		
