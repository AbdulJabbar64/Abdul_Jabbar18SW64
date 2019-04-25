class Lab4Task3
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int sum=0;
		if (num>0) 
		{
			for (int i=1;i<=num;i++) 
			{
				sum+=i;
			}
			System.out.println("Sum of All Integer which you Enter: "+sum);
		}
		else 
		{
			for (int j=num;j<0;j++) 
			{
				sum-=(-j);
			}
			System.out.println("Sum of All Integer which you Enter: "+sum);
		}
	}
}