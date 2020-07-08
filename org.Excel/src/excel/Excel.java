package excel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.stream.Stream;

public class Excel {

	public static void main(String[] args) throws Exception {
		File f=new File("./testdata/data.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("mayank singh srivastava");
		bw.newLine();
		bw.write("mayank Srivastava");
		bw.newLine();
		bw.flush();		
		bw.close();
		
		 File f1=new File("./testdata/data.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr); 
		String s=br.readLine();
		while(s!= null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		br.close(); 
		
		
		
		

	}

}
