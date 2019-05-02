class Combines
{
	Student std1;
	MarkSheet mar;

	Combines(Student s, MarkSheet m){
		this.std1=s;
		this.mar=m;
	}

	public void createStudentResult()
	{
		mar.setDetails();
		std1.getDetails();
		mar.calc();
	}
}