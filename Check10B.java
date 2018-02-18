//Program outputs 4=10 instead of 4=8

import java.util.*;
import java.io.PrintStream;

public class Check10B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter your map, one key-value pair per line,\ncomma-separated. Use empty line as sentinel.");
		String pair;
		StringTokenizer spli;
		Map<Integer, Integer> mt = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> mtN = new TreeMap<Integer, Integer>();
		for (pair = input.nextLine(); pair.length() != 0; pair = input.nextLine())
		{
			spli = new StringTokenizer(pair, ",");
			String kay = spli.nextToken();
			int kaya = Integer.parseInt(kay);
			String vi = spli.nextToken();
			int via = Integer.parseInt(vi);
			int kayaN = kaya;
			int viaN = via;

			mtN.put(kaya, via);
			mt.put(via, kaya);
		}
		output.println("The input map is:\n" + mtN);
		output.println("The inverted map [using the smaller key as a tie breaker]:\n" + mt);

	}
}
			
			
