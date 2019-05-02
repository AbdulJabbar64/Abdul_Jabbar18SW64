import java.util.*;
class ArrayDemo
{
	Scanner scanf=new Scanner(System.in);
	int a=0;
	{
		System.out.println("Enter Number which is array length:");
		a=scanf.nextInt();
	}
	int []array=new int[a];
	public void populateArray()
	{
		for (int i=0;i<array.length;i++) 
		{
			System.out.println(i+" Enter Number of Array:");
			array[i]=scanf.nextInt();
		}
	}
	public void checkArray()
	{
		int odd=0,even=0;
		for (int i=0;i<array.length;i++) 
		{
			if (array[i]%2==0) 
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Total Odd Number is: "+odd);
		System.out.println("Total Even Number is: "+even);
	}
}