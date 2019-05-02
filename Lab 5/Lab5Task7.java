class Lab5Task7
{
	public static void main(String[] args) 
	{
		String str="Abdul Jabbar,20,Software; Ali,19,Software";
		String st[]=str.split(";");
		String str1[]=st[0].split(",");
		String str2[]=st[0].split(",");
		System.out.println("Student 1");
		System.out.println("Name: "+str1[0]);
		System.out.println("Age: "+str1[1]);
		System.out.println("Dept: "+str1[2]);
		System.out.println("Student 2");
		System.out.println("Name: "+str2[0]);
		System.out.println("Age: "+str2[1]);
		System.out.println("Dept: "+str2[2]);
	}
}