package C12;//Static method used in this class

//A static method can use the static variable
//A non static method can use both(static and non static variables)

public class StaticKeyword3 

{

	static int a=12;
	
	public static void increment()
	{
		a=a+1;
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) 
	{
		StaticKeyword3.a=24;
		System.out.println(StaticKeyword3.a);
		StaticKeyword3.increment();
	}
}
