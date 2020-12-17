package C09;

//Program Assignment).
/*Create a method named ReadDataofRange and pass the initial row No and end row no, that method will read the data of that
particular range.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileHandlingA2 
{

	
	public void ReadDataofRange(int initialRowNo,int endRowNo) throws IOException
	{
				
		File f=new File("../Deepak/MyFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		
		String line;
		
		for(int i=0;i<=endRowNo;i++)
		{
			if(i>=initialRowNo && i<=endRowNo)
			{
				line=b.readLine();
				System.out.println(line);
			}
			
			else
			{
				b.readLine();
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		FileHandlingA2 obj=new FileHandlingA2();
		
		obj.ReadDataofRange(1,3);
		
	}

}
