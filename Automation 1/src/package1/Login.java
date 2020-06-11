package package1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.print(" Please enter your First name:-" );
		String a=scr.nextLine();
		System.out.println(a);
		System.out.println();

		Scanner scr1=new Scanner(System.in);
		System.out.print(" Please enter your Last name:-" );
		String b= scr1.nextLine();
		System.out.println(b);
		
		System.out.print(a+   " "  +b);
		scr1.close();
		scr.close();
	}

}

