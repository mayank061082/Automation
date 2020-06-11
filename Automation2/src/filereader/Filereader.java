package filereader;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader {
	
	public static void main(String[] args) throws IOException {
		
	
	File f= new File("E:\\2.txt"); // make connection
	FileWriter fw= new FileWriter(f);  // create file writer object
	fw.write("hello 4 world"); // write string in the file
	fw.flush();  //remove data from memory
	fw.close();  //save the content
	
}	

}
