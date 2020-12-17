package C09; // Reading data character by character.

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReadData{

	public static void main(String[] args) throws IOException
	
	{
				
		File f=new File("../Deepak/MyFile.txt");
		
		FileReader fr=new FileReader(f);
		
		int a;
		
		while((a=fr.read())!=-1)
			
		{
			System.out.println((char)a);
		}
		
		fr.close();
		
	}	
	
}
