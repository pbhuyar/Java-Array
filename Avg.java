class Avg
	{
		public static void main (String [] args )
		{
		        int A [] = {17,21,15,22,10,5,12,25};
			
			double avg=0;
		        for(int i=0;i<A.length;i++)
			avg += A[i];
			avg /= A.length;
			
			System.out.println("avg : "+avg);
		}
	}


