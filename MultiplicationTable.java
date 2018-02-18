import java.io.PrintStream;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
    	PrintStream output = System.out;
        final int MAX_NUM = 10;
        
        for (int i = 1; i <= MAX_NUM; i++)
        {
			for (int j = 1; j <= MAX_NUM; j++)
			{
				output.printf("%4d", i * j);
			}
			output.println();
		}
    }
}
