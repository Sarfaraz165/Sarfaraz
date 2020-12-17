package C07;

import java.util.Scanner;

public class conditions {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		//Condition
		if(a%2==0) //remainder will be 0/1
		{
			System.out.println("number is even "+a);
		}
		
		else
		{
			System.out.println("number is odd "+a);
		}

	}

}
