/*3. Write a java program that takes a single character as input and tells
whether it is a vowel or a consonant.
Note: Use Switch to make this program.*/
import java.util.*;
class Lab3Task3
{
	public static void main(String[] args) 
	{
		Scanner yes=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		String ch=yes.next();
		switch(ch)
		{
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
			System.out.println(ch+"  is Vowel");
			break;
			default:
				System.out.println(ch+"  is Consonant");
				break;
		}
	}
}