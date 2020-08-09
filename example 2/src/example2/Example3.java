package example2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example3 {

	public static void main(String[] args) throws Exception {
	/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int space=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				space++;
		}
		String arr[]=new String[space+1];
		String nstr="";
		for(int i=0,j=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				arr[j]=nstr;
				j++;
				nstr="";
			}
			else{
				nstr=nstr+str.charAt(i);
			}
		arr[j]=nstr;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
} 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
ArrayList<Integer> al=new ArrayList<Integer>();  
ArrayList<String> splitResult=new ArrayList<String>();
for(int i=0;i<s.length();i++)
    if(s.charAt(i)==' ')
        al.add(i);
al.add(0, 0);
al.add(al.size(),s.length());
String[] words=new String[al.size()];
for(int j=0;j<=words.length-2;j++)
        splitResult.add(s.substring(al.get(j),al.get(j+1)).trim());
System.out.println(splitResult);
}
}
		String s = "012ab567akb0123aab76b";

	    String delims = "a b";

	    StringTokenizer st = new StringTokenizer(s, delims);
	            System.out.println("No of Token = " + st.countTokens());

	             while (st.hasMoreTokens())
	             {
	                 System.out.println(st.nextToken());
	             }

	     }

	} */
		String text1 = "Some text for example   ";
        String text2 = "   Second sentences     ";
        System.out.println(Arrays.toString(mySplit(text1, text2)));
    }

    private static String [] mySplit(String text1, String text2) {
        text1 = text1.trim() + " " + text2.trim() + " ";
        char n = ' ';
        int massValue = 0;
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == n) {
                massValue++;
            }
        }
        String[] splitArray = new String[massValue];
        for (int i = 0; i < splitArray.length; ) {
            for (int j = 0; j < text1.length(); j++) {
                if (text1.charAt(j) == n) {
                    splitArray[i] = text1.substring(0, j);
                    text1 = text1.substring(j + 1, text1.length());
                    j = 0;
                    i++;
                }
            }
            return splitArray;
        }
        return null;
    }
}