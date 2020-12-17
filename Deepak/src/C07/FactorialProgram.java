package C07;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find factorial");
		int no=sc.nextInt();
				
		int f=1;
		
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
		
		System.out.println("Factorial of "+no+" is "+f);

	}

}
