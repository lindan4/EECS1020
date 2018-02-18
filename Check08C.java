import java.util.Scanner;
import java.io.PrintStream;
import type.lib.Student;
import java.util.Iterator;

public class Check08C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Enter the year ... ");
		int ohr = input.nextInt();
		String ohrn = "" + ohr;
		
		
		
		final double FIVE = 5;
		final double FOUR = 4;
		final double THREE = 3;
		final double TWO = 2;
		final double ONE = 1;
		final double ZERO = 0;
		
		Student stu = Student.getRandom();
		String name = stu.getName();
		String aidi = stu.getID();
		double gpa = stu.getGpa();
		double courseLoad = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		String gpaf = String.format("%.1f", gpa);
		
		output.println("Student Name: " + name);
		output.println("Student ID:   " + aidi);
		output.println("Student GPA:  " + gpaf);
		output.println("-----------------------");
		Iterator<String> it = stu.iterator();
		
		for (; it.hasNext(); )
		{
			String kurz = it.next();
			if (kurz.startsWith(ohrn))
			{
				String grad = stu.getCourseGrade(kurz);
				if (grad.startsWith("A"))
				{
					a = a + FIVE;
				}
				if (grad.startsWith("B"))
				{
					b = b + FOUR;
				}
				if (grad.startsWith("C"))
				{
					c = c + THREE;
				}
				if (grad.startsWith("D"))
				{
					d = d + TWO;
				}
				if (grad.startsWith("E"))
				{
					e = e + ONE;
				}
				output.println(kurz + "\t" + grad);
				courseLoad = courseLoad + 1;
			}
		}
		double avg = (a + b + c + d + e + f) / courseLoad;
		
		if (courseLoad == ZERO)
		{
			output.println("No courses taken in year " + ohr + "!");
		}
		else
		{
			String avgForm = String.format("%.1f", avg);
			output.println("GPA in year " + ohr + " is: " + avgForm);
		}
		output.println("-----------------------");
	}	
}
