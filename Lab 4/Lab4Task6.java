import java.util.*;
class Lab4Task6
{
	public static void main(String[] args) 
	{
		/*int []arr={3,5,6,1,9,0,2};
		int searches=Integer.parseInt(args[0]);
		int count=0;
		int index=0;
		for (int i=0;i<arr.length;i++) 
		{
			if (arr[i]==searches) 
			{
				count++;
				index=(i+1);
			}
		}
		if (count==1) 
		{
			System.out.println("Number is Pound ");
			System.out.println("At the Index of: "+index);
		}
		else 
		{
			System.out.println("Number is Not Pound ");
		}*/


		Scanner scanf=new Scanner(System.in);
		int []arr={3,5,6,1,9,0,2};
		System.out.println("Enter Number to Searche ");
		int searches=scanf.nextInt();
		int count=0;
		int index=0;
		for (int i=0;i<arr.length;i++) 
		{
			if (arr[i]==searches) 
			{
				count++;
				index=(i+1);
			}
		}
		if (count==1) 
		{
			System.out.println("Number is Pound ");
			System.out.println("At the Index of: "+index);
		}
		else 
		{
			System.out.println("Number is Not Pound ");
		}
	}
}