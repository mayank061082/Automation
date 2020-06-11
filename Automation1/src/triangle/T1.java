package triangle;

//import java.awt.print.Printable;

public class T1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			System.out.print("*");
            System.out.println();

		}
		
		{
		System.out.println("---2-----");
//		*
//		**
//		***
//		****
//		*****
		}
				for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			System.out.print("*");
            System.out.println();

		}
		
		{
		System.out.println("---3-----");
            //	     *
		   //       **
			//     ***
			//    ****
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			    {
			       for(int k=1;k<=i;k++)					     			     
			        System.out.print("*"); 		     
			    
		     	}			
			System.out.println();		
	   }
		{
		System.out.println("---4-----");
		//     11111
		//     2222
		//     333
		//     44
		//     5
		}
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				System.out.print(i);
	            System.out.println();
		}
		}
		{
			System.out.println("---5-----");
//			1
//			12
//			123
//			1234
//			12345
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				System.out.print(j );
	            System.out.println();

			}
			
			{
				System.out.println("---6-----");
		            //	     *
				   //       **
					//     ***
					//    ****
				}
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=i;j++)
					{						
					       for(int k=1;k<=i;k++)					     			     
					        System.out.print("* "); 		     
					    
				     	}			
					System.out.println();		
			   }
			
}
}
