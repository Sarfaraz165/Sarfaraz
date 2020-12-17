package C05;

public class Class5Notepad 

{
/* Inheritance
super keyword


What are the OOPS Concept ?

Object Oriented Programming

Inheritance
Polymorphism
Encapsulation
Abstraction
Class and Object

_______________________________________________


What is Inheritance ?
acquiring the properties of parent class to the child class
that is Inheritance.

now with the help of child object we can call the
child method+ child variable+ parent method + parent variable


we can't call the local variable
we can call only global variable


Multiple Inheritance pending--------

What is the fourth thing for the constructor
it will be called by itself when we will create the object
of the class.

each time, parent default constructor is calling

implicit call--------------if you are not writing super 
keyword, in each constructor of the child, compiler has 
written super() and that is calling the parent default constructor

if you want to call the parent parameterized constructor
then that will be explicit call and with the help of
super keyword you can call the parameterized constructor


___________________________________________

super() ---------default call 

if you are not writing super keyword it will call the parent
default constructor(implicit call)
if you want to call parent parameterized constructor then
use the super keyword(explicit call)

super will be the first statement in case of constructor
calling
we can't write more than one super statement in case of
constructor calling of parent
we can't use this and super together inside a single constructor.

___________________________________________


this keyword----------constructor calling with in same class
super keyword--------constructor calling in case of inheritance



_____________________________________________

Assignment----------------Output should be in the below sequence(use the this keyword and super keyword)

Parent 3 parameterized constructor
Parent default constructor
Parent 4 parameterized constructor
parent 2 parameterized constructor
parent 1 parmaeterized constructor
child  3 parameterized constructor
child  default constructor
child  2 parameterized constructor
child  4 parameterized constructor
 
 */
}
