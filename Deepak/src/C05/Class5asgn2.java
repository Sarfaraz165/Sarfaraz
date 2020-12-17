package C05;

public class Class5asgn2 extends Class5asgn1

{

	public Class5asgn2()
	
	{
		this(1,2,3);
		System.out.println("Child Default Constructor");
	}
	
	public Class5asgn2(int a)
	{
		System.out.println("Child One Parameterized Constructor");
	}
	
	public Class5asgn2(int a, int b)
	
	{
		this();
		System.out.println("Child Two Parameteriezed Constructor");
	}
	
	public Class5asgn2(int a,int b,int c)
	{
		super(1);
		System.out.println("Child Three Parameterized Constructor");
				
	}
	
	public Class5asgn2(int a,int b,int c,int d)
	
	{
		this(1,2);
		System.out.println("Child Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Class5asgn2 obj1=new Class5asgn2(1,2,3,4);
	}
}
