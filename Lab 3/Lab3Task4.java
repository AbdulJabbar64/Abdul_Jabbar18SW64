/*4. Write a java program that performs arithmetic operations on two
numbers after taking 3 runtime arguments; 1st number, 2nd number
and the operators (+, -, /, *) and prints the result.*/
import java.util.*;
class Lab3Task4
{
	public static void main(String[] args) 
	{
		Scanner no=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a=no.nextInt();
		System.out.println("Enter 2st Number: ");
		int b=no.nextInt();
		System.out.println("Enter Arithmetic operators: ");
		String c=no.next();
		switch (c) 
		{
			case "+":				
			System.out.println("Addition: "+(a+b));
			break;
			case "-":
			System.out.println("Subtruction: "+(a-b));
			break;
			case "*":
			System.out.println("Multipaliction"+(a*b));
			break;
			case "/":
			if (b==0) 
			{
				System.out.println("Here is Indefined due to 0 ");
			}
			else
			System.out.println("Division: "+(a/b));
			break;
			default:
				System.out.println("You have not given Arithmetic Operator ");
		}
	}
}