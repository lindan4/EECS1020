import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Rectangle;

//printn

public class Check02B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		Rectangle b = new Rectangle(width, height);
		
		int Diam = b.getCircumference();
		output.println("The return of getCircumference is: " + Diam);
		int Kode = b.hashCode();
		output.println("The return of hashCode is: " + Kode);
	}
}
		
		
		
		
		
