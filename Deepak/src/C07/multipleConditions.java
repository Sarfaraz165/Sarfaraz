package C07; //Multiple Conditions and If else ladder

import java.util.Scanner;

public class multipleConditions {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of marks");
		Scanner s=new Scanner(System.in);
		
		int marks=s.nextInt();
		
		if((marks>=0)&&(marks<35))
		{
			System.out.println("failed");
		}

		else if((marks>=35)&&(marks<60))
		{
			System.out.println("Pass");
		}
		
		else if((marks>=60)&&(marks<80))
		{
			System.out.println("First division");
		}
		
		else if((marks>=80)&&(marks<=100))
		{
			System.out.println("Merit");
		}
		
		else 
		{
			System.out.println("Please enter coorect value");
		}
	}
	

}
