import java.util.Arrays;
import java.util.Scanner;
class TakingInput 
{
	public static void main (String args [] )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array" );
		int size = sc.nextInt ();
		int a [] = new int [size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the elments of a ["+i+"] : ");		
			a[i] = sc.nextInt();
		}
		System.out.println("New Array with Elements : "+ Arrays.toString(a));
	}
}