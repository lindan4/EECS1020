import java.util.Scanner;
import java.io.PrintStream;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		String s = "namelast";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();
		
		output.print(sb);
	}
}

