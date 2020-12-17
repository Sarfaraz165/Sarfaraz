package C12; //Example 2:-

public class StaticKeyword1 // Here we have used static keyword for global variable data type and in this case it takes memory
                           // in the same class. Hence the output is different from the previous exapmle.
                          
							//in case of static memory will be allocated at class level
							//instead of object level
							
{

	static int a=12; //Global Variable
	
	public void increment()
	
	{
		a=a+1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*************************Object1******************************************");
		
		StaticKeyword1 abc=new StaticKeyword1();
		
		abc.increment();
		
		System.out.println(abc.a);
		
		
		System.out.println("*************************Object2******************************************");
		
		StaticKeyword1 abc1=new StaticKeyword1();
		
		abc1.increment();
		
		System.out.println(abc1.a);
		
		System.out.println("*************************Object3******************************************");
		
		StaticKeyword1 abc2=new StaticKeyword1();
		
		abc1.increment();
		
		System.out.println(abc2.a);
		

}
}