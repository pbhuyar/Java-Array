class GrtThanAvg
	{
		public static void main (String [] args )
		{
			int a [] = {10,20,30,31,37,40,50};
			double avg = 0;
			int Greater=0;
			for( int i=0;i<a.length;i++)
			avg+=a[i];
			avg/=a.length;
			for(int i=0;i<a.length;i++)
			if(a[i]>avg)							System.out.println(a[i]);
		}
	}