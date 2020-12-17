package C10;

public class Notepad 

///Please see C10maven Project for the same.Since code has been implemented there.
//C10Project is created to add jar file manually.
//C10mavenProject created to create JXL liabrary through maven.
{
//=========================================================================================================
/*Please share your assignment status in the group

if someone want to revise the any of the java topic
then ping me

__________________________________________________

today we will discuss about how to handle the 

Excel file(xls format)
xlsx format
csv format

__________________________________________________


doubt in any of the assignment(file handling)
I will 

just create your method and call your method from the main method


______________________________

for handling the xls format there is a library named
JXL will be used.

what is library ?
built in classes and methods


collection of the built in classes--------->jar file 

C language----------library

when you will use the built in classes there is corresponding 
package will import 

from where these package comes ?
from the jar files.


JXL -----------jar file
APache poi-----xlsx format-------jar file


each library has its own jar file



so you can attach the jar files or you can give the 
jar file to your project by two ways

1) by manually means we will download the jar file and
we will attach that jar file with the project

2) each jar file has its corresponding maven dependency.

you need the jxl jar file --------

you will create the maven project --------after creation of
the maven project----------you will get a file named pom.xml 

you need which jar file ?
jxl jar file

1) either you can attach the jxl jar file manually to your project.
2) you can give the maven dependency of that jar file to the
pom.xml and maven will download the jar file by itself.


Maven is a build tool which will manage all the jar files
or all the dependencies of your project.


let me explain the jar file attachment ways

1) download + attach 

http://www.java2s.com/Code/Jar/j/Downloadjxl26jar.htm



how to attach ?

right click on the project -------then build path
---then configure build path --------library-------add external
jar 


in case of txt files ----all the package will come from
the java jar files which are already part of your project

but in case of xls format ---we need to attach the jar file
of jxl library



How to attach the jar file ?

create a maven project --------> after that you will
get a file named pom.xml


in this case there is problem related to eclipse if you 
are not able to see the maven project option


just install the maven integration plugin in the eclipse


put your dependency in the dependencies tag in the
pom.xml 


maven will maintain all the jar files of your project you just need to pass the
maven dependency of the jar file which you need.



prefer ---------create the maven project and pass the
maven dependency of the jar files which you need to
the pom.xml maven will download the jar files by itself and
it will create a folder named .m2 in your system and in
this folder maven will maintain the jar files in your system


maven will maintain all the jars files of your project
 based upon the dependency which you are giving to the
pom.xml 



now let suppose we need the apache poi jar files 

just pass the apache poi maven dependency to the pom.xml
and maven will download the apache poi jar files as well


jxl --------------xls format
apache poi--------xlsx format + xls format


WHat is the meaning of Library ?
built in classes and methods.


getWorkBook() is returning the object of the Workbook Class

and it is a static method

Each library has its own rule so here in this 
case we can't create the object of the Workbook class
using new keyword here getWorkBook() is the method
that will return the object of the Workbook class



excel file----------Workbook
sheet --------------sheet
Cell

workbook is a collection of sheet 


overloading


getsheet(0);
getsheet("sheet1"); 

overloading-------input ------always different

Apache POI ------------here we will create object using 
new keyword

what is the use of the Label ?
with the help of Label we will define the cell
structure

means what will be the row no, what will be the column no
and what will be the data for the cell 
*/
}
