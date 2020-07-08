package org.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {
	
	public static void main(String [] args)
	{
		 ArrayList arr = new ArrayList();
		arr.add(43);
		arr.add("Hello");
		arr.add(43);
		System.out.print("Array list is :-" +arr);
		
		System.out.println();
		
		LinkedList ll= new LinkedList();
		ll.add(12);
	ll.add(23);
	ll.add(12);
	//ll.add('hello');
	ll.add("hello");
	System.out.print("Linked List is:" +ll);
	
	System.out.println();
	
	Vector v= new Vector();
	v.add(12);
	v.add("hello");
	v.add(12);
System.out.print("Vector  is:" +v);  

System.out.println();
Set s=new Set();
s.set();
System.out.println();

Map m=new Map();
m.map1();
		
	}
	

}
