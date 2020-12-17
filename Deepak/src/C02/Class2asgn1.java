package C02;

public class Class2asgn1 

{
    
	//(10+2)+2)-2)*2)/2)
	
	public static void main(String[] args) {
		
	Class2asgn1 SS =new Class2asgn1();
	  int sumresult= SS.sum(10,2);
	   int finalsum = SS.sum(sumresult,2);
	   int sub=  SS.sub(finalsum, 2);
	   int mul= SS.mul(sub,2);
	   SS.div(mul,2);
	   
}
	
	public int sum(int a,int b)
	
	{
		int d;
		
		return a+b;		
	}
	
	public int sub(int x, int y)
	
	{
		
		return x-y;
	}
		
		public int mul(int x, int y)
		
		
	{
			
		return x*y;
		
	}
			
			public void  div(int x, int y )
			
	{
				 int z= x/y;
				
				System.out.println("The Result of expression  (10+2)+2)-2)*2)/2) is -: " +z);
				
	}
		
	
}
	
	
	
	
	
	
	

