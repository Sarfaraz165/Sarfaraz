package C07; //Swapping of two numbers without using third variable

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) 
	{
		//int x,y;
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Before Swapping Numbers:"+x+" "+y);
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.println("After Swapping Numbers: "+x+" "+y);
		System.out.println();
		
		
		
		

	}

}
