package C07;

import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) 
	
	{
		System.out.println("enter the value of a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c;
		
		System.out.println("Please enter operator press 1 for sum, press 2 for sub, press 3 for mul, press 4 for div");
		int Operator=s.nextInt();
		
		switch (Operator)
		{
		
		case 1:
			
			c=a+b;
			System.out.println("result is "+c);
			break;
			
		case 2:
			
			c=a-b;
			System.out.println("result is "+c);
			break;
			
		case 3:
	
			c=a*b;
			System.out.println("result is "+c);
			break;
	
		case 4:
	
			c=a/b;
			System.out.println("result is "+c);
			break;
			
			default:
				System.out.println("Please enter correct operator");
				break;
		
			
			
		
		
		
		
		
		}
		
		

	}

}
