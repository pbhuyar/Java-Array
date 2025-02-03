import java.util.Arrays;
class SeparateOddEven
{
	public static void main (String  args [] )
	{
	int a []={15,18,24,22,19,17,21,25,28,44,24,30,33,27};
	int count =0;
	int b [] = new int [a.length];
	for (int i=0;i<a.length;i++)
	{	if(a[i]%2!=0)
		b[count++] = a[i];
	}
	for(int i=0;i<a.length;i++)
	{	if (a[i]%2==0)
		b[count++] = a[i];
	}
	System.out.println(Arrays.toString(b));
	}
	}