package C09; //How to write a single in a file.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDataWriting {

	public static void main(String[] args) throws IOException {
		
		File f=new File("../Deepak/MyFile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("This is still my classss");
		fw.close();

	}

}
