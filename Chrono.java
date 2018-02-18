import java.util.Scanner;
import java.io.PrintStream;

public class Chrono
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintStream out = new PrintStream(System.out);
		final int MILLIS_PER_SECONDS = 1000;
		
		out.print("Press enter to start!");
		in.nextLine();
		long a = System.currentTimeMillis();
		
		out.print("Press enter to finish!");
		in.nextLine();
		long b = System.currentTimeMillis();
		
		double c = b - a;
		double d = c / MILLIS_PER_SECONDS;
		out.printf("%.3f secs", d);
	}
}	
	
