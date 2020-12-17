package C07;

import java.util.Scanner;

public class primeNoAssignment {

	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		//int number=s.nextInt();
		
		int number=150;
		int h=number/2;
		int d=0;
		
		for(int i=2;i<=h;i++)
		
			if(number%i==0)
		{
				System.out.println("Its not a prime number" +number);
				d=1;
				break;
		}
			
		if(d==0)
			
		{
			System.out.println("its a prime number "+number);
		}
		
	}

}
