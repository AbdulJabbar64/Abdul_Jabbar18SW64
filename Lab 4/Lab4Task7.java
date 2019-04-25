class Lab4Task7
{
	public static void main(String[] args) 
	{
		int []arr={12,5,-1,-4,3,6,9,1,3,0,2,4};
		int temp=0;
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr.length-1;j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int k=0;k<arr.length;k++) 
		{
			System.out.print(arr[k]+"  ");
		}
	}
}