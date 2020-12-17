package C13;
//LinkedHashset is not allowed duplicate object values in output.
//LinkedHashSet maintain the order of an output as per the objects created in a class.


import java.util.LinkedHashSet;

	public class LinkedHashSets {

	public static void main(String[] args) 
	{
		
	
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(12); // hs is an object of HashSet, add is a method of collection, Value is an object of it.
		hs.add(11);
		hs.add(111);
		hs.add(12);
		hs.add(12);
		hs.add(12345);
		hs.add(656);
		hs.add(1224);
		
		for(Integer i: hs) /// Here we have used for each loop for the same.
		{
			System.out.println(i);
		}

	}

}
