import java.util.*;
import java.io.PrintStream;
import java.net.URLDecoder;

public class Check11C
{
	public static void main(String[] args) throws java.io.UnsupportedEncodingException
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		
		output.println("Enter the query string:");
		String query = input.nextLine();
		
		String[] pieces = query.split("&");
		
		final String COMMA = "%2C";
		final String SPACE = "%20";
		
		output.println("Enter the variable name:");
		String varNamn = input.nextLine();
		
		Map<String, String> mp = new HashMap<String, String>();
		
		for (int i = 0; i < pieces.length; i = i + 1)
		{
			StringTokenizer st = new StringTokenizer(pieces[i], "=");
			String a = st.nextToken();
			String b = st.nextToken();
			
			mp.put(a, b);
		}
		
		String wanted = mp.get(varNamn);
		if (wanted == null)
		{
			output.println("No such variable \"" + varNamn + "\"!");
		}
		else
		{
			output.println("Before decoding:\n" + wanted);
			String kod = URLDecoder.decode(wanted, "ASCII");
			output.println("After decoding:\n" + kod);
		}
		
	}

}

//Comma: %2C
//Space: %20
