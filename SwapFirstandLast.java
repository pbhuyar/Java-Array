import java.util.Arrays;
class SwapFirstandLast
	{
	public static void main (String  args [] )
	{
	  int a [] = {10,20,30,40,60,70,80};
	  int temp= a[0];
		a[0]=temp;
		a[0] = a[a.length-1];
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}
	}