import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class Flanders
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the file name: ");
		String fileName = input.nextLine();
		
		Scanner fileInput = new Scanner(new File(fileName));
		PrintStream fileOutput = new PrintStream("poem.html");
		
		
		
