package C06;                                  ///Method Overloading

public class polymorphism01 

{

	public void arithmetic(int a, int b)
	{
		int C=a+b;
		
		
		System.out.println("The result of C is "+C);
		
	}
	
	public void arithmetic(int a)
	{
		
		
		System.out.println("The result of a is "+a);
	}
	
	public int arithmetic(int a, int b, int c)
	
	{
		int d=a*b+c;
				
		System.out.println("The value of d is "+d);
		
		return d;
	
	}
	
	public static void main(String[] args) 
	{
		polymorphism01 obj1=new polymorphism01();
		
		obj1.arithmetic(10, 12);
		obj1.arithmetic(10);
		int result=obj1.arithmetic(10, 12,20);
		
		
		
	}
	
	
	
	
}
