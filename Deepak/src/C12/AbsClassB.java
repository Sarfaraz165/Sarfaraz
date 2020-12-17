package C12;

public class AbsClassB extends AbsClass1
{

	public void method2()
	
	{
		System.out.println("Body given by Child");
	}
	
	public static void main(String[] args) 
	{
		AbsClassB obj=new AbsClassB();
		
		obj.method1();
		obj.method2();
	}
}
