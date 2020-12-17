package C02;

public class Class2asgn3 {
	
///((((((10*2)-2)+2)-2)+2)/2)	
	
	public static void main(String[] args) {
		
		
		Class2asgn3 Sfour=new Class2asgn3();
		
		int mulresult=Sfour.mul(10,2);
		int subresult=Sfour.sub(mulresult,2);
		int sumresult=Sfour.sum(subresult,2);
		int subresult1=Sfour.sub(sumresult,2);
		int sumresult1=Sfour.sum(subresult1,2);
		Sfour.div(sumresult1,2);
		
		
		
	}
	
	public int mul(int x, int y)
	
	{
		
		return x*y;
	}
	
	
	public int sub(int x,int y)
	
	{
		
		return x-y;
		
		
	}
	
	public int sum(int x,int y)
	
	
	{
		
		
		return x+y;
	}
	
	public void div(int x,int y)
	
	{
		
		int z;
		z=x/y;
		
		System.out.println("The result of the expression (10*)-2)+2)-2)+2)/2) is "+z);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
