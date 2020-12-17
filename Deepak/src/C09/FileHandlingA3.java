package C09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Program:-
//3).Create a method named WriteData and pass the rowCount and that method will write till that rowCount and you have to take the
//data from user, that should be write in the file.

public class FileHandlingA3 
{

	public void WriteData(char rowCount) throws IOException
	{
		File f=new File("../Deepak/MyFile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("rowCount");
		BufferedWriter b=new BufferedWriter(fw);
		b.write("a");
		fw.close();
	}
	
		
	public static void main(String[] args) 
	{
		System.out.println("Enter the content here");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println((char)a);
		
	}

}
