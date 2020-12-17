package C12;// Abstract Class

public abstract class AbsClass1 
{
 public void method1()
 
 {
	 System.out.println("with body method");
 
 }
 	public abstract void method2();
 	
 	
 
}
	
/*Abstraction is hiding the internal information from the external world.
 * 
 * Under abstractions, there are two things as 1).Abstract Class 2).Interface.
 * 
 * Abstract Class can be withBody or withoutBody
 * Interface : Only without body
 * 
 * Q1.Who will give the the body to the abstract method of abstract class or interface.
 * Ans.The class which will inherit the abstract class or interface will give the body to the abstract method.
 * 
 * We can't create the object of the abstract class or interface.
 * 
 * This is the mapping to extends the following
 * Class------Class-----------extends
 * Interface---Class---------Implements
 * Interface--Interface------extends
*/
