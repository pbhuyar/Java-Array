import java.util.Arrays;
class ReplaceOddWithFirstDigit
	{
		public static void main (String [] args )
		{
	        	int a [] = {17,16,21,15,22,10,5,12,25,24};
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				while(a[i]>9)
				{
				 a[i]/=10;
				}
			}
			System.out.println(Arrays.toString(a));
		}	
	}
			