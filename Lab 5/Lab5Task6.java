/*6. Create a class that combines Student and Marksheet. The result
class must have a constructor that takes student and marksheet
objects as parameters and then these objects are used by
createStudentResult() function to display student’s bio-data and his
marksheet.*/
class Lab5Task6
{
	public static void main(String[] args) 
	{
		Student std1=new Student("Abdul Jabbar","18sw64","Software",20);
		MarkSheet mark = new MarkSheet();

		Combines c=new Combines(std1,mark);
		c.createStudentResult();
	}
}