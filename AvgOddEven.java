import java.util.Arrays; 
class AvgOddEven 
	{
		public static void main (String [] args )
		{
			int count =0;
			double OddAvg=0,EvenAvg=0;
			int a [] ={ 12,25,30,2,3,5,7};
			for (int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
				    OddAvg+=a[i];
				    count++;
				}
				else
				   EvenAvg +=a[i];
			}
		     OddAvg/=count;
		    EvenAvg /=(a.length-count);
		System.out.print(OddAvg+" "+EvenAvg); 
		}
	}
				 
				
				
	