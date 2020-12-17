package C02;

public class Class2asgn2 {


	//(10-2)*2)-2)+2)/2)
	
	public static void main(String[] args) {
		
		Class2asgn2 SSS=new Class2asgn2();
		
		int subresult= SSS.sub(10,2);
		
		int mulresult= SSS.mul(subresult,2);
		
		int subresult1= SSS.sub(mulresult,2);
		
		int sumresult= SSS.sum(subresult1,2);
		
		SSS.div(sumresult,2);
	}
	
	public int sub(int x,int y)
	
	{
		
		int z;
		z=x-y;
		
		return z;
	}
	
	
	public int mul(int x, int y)
	
	{
		return x*y;
	}
	
	
	public int sum(int x, int y)
	{
		
		return x+y;
	}
	
	public void div(int x, int y)
	
	{
		int z=x/y;
	
		System.out.println("The result of expression (10-2)*2)-2)+2)/2) is "+z);
	
	}
}
