import java.util.Scanner;
import java.io.PrintStream;

public class email
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		String regex = "\\w{5, 10}@\\w{5, 10}.[co.uk|ca|com|edu]"
