package C12;

public class StaticKeyword //First Example, Here for both the below ojects its taking the same memory, Hence output is same
                           // for both the objects..

{

	int a=12; //Global Variable
	
	public void increment()
	
	{
		a=a+1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*************************Object1******************************************");
		
		StaticKeyword abc=new StaticKeyword();
		
		abc.increment();
		
		System.out.println(abc.a);
		
		
		System.out.println("*************************Object2******************************************");
		
		StaticKeyword abc1=new StaticKeyword();
		
		abc1.increment();
		
		System.out.println(abc1.a);
		
	}
}

/*static keyword

Each object has its own separate memory

in case of Static, memory will be allocated at class level
instead of object level

What is the benefit of making static 

If you make anything static you don't need to create the object
you can call directly by Classname

A static method can use the static variable
A non static method can use both(static and non static vari)
*/