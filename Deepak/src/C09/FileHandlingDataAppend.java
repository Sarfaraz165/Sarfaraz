package C09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDataAppend {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("../Deepak/MyFile.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("Splendour");
		b.newLine();
		b.write("yamaha");
		b.newLine();
		b.write("honda");
		
		b.close();

		

	}

}
