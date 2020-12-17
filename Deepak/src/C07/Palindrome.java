package C07;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a number");
		
		int no=sc.nextInt();
		int temp=no;
		int rev=0;
		int rem;
		
		
		
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(no==rev)
		{
			System.out.println("This is Palindrome number");
		}
		else
		{
			System.out.println("This is not a palindrome number");
		}
		
		
		

	}

}
