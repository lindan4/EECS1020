import java.util.Scanner;
import java.io.PrintStream;
import java.util.Date;
import javax.swing.JOptionPane;

public class Check02ADA

{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		Date datum = new Date(); //created a Date object (Datum)
		JOptionPane frame = new JOptionPane();
		
		JOptionPane.showInputDialog(frame, "Enter the number of milliseconds since the epoch: ");
		long tiden = input.nextLong();
		JOptionPane.showMessageDialog(frame, "After that many milliseconds, the date is: ");
		datum.setTime(tiden); //I invoked the object onto settime as the method is of void type
		String stunden = datum.toString(); //declared a string variable and used the tostring method to represent date in string format
		output.print(stunden);
		
	}
}
		
		
		
		
		
		
