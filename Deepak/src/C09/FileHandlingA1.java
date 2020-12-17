package C09;

//1).Create a method named ReadData and pass the row No and that method will read the data of that particular row.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileHandlingA1 

{ 
	public void ReadData(int rowNo) throws IOException
	{
		File f=new File("../Deepak/MyFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		
		String line;
		
		for(int i=1;i<rowNo;i++)
		{
			b.readLine();
		}
		
		line=b.readLine();
			
		System.out.println(line);
			
		
	}

	public static void main(String[] args) throws IOException 
	
	{
		FileHandlingA1 obj=new FileHandlingA1();
		
		 obj.ReadData(4);
		
		
		
	}

}
