class Lab4Task5
{
	public static void main(String[] args) 
	{
		int []arr={5,2,7,9,3,8,6,0,3,7,9,1};
		int max=0;
		int index=0;
		int index1=0;
		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i]==max)
			{
				index1=(i+1);
			}
			if (max<arr[i]) 
			{
				max=arr[i];
				index=(i+1);
			}
		}
		System.out.println("the Largest Number is: "+max);
		System.out.println("Index of Largest number is: "+index);
		System.out.println("Index of same number Largest is: "+index1);
	}
}