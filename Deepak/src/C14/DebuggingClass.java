package C14;

public class DebuggingClass 
{
	int a;
    public void abc()
    {
    	System.out.println("I am the first method");
    	System.out.println("I am the second line");
    }
    
    public void abc1()
    {
    	System.out.println("I am the second method");
    	System.out.println("I am the second line");
    }
    
    public static void main(String[] args) 
    {
		System.out.println("I am the main method");
		
		DebuggingClass Obj=new DebuggingClass();
		
		System.out.println("I am the second line of the main method");
		
		System.out.println(Obj.a);
		Obj.a=223;
		System.out.println(Obj.a);
		Obj.abc();
		System.out.println("I am the main method i am the boss");
		Obj.abc1();
		
		
		
	}
}
