package C04; //This keyword used here.

public class Class4asgn2 

{
	public void M()
	
	{
		this.M3(1, 2, 3);
		System.out.println("Default Method");
	}
		
	public void M1(int a)
	
	{
		this.M4(1, 2, 3, 4);
		System.out.println("One Parametrized");
	}
	
	public void M2(int a, int b)
	{
		
		this.M1(1);
		System.out.println("Two Parameterized");
	}
	
	public void M3(int a, int b, int c)
	
	{
		
		System.out.println("Three Parameterized");
	}
	
	public void M4(int a, int b,int c,int d)
	{
		this.M();
		System.out.println("Four Parameterized");
	}
	
	public static void main(String[] args) 
	
	{
		Class4asgn2 C4=new Class4asgn2();
	    
	    C4.M2(1,2);
	    
	}
    
    
     
}

/*Output should be in the below sequence using this keyword

3 parameterized method
default method
4 parameterized method
1 parameterized method 
2 parameterized method*/
