class EvenSeries
{
	public static void main(String[] args) 
	{
		for (int j=1;j<=20;j++) 
		{
			if (j%2!=0) 
			{
				continue;
			}
			System.out.print(j+" ");
		}
	}
}