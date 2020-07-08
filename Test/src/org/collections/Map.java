package org.collections;

import java.util.HashMap;
import java.util.Vector;

public class Map {
	
	public void map1()
	{
		HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		hp.put(1, 2);
		//hp.put("hello", 1);
		//hp.put(2, "rahul");
		System.out.println(hp.getOrDefault(9,(int)'e'));
	}

}
