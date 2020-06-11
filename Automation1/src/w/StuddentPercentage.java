package w;

import java.io.*;

public class StuddentPercentage {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int per = 0;
		String input = "" ;
		
		System.out.println("Enter Percentage :");
		input = br.readLine();
		
		per = Integer.parseInt(input);
		
		if(per >=65)
		{
			System.out.println("You Got "+input+"%" + "  Congrats! I am Proud, You Rocked");
		}
		else if (per >=45 && per <65)
		{
			System.out.println("You Got "+input+"%" + "  Better Luck Next Time");
		}
		else if (per >=33 && per <45)
		{
			System.out.println("You Got "+input+"%" + "  Work Harder and set a Goal in life !");
		}
		else
			System.out.println("You Got "+input+"%" + "  Your are a Looser!");
	}

}




