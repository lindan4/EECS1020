import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Student;
import type.lib.SEstudent;
import type.lib.CEstudent;
import type.lib.ITstudent;
import java.util.Iterator;

public class Check09D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		Student yu = Student.getRandom();
		final String regex = "\\s+";
		
		output.println("Student Name: " + yu.getName());
		output.println("Student ID:   " + yu.getID());
		String gpaFormatted = String.format("%.1f", yu.getGpa());
		output.println("Student GPA:  " + gpaFormatted + "\n");

		//Object classification is wrong
		//Correction: insert 'String' between arrows
		Iterator<String> it = yu.iterator();
		
		for (; it.hasNext(); )
		{
			String courses = it.next();
			String grades = yu.getCourseGrade(courses);
			output.println(courses + "\t" + grades);
		}
		output.print("Do you think this is a SE student?\nEnter y or n ... ");
		String antword = input.nextLine();
		
		String type = "";
		int colon = 0;
		String nya = "";
		if (antword.equals("y"))
		{
			if (yu instanceof SEstudent)
			{
				output.println("You are right!\nThis is in fact a SEstudent");
			}
			else
			{
				type = yu.toString();
				colon = type.indexOf(":");
				nya = type.substring(0, colon).replaceAll(regex, "");
				output.println("This is in fact a " + nya);
			}
		}
		if (antword.equals("n"))
		{
			if (!(yu instanceof SEstudent))
			{
				type = yu.toString();
				colon = type.indexOf(":");
				nya = type.substring(0, colon).replaceAll(regex, "");
				output.println("You are right!\nThis is in fact a " + nya);
			}
			else
			{
				output.println("This is in fact a SEstudent");
			}	
		}
	}
}
