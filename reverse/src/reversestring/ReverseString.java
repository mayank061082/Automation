package reversestring;

import java.util.regex.Pattern;

public class ReverseString {
	
	public String reverseWord(String s1)
	{
	Pattern p=Pattern.compile("\\s");
	String[] temp= p.split(s1);
	System.out.println(temp.length);
	String r=" ";
	for(int i=0;i<temp.length;i++)
	{
		if( i== temp.length-1)		
		r=temp[i]+r;		
		else
		r=" " +temp[i]+r;
	}
	System.out.println(r);
	return r;
	}
	
	public void reverseString(String s1) 
	{
		 int a=s1.length();
		System.out.println("String length is :-" +a);
		String rev="";
		for (int i=a-1;i>=0;i--)
		{	
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
	} 

	public static void main(String[] args) 
	   {
		ReverseString rs=new ReverseString();
		rs.reverseWord("I am mayank");
		rs.reverseString("I am mayank");
		}

}
