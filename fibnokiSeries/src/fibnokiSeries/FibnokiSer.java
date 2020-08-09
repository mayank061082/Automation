package fibnokiSeries;

import java.util.Scanner;

public class FibnokiSer {

	public static void main(String[] args) {
		//Object Scanner;
	
		//Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter Number:-");
	//	int no=sc.nextInt();
		
		for (int no=1;no<=5;no++)
		{
			int temp=0;
		for (int i=2;i<=no-1;i++)
		{			
		    if(no%i==0)
		    {				    
		    temp=temp+1;		    
		    }
		 
		}
		if (temp==0)
		{	
			System.out.print( " " +no);
		}
		//else
		//{
	//		temp=0;
		//}
	}

}}
