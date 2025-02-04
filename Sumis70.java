class Sumis70
	{
		public static void main (String args [])
		{
		   int a [] ={20,32,29,18,21,19,10,24,35,22,26};
		   int key=70;
		  {
			for(int i=0;i<a.length-2;i++)
			{
			    for(int j=i+1;j<a.length-1;j++)
			    {
			         for(int k=j+1;k<a.length;k++)
				 {
			         if(key ==a[i]+a[j]+ a[k])
					System.out.println(" Numbers : " + a[i]+ " "+ a[j]+ " "+a[k]);
				}
			    }
		       }
		  }
	      }
	}
		