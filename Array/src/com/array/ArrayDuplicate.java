package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		String[] duplicate=new String[]{"JAVA","ORACLE","C","C","C++","JAVAc"};
		List duplicatelist=Arrays.asList(duplicate);
		Set duplicateSet=new HashSet<>(duplicatelist);
		if(duplicateSet.size()!=duplicatelist.size())
		{
			System.out.println("Array contain duplicate value");
			
		}
		else
		{
			System.out.println("Array doesn't contain duplicate valus");
		}
		
			}

}
