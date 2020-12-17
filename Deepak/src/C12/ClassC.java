package C12;

public class ClassC implements Interface1
{
	public void m1()
	
	{
		System.out.println("body given by child");
	}
	
	public void m2()
	
	{
		System.out.println("body given by child");
	}
	
	public static void main(String[] args) 
	{
		ClassC obj=new ClassC();
		obj.m1();
		obj.m2();
	}
}

