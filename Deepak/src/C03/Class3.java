package C03; ///All Constructor:-

public class Class3 {
	
public Class3() 

{

	this(11,222,33,44);
	System.out.println("Default Constructor");

}	
	
public Class3(int a) 

{

	this();
	System.out.println("1 Parameterized Constructor");

}	

public Class3(int b, int c) 

{

	this(3,4,5);
	System.out.println("2 Parameterized Constructor");

}	

public Class3(int d, int e, int f) 

{

	this(6);
	System.out.println("3 Parameterized Constructor");

}	

public Class3(int g, int h, int i, int j) 

{

	
	System.out.println("4 Parameterized Constructor");

}	

public static void main(String[] args) {
	
	Class3 S=new Class3(1,2);
	
}

}



