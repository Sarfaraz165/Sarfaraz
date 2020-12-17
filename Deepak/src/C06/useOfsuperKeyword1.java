package C06;

public class useOfsuperKeyword1 extends useOfsuperKeyword

{
  public void method2()
  
  {
	//here we are calling parent method and global variable of a parent class using super keyword
	  super.a=235;
	  super.method1();      
	  System.out.println("The value of a is "+a);
	  System.out.println("Child Method");
	  
  }
  
  public static void main(String[] args) 
  
  {
	  useOfsuperKeyword1 obj1=new useOfsuperKeyword1();
	  
	  obj1.method2();
	
}
  
  
  
  
  
  
}
