class Lab2Task2
{
	public static void main(String[] args) 
	{
		//////// Relational operators
		int value1=5;
		int value2=12;
		boolean x=value1>value2;
		boolean y=value1<value2;
		boolean c=value1==value2;
		boolean d=value1<=value2;
		boolean e=value1!=value2;
		System.out.println("value1>value2: "+x);//5>12
		System.out.println("value1<value2: "+y);//5<12
		System.out.println("value1==value2: "+c);//5==12
		System.out.println("value1<=value2: "+d);//5<=12
		System.out.println("value1!=value2: "+e);//5!=12

		///////// Logical Boolean operators
		boolean a=true;
		boolean b=false;
		System.out.println();
		System.out.println("a&b: "+(a&b));
		System.out.println("a|b: "+(a|b));
		System.out.println("!a: "+ (!a));
		System.out.println("!b: "+(!b));
		System.out.println("a^b: "+(a^b));

	}
}