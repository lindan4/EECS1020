import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

// Prompt the user for the a dollar and cents value
// and output the number of toonies, loonies,
// quarters, dimes, and nickles.

// Uses GUI dialogs for I/O.

public class ChangeMaker2
{
	public static void main(String[] args)
	{
		final int CENTS_PER_DOLLAR = 100;
		final int CENTS_PER_TOONIE = 200;
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKLE = 5;
		
		// Prompt the user and read input
		String input = (String)JOptionPane.showInputDialog(
			"Please enter a dollar and cent value: ");
		float money = Float.parseFloat(input);
		int change = Math.round(CENTS_PER_DOLLAR * money);
		
		// Calculate the number of toonies
		int numToonies = change / CENTS_PER_TOONIE;
		change = change - (numToonies * CENTS_PER_TOONIE);
		
		// Calculate the number of loonies
		int numLoonies = change / CENTS_PER_DOLLAR;
		change = change - (numLoonies * CENTS_PER_DOLLAR);

		// Calculate the number of quarters
		int numQuarters = change / CENTS_PER_QUARTER;
		change = change - (numQuarters * CENTS_PER_QUARTER);

		// Calculate the number of dimes
		int numDimes = change / CENTS_PER_DIME;
		change = change - (numDimes * CENTS_PER_DIME);
		
		// Calculate the number of nickles
		int numNickles = change / CENTS_PER_NICKLE;
		change = change - (numNickles * CENTS_PER_NICKLE);

		
		// Output values to user
		String output = String.format(
			"Change: %d toonies, %d loonies, %d quarters, " +
			"%d dimes, and %d nickles.%n", numToonies, numLoonies,
			numQuarters, numDimes, numNickles);
		JOptionPane.showMessageDialog(null, output);
	}
}
