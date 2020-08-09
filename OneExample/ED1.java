

import java.lang.*;

public class ED1 {
	int age;
	String name;
	
	publc ED1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("calling constructor");
		
	}

	public static void main(String[] args) {
		ED1 e=new ED1("mayank",23);
		
	}



}
