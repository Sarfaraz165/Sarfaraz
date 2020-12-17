package C01;

public class Class1Notepad 
{

	/*What is the difference between JDK,JRE and JVM
	 
	Java Setup
	Eclipse Setup
	Compilation Process and Interpration Process
	What is Class
	What is Object
	What is Variable and Method
	4 pillers of a program

	_____________________________________

	JDK-------Java Development Kit----
	When we want to write the code and we want to execute/run
	the code then we need JDK in our system.

	JRE---------Java Runtime Environment------
	When we want to only run/execute the code then we need
	JRE in our system.

	JVM-------Java Virtual Machine-------
	that will actually run the code.

	Because JVM is a virtual machine that will execute the code in the environment provided by JRE.


	yes if we have JRE in our system we can execute the code.

	JRE----will provide an environment and JVM is a part of JRE
	in that environment JVM will execute the code.

	JDK---contains-------JRE + JVM
	JRE---contains-------JVM

	What we will download ?
	we need jDK as we want to write the code and we want to
	execute the code.


	What is the responisiblity of JavaC ? 
	to convert the .java into .class file.

	What is the responsibility of JVM ?
	to convert the .class file into machine code.


	for jdk download link
	https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

	depending upon your system requirement,download the exe file of the jdk 

	if your system is 64 bit----then download x64 exe
	if your system is 32 bit----then download x86 exe


	when you will download the exe file, you need to create
	an account on the Oracle website.

	after that you will be able to download the exe file of the
	jdk.

	while account creation, fill your information.


	After downloading the jdk exe file(executable file)

	just click on it and next---next and finish

	after finishing you will get the java setup in your system.

	inside C:ProgramFiles.


	Copy the bin folder path

	C:\Program Files\Java\jdk1.8.0_171\bin

	right click on this pc.-----> go to properites---
	go to advance system settings-->go to Environment Variable
	------> there will be two types of variable
	one is user variable second is system variable

	Inside system variable there will be a variable named Path

	click on the new and paste your path

	in Window 7----Path variable value will be in a single line
	go to the end of the line put semicolon and paste your path

	In window10--------there will be different different values
	in the path variable click on the new and paste your path


	Why we pasted the path of the bin folder inside Path Variable ?



	What is the responsibility of javaC ?
	to convert the .java into .class file.

	javaC means java compiler.

	Why we pasted the path of the bin folder inside path variable ?
	because inside bin folder there is a file named javaC

	so Eclipse needs the javaC for the conversion of the .java
	into .class file


	_____________________________________________

	how we get to know whether java has been installed or not ?
	go to cmd 


	when we will write javac on the cmd again it will check
	inside path variable whether there is a entry of javac or not
	if no entry then javac command will not execute.

	because in the bin folder there is a file named javac

	eclipse needs the javac for the conversion of the .java
	into .class file so eclipse will check inside path variable
	whether there is a entry of javaC or not 

	if yes then where it exist
	if no then it will not able to convert the .java into .class





	What is Eclipse ?
	Eclipse is a software, Eclipse is a Editor
	where we can write the code.


	.class file----convert-------.java 
	---------------------------------------


	64 bit eclipse ---https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-06/R/eclipse-java-2020-06-R-win32-x86_64.zip&mirror_id=1142

	after downloading the eclipse, just extract the folder.

	WHat is Workspace ?
	the location in the system, where our code will be saved.


	it will check whether the folder exist or not 
	if yes then it will not create new folder
	if no then it will create new folder


	Workspace---D:\MorningBatch123


	Java----------Core Java



	for differentiating the things we create package.

	let suppose we have some code of P0 category we will create
	P0 package and we will put the code of PO in the P0 package

	p1 category code----------p1 package


	When you are writing the code, compilation process is going on

	as we have created .java file the corresponding .class file
	has been created in the bin folder

	and when we will execute the code then intrpreation process
	will be happen.

	A Class represent(Contains) variable and method



	What is Variable ?
	which store some value and value can be change

	What is method ?
	when we want to perform any operation(action), we will create method
	for it.

	just type syso and use control+space

	what is the use of syso ?

	for printing something on the console we use syso


	4 pillers of a program

	1) Class Creation--------Put Variable and method in the Class
	2) main method Creation---main method is given by java
	it is the entry point of the execution.
	(execution will start from the main method)
	3) Object Creation inside main method
	4) calling/access the variable and method of the class
	using reference_variable



	What is the syntex of the object creation ?

	Classname reference_variable=new Classname();

	Here new keyword will create the object. After that memory will be allocated.
	there will be some address of that memory.
	reference_variable will point to that memory address.





	because code will execute line by line inside main method.


	what is the use of . keyword ?
	for calling the variable/method.


	you can run single class at a time. 

	why we create different different methods
	becuae we have to make the things more reusable. 


	recording + noted down + assignment

	*/
	
}
