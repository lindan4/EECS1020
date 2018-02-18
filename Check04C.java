import java.util.Scanner;
import java.io.PrintStream;
import java.lang.String;
import type.lib.Student;

public class Check04C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.print("Student1 name: ");
		String studentin1 = input.nextLine();
		output.print("Student1 ID: ");
		String studentinid = input.nextLine();
		output.print("Student2 name: ");
		String studentin2 = input.nextLine();
		output.print("Student2 ID: ");
		String studentinid2 = input.nextLine();
		
		Student s1 = new Student(studentinid, studentin1);
		Student s2 = new Student(studentinid2, studentin2);
		
		output.print("s1.toString yields ..... ");
		s1.toString();
		output.print(s1);
		
		output.print("\ns2.toString yields ..... ");
		s2.toString();
		output.print(s2);
		
		output.print("\ns1 == s2 yields ........ ");
		output.print(s1 == s2);
		
		output.print("\ns1.equals(s2) yields ... ");
		Boolean equality = s1.equals(s2);
		output.print(equality);
		
		
	}
}
		
		
