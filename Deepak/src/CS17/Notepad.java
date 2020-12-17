package CS17;

public class Notepad 
{

	/*
	 drop down
junit

-------------------------------------------

today we will discuss how to handle the drop down

in the last session, we didn't discuss about the drop down


how to handle the drop down-------------

there are two type of drop downs 

1) either it will be inside select tag-----------Select Class
2) or it will be in the some other tags----------Actions Class

there are three ways given by select class

1) selectByVisibleText -----whatever item you want to select
from the drop down just pass that thing
2) selectByIndex------------in this case you need to pass the indexNumber and indexing will start from zero
3) selectByValue-------------in this case, we will take the
value from the HTML and the corresponding item will be
selected in the drop down 


each technique will not work at every place.


Actions ------------------I will discuss later on

What is Junit ?
Junit is a unit testing tool which is used to run
the classes which don't have main method

it is based on annotations and annotations will be
applied on the method.

what is the annotation ?
annotation is the meta tag which define the order of 
execution

@Test is the mandatory annotation----you will write the test case
@Before -------it will execute before the test case 
@After---------it will execute after the test case


browser launch + url hit + maximize---------@Before
signup page---------------------------------@Test
browser close-------------------------------@After


Before
test
after

let suppose we have multiple test annotation then
what will happen

before and after will execute with each test annotation


we can't set the priority of the test annotations if
there is multiple in the junit

here it will execute alphabatically

but in testng, we can set the priority

_____________________________
Before
Test 
After
BeforeClass
AfterClass
ignore ---------if you don't want to execute any of the
test annotation we will use ignore annotation
_______________________________



the method below beforeClass and afterClass will be
always static


signup ---------------whatever prerequisite for the
test case we will put inside before annoation method

whatever is for closing of the test case we will put
inside after annotation 

it is not mandatory to use all the annotation
mandatory is only test annotation

for example we have two testcases although we can
implement with before test after only but for example
i want to cover those two testcases with all annotation

TC1----------------------send message to someone on fb
TC2----------------------send friend request to someone on fb


beforeclass-------browser launch + url hit + maximize
before-----------signin
test-------------send message tc
aftrer-----------signout
before-----------signin
test--------------send friend request
after--------------signout
afterclass---------close browser

although we can do the above activity with before test and after only
but here just for example i have used all the annotation

__________________________________


beforeclass and afterclass will execute in the
starting and in the end 

before and after will execute with each test annotation


Assignment of the day------------>

complete signup page automate using main method
complete signup ppage using junit

cssselector------------tag with class with attribute
tag with class
tag with attribute
tag with class with attribute

tagname.classValue[attributename='attributeValue']

*/
}
