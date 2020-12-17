package C04;

import java.util.Scanner;

/*Assignments:- for scanner class

A1->>(x1+x2)-x3)*x4)+x5)/x6)
A2->>(x1*x2)-x3)+x4)-x5)/x6)

>>where x1,x2,x3,x4,x5 and x6 you will take from the user
and you need to create 4 methods

*/

	public class Class4asgn1 
	{

	
	public int sum(int x, int y)
	{
		
		
	return x+y;

	}
	
	
	public int sub(int x, int y)

	{
	
		return x-y;
	
	}
	
	public int mul(int x, int y)
	{
	
	
		return x*y;
	}
	
	
	public void div(int x, int y)
	
	{
		
		int Z=x/y;
		
		System.out.println("The final result of the following expression is  " +Z);
	}
	
	public static void main(String[] args) 
	
	{
		
		Class4asgn1 c=new Class4asgn1();
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("...........................................First Assignment.............................................");
		
		System.out.println("Enter the value of x1:");
		int x1=S.nextInt();
		
		System.out.println("Enter the value of x2:");
		int x2=S.nextInt();
		int sumresult=c.sum(x1, x2);
		
		System.out.println("Enter the value of x3:");
		int x3=S.nextInt();
		int subresult=c.sub(sumresult, x3);
		
		System.out.println("Enter the value of x4:");
		int x4=S.nextInt();
		int mulresult=c.mul(subresult, x4);
		
		System.out.println("Enter the value of x5:");
		int x5=S.nextInt();
		int sumresult1=c.sum(mulresult, x5);
		
		System.out.println("Enter the value of x6:");
		int x6=S.nextInt();
		c.div(sumresult1, x6);
		
		System.out.println("......................................Second Assignment..............................................");
		//A2->>(x1*x2)-x3)+x4)-x5)/x6)
		
		System.out.println("Enter the value of x1:");
		int x7=S.nextInt();
		
		System.out.println("Enter the value of x2:");
		int x8=S.nextInt();
		int mulresult1=c.mul(x1, x2);
		
		System.out.println("Enter the value of x3:");
		int x9=S.nextInt();
		int subresult1=c.sub(mulresult1, x3);
		
		
		System.out.println("Enter the value of x4:");
		int x10=S.nextInt();
		int sumresult2=c.sum(subresult1, x4);
		
		
		System.out.println("Enter the value of x5:");
		int x11=S.nextInt();
		int subresult3=c.sub(sumresult2, x5);
		
		System.out.println("Enter the value of x6:");
		int x12=S.nextInt();
		c.div(subresult3, x6);
		
		
	}
}
