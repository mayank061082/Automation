package filereader1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader1 {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\2.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);		
		String s=br.readLine();		
		while(s!=null)	
		{
		System.out.println(s);
		s=br.readLine();
		}
		br.close();
		
	}
		

	

}
