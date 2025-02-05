import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class BufferedReaderInput  
{
	public static void main (String args [] ) throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter the Value : ");
	int a = Integer.parseInt(br.readLine());	
	System.out.println("Enter Value : " );
	int b  = Integer.parseInt(br.readLine());
	System.out.println("The addition is : "+(a+b));
	}
} 
		