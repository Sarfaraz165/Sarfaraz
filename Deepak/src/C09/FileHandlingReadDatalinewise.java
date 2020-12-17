package C09;// Read data from file line by line.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReadDatalinewise {

	public static void main(String[] args) throws IOException 
	{

		File f=new File("../Deepak/MyFile.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader b=new BufferedReader(fr);
		
		String s;
		
		while((s=b.readLine())!=null)
			
		{
			System.out.println(s);
		}
		
		
		
		
				

	}

}
