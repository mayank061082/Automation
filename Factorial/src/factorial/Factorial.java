package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	java.util.Scanner input = new java.util.Scanner(System.in);
	String userName;
	final int validLength = 6; // This is the valid length of an user name

	
	System.out.print("Please enter the username: ");
	userName = input.nextLine();

	while(userName.length()<validLength) {

	    // If the user enters less than validLength characters
	    // ask for entering again
	    System.out.println("\nUsername needs to be " + validLength + " character long");

	   // System.out.print("\nPlease enter the username again: ");
	 //   userName = input.nextLine();
	}

	System.out.println("Username is: " + userName);

//	private static Scanner put;
//
//	public static void main(String[] args) {
//		int i;
//		int fact=1;
//		put = new Scanner(System.in);
//		System.out.println("Enter Factorial number:");
//		int num=put.nextInt();
//		for(i=1;i<=num;i++){    
//		      fact=fact*i;    
//		  }    
//		  System.out.println("Factorial of "+num+" is: "+fact);  
		

	}

}
