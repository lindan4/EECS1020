import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Check03B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		JOptionPane frame = new JOptionPane();
		
		String distance  = JOptionPane.showInputDialog(frame, "Enter the satellite altitude in km ... ");
		double distance2 = Double.parseDouble(distance);
		
		final double K = 0.00995;
		final double A = distance2;
		final double R = 6378;
		final double e = 1.5;
		final double MINUTES_IN_HOUR = 60;
		final double SECONDS_IN_HOUR = 3600;
		
		double period = K * Math.pow(A + R, e);
		
		double hours1 = (period / SECONDS_IN_HOUR);
		int hours2 = (int) (hours1);
		double minutes1 = (period / MINUTES_IN_HOUR) % MINUTES_IN_HOUR;
		int minutes2 = (int) (minutes1);

		//Values exceeding 1000 seconds are exceeding two significant digits
		double seconds1 = period - (hours2 * MINUTES_IN_HOUR + minutes2) * MINUTES_IN_HOUR;
		
		//Figure out how to show result on window
		output.print("Orbital period = " + hours2 + " hours, " + minutes2 + " minutes, and ");
		output.printf("%.1f", seconds1);
		output.print(" seconds.");
		
	
	}
}
		
