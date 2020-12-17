package C12; //Static Method used in this class

//Example 3 of static Keyword

//What is the benefit of making static 

//If you make anything static you don't need to create the object
//you can call directly by Classname.



public class StaticKeyword2 

{
	
	static int a=12; //Static Variable
	
	public static void increment()     //Here we have used static method and variable in this class.
	
	{
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) 
	{
		StaticKeyword2.a=24;
		System.out.println(StaticKeyword2.a);
		StaticKeyword2.increment();
		
	}

}
