class Jump
{
	public static void main(String[] args) 
	{
		outer_loop:
		for (int i=0;i<10;i++) 
		{
			for (int j=0;j<5;j++) 
			{
				if (j==2) 
				{
					break outer_loop;
				}
				System.out.print(j);
			}
			System.out.println("Out of Loop");
		}
		System.out.println(" Out of outer");
		
		/*for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=5;j++) 
			{
				if (j%2==0) 
				{
					continue;
				}
				System.out.print(j+" ");
			}
			System.out.println(" Out of Loop");
		}*/

		// serise of Odd number with keyword "contiune"
		/*for (int i=1;i<=20;i++) 
		{
			if (i%2==0) 
			{
				continue;
			}
			System.out.print(i+" ");
		}*/

		// serise of Even Number with keyWord "contiune" 
		/*for (int j=0;j<=20;j++) 
		{
			if (j%2!=0) 
			{
				continue;
			}
			System.out.print(j+" ");
		}*/

		//Array Matrix Sum
		/*int [][]A={{9,3,8},{4,5,4},{6,5,3}};
		int [][]B={{4,1,0},{5,1,7},{6,9,8}};
		int [][]Sum=new int[3][3];
		for (int i=0;i<A.length;i++) 
		{
			for (int j=0;j<B.length;j++) 
			{
				Sum[i][j]=A[i][j]+B[i][j];
				System.out.print(Sum[i][j]+" ");
			}
			System.out.println();
		}*/

	}
}