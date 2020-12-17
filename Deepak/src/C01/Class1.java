package C01;

public class Class1 {
	
		int age;  //Global Variable
		
		int rollno; //Global Variable
		
 public void display1 ()
 
 {
System.out.println("Welcome All");
 }
		
public void display2 ()	

{
System.out.println("Automation is very easy");

}
	public static void main(String[] args) {
	 
	 Class1 sam= new Class1();
	 
	 sam.age=90;	 
	 
	 sam.rollno=100;
	 	 
	System.out.println("Age is "+sam.age);
	
	System.out.println("Roll no is " +sam.rollno);
	 
	 sam.display1();
		 
	 sam.display2();
 
}

}
