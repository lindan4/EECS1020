import java.util.*;
import java.io.PrintStream;
import java.io.File;

public class Check10C
{
	public static void main(String[] args) throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the filename ");
		Scanner fileInput = new Scanner(new File(input.nextLine()));
		
		List<String> ltE = new LinkedList<String>();
		List<String> lt = new LinkedList<String>();
		List<Integer> vt = new LinkedList<Integer>();
		List<Integer> vts = new LinkedList<Integer>();
		
		while (fileInput.hasNextLine())
		{
			String lines = fileInput.nextLine();
			ltE.add(lines);
			lt.add(lines);
		}
		for (String s : lt)
		{
			vt.add(s.length());
			vts.add(s.length());
		}
		Collections.sort(lt);
		int siz = lt.size();
		String ge = lt.get(siz-2);
		String ges = lt.get(siz-1);
		int diff = ge.length() - ges.length();
		Iterator<String> itr = lt.iterator();
		int index = 0;
		int indexs = 0;
		for (; itr.hasNext(); )
		{
			String read = itr.next();
			index = ltE.indexOf(ge);
			indexs = ltE.indexOf(ges);
		}
		output.println("The closest two are " + diff + " apart in length.");
		output.println("Their indices are " + index + "," + indexs);
	}
	
}
//Examine strings and identify the ones with the smallest length difference

