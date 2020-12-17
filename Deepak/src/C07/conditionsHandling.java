package C07; /// Nested If else

import java.util.Scanner;

public class conditionsHandling {

	public static void main(String[] args) 
	
	{
		

		System.out.println("Enter value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Even Number");
			}
			
			else
			{
				System.out.println("Odd Number");
			}
		}
			else
			{
				System.out.println("Please enter +ve number");
			}
		}
	}


