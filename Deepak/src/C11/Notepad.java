package C11;

/*This notepad work has been implemented under the C10mavenProject with classes as "ExcelReadPOI, ExcelWritePOI"*/

public class Notepad 
{/*single loop
double loop
file handling(txt)
file handling(xls format)

___________________________________ 

xlsx format 
how to make the jar file(what is the use of the jar file)

_________________________________

how to handle the xls format ?
with the help of JXL library we can handle the xls format


how to handle the xlsx format ?
with the help of Apache POI Library we can handle the xlsx format


what is APache POI ?
its a library which provide the built in classes and methods
for handling the xlsx format and xls format



for each library there is corresponding jar files
for each jar files there is corresponding maven dependency

so either you can attach the jar files manually 
or you can pass the maven dependency of the jar files to
the pom.xml 

so we need the maven dependency of the apache poi library

_______________________________________________________


<dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>poi</artifactId>
                 <version>3.9</version>
          </dependency>
          <dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>poi-ooxml</artifactId>
                 <version>3.9</version>
          </dependency>
          <dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>poi-ooxml-schemas</artifactId>
                 <version>3.9</version>
          </dependency>
          <dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>poi-scratchpad</artifactId>
                 <version>3.9</version>
          </dependency>
          <dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>ooxml-schemas</artifactId>
                 <version>1.1</version>
          </dependency>

          <dependency>
                 <groupId>org.apache.poi</groupId>
                 <artifactId>openxml4j</artifactId>
                 <version>1.0-beta</version>
          </dependency>



______________________________________________________

maven is the plugin that will come with the eclipse.



if you face any problem delete the .m2 folder and
update your project


it will download the jar file again.

firstly maven will check inside the .m2 folder whether
the jar exist or not if it exist then it will not
download any jar file
if it doesn't exist then it will download the jar files


in my case also jars exist in the .m2 folder so it is
not downloading the jar file.

Each library has its own rule.
Each library has its own classes and methods.


File
FileInputStream
XSSFWorkbook
XSSFSheet
XSSFRow
XSSFCell

each time 
-----------------------------------

getSheetAt(indexNumber);
getPhysicalNumberofRows();  ---------it will give you the
number of rows(rows count) 
getRow();


Cell is part of Row
Row is a part of sheet
sheet is a part of workbook
for workbook we need the object of fileinputstream
for fileinputstream we need the object of file 


Collections
String handling
Exception handling
Array
Db connectivity 

so that i can relate the use of these things in selenium


data driven
keyword driven
bdd cucumber

Integration with jenkins+github
*/

}
