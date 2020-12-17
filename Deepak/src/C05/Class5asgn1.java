package C05;

public class Class5asgn1 

{
	public Class5asgn1 ()
	
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}


	public Class5asgn1(int a)
	
	{
		this(1,2);
		System.out.println("Parent One Paramaeterized Constructor");
	}
	
	public Class5asgn1(int a,int b)
	{
		this(1,2,3,4);
		System.out.println("Parent Two Parametrized Constructor");
	}
	
	public Class5asgn1(int a, int b, int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}

	public Class5asgn1(int a,int b,int c,int d)
	{
		this();
		System.out.println("Parent Four Parameterized Constructor");
	}

}



