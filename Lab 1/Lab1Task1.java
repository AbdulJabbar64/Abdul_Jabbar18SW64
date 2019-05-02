class Lab1Task1
{
	public static void main(String[] args) 
	{
		String name="Abdul Jabbar";
		int ObtMark=450;
		int totaMark=500;
		float per;
		per=ObtMark*100/totaMark;
		char grade='A';
		boolean status=per>50;
		System.out.println("Name: "+name);
		System.out.println("Percentage: "+per);
		System.out.println("Grade: "+grade);
		if (status) 
		{
			System.out.println("Pass");
		}
		else 
			System.out.println("Fail");
	}
}