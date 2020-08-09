package org.collections;

import java.util.HashMap;
import java.util.Vector;

public class Map {
	
	public void map1()
	{
		HashMap<String,String> hp=new HashMap<String,String>();
		hp.put("Mayank","Sri");
		//hp.put("hello", 1);
		//hp.put(2, "rahul");
		//System.out.println(hp.getOrDefault(9,10));
		hp.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
		
		
	
	}

}
