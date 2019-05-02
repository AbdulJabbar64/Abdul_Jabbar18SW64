class Dog
{
	String name;
	String heredity;
	int age;
	public void setDetails(String name,String herdity,int age)
	{
		this.name=name;
		this.heredity=heredity;
		this.age=age;
	}
	public void showDetails()
	{
		if (age==0) 
		{
			System.out.println("Details are unavailable");
		}else {
			System.out.println("Name of Dog: "+name);
			System.out.println("Heredity of Dog: "+heredity);
			System.out.println("Age of Dog: "+age);
		}
	}
}
class Public
{
	public static void main(String[] args) 
	{
		Dog dog1=new Dog();
		dog1.setDetails("Puppy","Unavailable",2);
		dog1.showDetails();
	}
	
}