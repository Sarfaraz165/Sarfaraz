package C09;

public class notepad 
{
/*
so today we will discuss about file handling(txt file handling)


1) how to read data from txt file character by character
2) how to read data from txt file line by line
3) how to write data in a file(single line)
4) how to write multiple lines in a file
5) how to append data in a file



for reading/writing data in a file, we need to establish
a connection 

how to create a connection with the file ?
using File class.

File-----------------for making connection(tunnel) with the file
FileReader----------for reading character by character


read() ----------it will return the ascii value of each
character or -1 if the end of the file has been reached


when you will give the path from the project means you have
attached the file with your project in that case before
path you need to write .. before the path




cd .. ---------parent directory



line by line data read 

for reading line by line we will use bufferedReader class


how to write data in a file

it will overrite the existing file data

how to write single line in a file


how to append the data. means our old data remain and
new data will be appended in the file

======================================================================================================
public void ReadData(int rowNo)
{
  // write the logic 
  // this method will read the data based upon rowNo
}

obj.ReadData(4);
obj.ReadData(2);  // now it will read the data of 2nd row



public void ReadData(int initialrowNo,int endrowNo)
{
  // write the logic 
  // this method will read the data based upon rowNo
}


obj.ReadData(3,7);  // it will read from 3rd row to till 7th row


public void WriteInFile(int rowCount)
{
   // your method will write in 5 lines
   // and data you need to take using Scanner class
}


obj.WriteInFile(5);



obj.WriteInFile(3,7);   first two row blank and
from 3rd row to 7th row data will be write that
you need to take from user
============================================================================================================
Assignments:-

1).Create a method named ReadData and pass the row No and that method will read the data of that particular row.

2).Create a method named ReadDataofRange and pass the initial row No and end row no, that method will read the data of that
particular range.

3).Create a method named WriteData and pass the rowCount and that method will write till that rowCount and you have to take the
data from user, that should be write in the file.

4).Create a method named writeDataInRange and pass the initialRowCount,endrowCount, and that method will write in that range
and you have to take the data from user,that should be write in the file(2,7) while calling method should write from 2nd to 7th
line and first line will be blank.

5).Read from file1 and write that data into file2(Copy-------Paste)

*/


}
