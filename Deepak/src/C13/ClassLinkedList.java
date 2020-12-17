package C13;

/*
>>LinkedHashset allows duplicate object values in output.
>>LinkedHashSet maintain order of an output as per the objects created in a class.

>>Linkedlist --------there is a concept of node in the linkedlist
>>1.Searching is slower in the linkedlist
>>2.Insertion and deletion is faster in the linkedlist.
*/

import java.util.*;

public class ClassLinkedList {

	public static void main(String[] args) 
	{

		LinkedList<Integer> hs=new LinkedList<Integer>();
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
