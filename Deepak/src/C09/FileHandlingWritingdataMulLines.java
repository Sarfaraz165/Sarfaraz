package C09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWritingdataMulLines {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("../Deepak/MyFile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		b.write("This is first line");
		b.newLine();
		b.write("Second Line data");
		b.close();

	}

}
