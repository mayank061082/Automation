package filereader;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader {
	
	public static void main(String[] args) throws IOException {
		
	
	File f= new File("E:\\2.txt");
	FileWriter fw= new FileWriter(f);
	fw.write("hello 2 world");
	fw.flush();
	fw.close();
	
}	

}
