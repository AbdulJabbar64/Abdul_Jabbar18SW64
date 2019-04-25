class Lab4Task1T
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=5;i++) 
		{
			for (int j=5;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for (int k=2;k<=2*i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}