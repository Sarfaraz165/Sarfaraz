package C13;
//LinkedHashMap does not allow duplicate key value of an object in output.
//LinkedHashMap maintains order of an output as per the objects created in a class.


import java.util.*;
import java.util.Set;

public class ClassLinkedHashmap {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
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
