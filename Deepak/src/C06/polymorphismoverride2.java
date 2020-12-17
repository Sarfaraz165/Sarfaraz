package C06;

public class polymorphismoverride2 extends polymorphismoverride1

{

	public void arithmetic(int a, int b)
	
	{
		int c=a+b;
		System.out.println("The value of c is "+c);
	}
	
	public static void main(String[] args) 
	
	{
		polymorphismoverride2 r=new polymorphismoverride2();
		
		r.arithmetic(10, 2);
	}
	
}

