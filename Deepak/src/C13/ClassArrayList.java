package C13;

//LinkedHashset allows duplicate object values in output.
//LinkedHashSet maintain order of an output as per the objects created in a class.
//what is the difference between arraylist and linkedlist
//1) Searching is faster in the arraylist because searching will be happen based upon the index Number
//2) Insertion and Deletion----------Insertion and Deletion is slower in the arraylist

import java.util.*;

public class ClassArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> hs=new ArrayList<Integer>();
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
