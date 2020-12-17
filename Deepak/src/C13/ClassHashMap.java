package C13;

//HashMap does not allow duplicate key value of an object in output.
//HashMap does not maintain order of an output as per the objects created in a class.


import java.util.*;

public class ClassHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(12, "Sam");
		hm.put(11, "Deep");
		hm.put(1, "DC");
		hm.put(123, "Sam MORGAN");
		hm.put(1223, "mAX");
		
		Set<Integer> abc=hm.keySet();
		
		for(Integer i:abc)
		{
			System.out.println("Key is "+i+" Value is "+hm.get(i));
		}

	}

}
