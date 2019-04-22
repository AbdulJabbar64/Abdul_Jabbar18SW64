/*2. Develop a java program for calculating the total electricity bill when a
user enters the number of units consumed. For the calculations of the
total bill consider the following tariff:
Number Of Units    Price PER unit in Rupees
    Initial 50      10
    50-100			15
	101-200 		20
	201-300 		25
	301-onwards 	30
	*/
import java.util.*;
class Lab3Task2
{
	public static void main(String[] args) 
	{
		Scanner pak=new Scanner(System.in);
		System.out.println("Enter Your Units: ");
		int unit=pak.nextInt();
		int total=0;
		for (int i=1;i<=unit;i++) 
		{
		if (i<=50) 
		{
			total+=10;
		}
		if (i>50 && i<=100) 
		{
			total+=15;
				
		}
		if (i>100 && i<=200) 
		{
			total+=20;	
		}
		if (i>200 && i<=300) 
		{
				total+=25;
		}
		if (i>300) 
		{
				total+=30;	
		}
		}
		System.out.println("Units of Bill: "+unit);
		System.out.println("Total Amount of Bill: "+total);
	}
}