/*1. Develop a mark sheet application in java which fulfills the following
requirements:
 The program takes input from the user marks obtained in three
subjects; C++, Data Structures and Operating Systems.
 The program calculates the total marks obtained out of 300.
 Calculate the percentage.
 Display the grade secured according to the following:

o 90 > 						Grade: A
o Between 90 and 80 		Grade: B
o Between 79 and 70 		Grade: C
o Between 69 and 60 		Grade: D
o Below 60 					Grade: FAIL
*/
import java.util.*;
class Lab3Task1
{
	public static void main(String[] args) 
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter Your C++ Marks:");
		int a=ab.nextInt();
		System.out.println("Enter Your Data Structures Marks:");
		int b=ab.nextInt();
		System.out.println("Enter Your Operating Systems Marks:");
		int c=ab.nextInt();
		int total=300;
		float per;
		per=(a+b+c)*100/total;
		//System.out.println("Student Name: "+name);
		//System.out.println("Department:   "+dept);
		//System.out.println("Roll Number:  "+rollNo);
		System.out.println("Subject C++ Marks: "+a);
		System.out.println("Subject Data Structures Marks: "+b);
		System.out.println("Subject Operating Systems Marks: "+c);
		System.out.println("Total Marks:  "+total);
		System.out.println("Obtained Marks: "+(a+b+c));
		System.out.println("Percentage:  "+per);
		if (per>90) 
		{
			System.out.println("Grade is: A");
		}
		if (per>80 && per<=90) 
		{
			System.out.println("Grade is: B");
		}
		if (per>70 && per<=80) 
		{
			System.out.println("Grade is: C");
		}
		if (per>60 && per<=70) 
		{
			System.out.println("Grade is: D");
		}
		if (per<60) 
		{
			System.out.println("Grade is: FAIL");
		}
	}
}