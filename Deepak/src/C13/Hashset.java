package C13;
//Hashset is not allowed duplicate object values in output.
//HashSet will not maintain the order of an output.


import java.util.HashSet;

public class Hashset { 
	
	public static void main(String[] args) 
	{
		
		HashSet<Integer> hs=new HashSet<Integer>(); //Integer is a class of Collection.
		
		hs.add(12); // hs is an object of Hashset, add is a method of collection, Value is an object of it.
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
