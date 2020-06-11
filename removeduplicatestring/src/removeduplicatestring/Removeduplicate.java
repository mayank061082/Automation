package removeduplicatestring;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicate {
	
	public static void main(String[] args) {
		String str="mayankpooja";
		System.out.println(removeduplicate(str));
	}
	
	public static String removeduplicate(String str) 
	{
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for (int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
			
		}
		
		
		return sf.toString();
		
	}

}
