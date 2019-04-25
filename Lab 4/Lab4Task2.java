import java.util.*;
class Lab4Task2
{
	public static void main(String[] args) 
	{
		Scanner scanf=new Scanner(System.in);
		System.out.println("Enter the Number of Table: ");
		int table=scanf.nextInt();
		System.out.println("Enter the Starting point of Table: ");
		int a=scanf.nextInt();
		System.out.println("Enter the Ending point of Table: ");
		int b=scanf.nextInt();
		int sum=0;
		for (int i=a;i<=b;i++) 
		{
			System.out.println(table+"x"+i+"="+(table*i));
		}
	}
}