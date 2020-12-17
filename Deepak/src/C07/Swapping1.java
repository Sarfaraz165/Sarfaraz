package C07; ///Swapping of two numbers using third variable.

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) 
	
	{
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before Swapping Numbers:"+x+" "+y);
		
		z=x;
		
		x=y;
		
		y=z;
		
		System.out.println("After Swapping Numbers: "+x+" "+y);
		System.out.println();
		

	}

}
