package org.collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class Set {
	public void set()
	{
	 HashSet hs= new HashSet();
	hs.add(12);
	hs.add(12);
	hs.add("hello");
	System.out.println("Hash Set value is :-" +hs);
	
	System.out.println(); 
	
	TreeSet<Integer> ts= new TreeSet<Integer>();
	ts.add(12);
	ts.add(122);
	ts.add((int)'0');
	System.out.print("Tres Set value is :-" +ts);
	System.out.println(ts.first());
	
	}
		

}
