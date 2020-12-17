package C07;

public class notepad 
{/*loops and conditions

what is condition
number is even or odd that is condition

so in java we used if else for handling the condition.


if(condition)
{
statements
}
else
{
statements
}

either if condition will execute or else will execute



% means modules operator -----it will give us the remainder
== for comparison
=  for assigning value

we can create the object of a class anywhere and scanner 
is the class given by java



if else condition-----you can put multiple conditions
else if ladder   

&& meaning both the conditions must be true




it is not mandatory to write the else part with the if part

if condition
if else condition
else if ladder
nested if else 

if
  if
  else

else
  if
  else

   OR

if 
  if
  else
else

  OR

if

else
   if 

   else


means if else inside if or else or both


_______________________________________________

switch case 
loops

again switch case is used for handling the multiple
conditions

code will execute line by line

so which case will match the corresponding will execute



Exception
compile time
run time

when we are writing the code that is compile time exception



what is the use of the loop

for repeative task

let suppose we want to print 50 values or we want to take 50 values
will i make 50 variables ?
no 

so solution is loop here.


there are three things required for the loop

1) initilization(starting point)
2) condition check(till which point our loop will execute)
3) increment/decrement

how our loop will execute(flow diagram)

for loop---------------------
while loop-------------------
do while loop----------------

while vs for 

in case of do while loop if condition is false our
loop will execute at least one time.

in case of while and for loop if condition is false
our loop will not execute.

when we know how many times our loop will execute in
this case we will go with for loop

for example table print ----------we will go with
for loop as we know our loop will execute 10 times

when we don't know how many times our loop will execute
in this case we will go with while loop

for example, we need to read a txt file we don't know
how many words/lines/characters in that file so we will
go with while loop

___________________________________________________

Assignments:-
1).Swapping of two numbers using third variable.
2).Swapping of two numbers without using third variable.
3).A number is Prime or not------A number is divisible by itself or 1
4).A number is Palindrome or not ---------reversal of the number
5).A number is Armstrong or not-------153------------1+125+27.
6).Table Print (You can print any table)
7).Factorial of a number.
8).Fibonacci Series..............................0 1 1 2 3 5 8 13 21 34

==========================================================================================================

Palindrome
Prime Number
Armstrong
Fibnocci series
Factorial 
Swapping of two numbers without using third variable

________________________________________________


Prime number --------------

which can by divide by 1 or by itself that is prime
number

int number=140

which is the biggest number that can divide our number ?
70 is the biggest number that can divide our number

What is 70, 70 is the half of our number

after 70 no number can divide our number except number.

which is the smallest number that can divide our number ?
2 is the smallest number that can divide our number.

Scanner s=new Scanner(System.in);
int number=s.nextInt();
int half=number/2;
int dc=0;
for(int i=2;i<=half;i++)   
{
   if(number%i==0)  
    {
     syso("its not a prime number "+number);  
     dc=1;
     break;   // for moving outside the loop
    } 
}

if(dc==0)
{
syso("its a prime number "+number);
}


_________________________________________

What is palindrome number ?

reverse of the number is equal to the original number
that is palindrome number.

int number=153;
int old_number=number;
int sum=0;
while(number>0)  15>0   1>0  0>0
{
int r=number%10; 151%10----1   15%10----5    1%10---1
sum=sum*10+r;    0*10+1----1    1*10+5--15  15*10+1---151
number=number/10;  151/10----15  15/10 ---1  1/10----0
}

if(old_number==sum)   153==351
{
syso("its a palindrome number "+old_number);
}
else
{
syso("not a palindrome number "+old_number);
}

___________________________________________

Armstrong number----------153-------each digit cube sum
1+125+27



int number=153;
int old_number=number;
int sum=0;
while(number>0) 
{
int r=number%10;
sum=sum+r*r*r;   
number=number/10;  
}

if(old_number==sum)   153==351
{
syso("its a Armstrong number "+old_number);
}
else
{
syso("not a Armstrong number "+old_number);
}

____________________________

Fibnocci series---------------

0  1  1  2  3  5  8 13 21 34  55  89  144 233  

int a1=0;
int a2=1;

syso(a1);   0
syso(a2);   1
int sum;
for(int i=0;i<12;i++)   0 to 11   0---1 ---2----3
{
sum=a1+a2;  sum---1   1+1---2   1+2 ---3  2+3----5
syso(sum);   1 2  3
a1=a2;  1    1   2
a2=sum; 1    2   3
}

___________________________

int number=5;
int sum=1;

for(int i=1;i<=number;i++)
{
sum=sum*i;     1*1---1   1*2---2  2*3---6 6*4---24 24*5---120
}

_______________________


swapping without using third variable

int a=11;
int b=121;


a=a+b;    11+121---132
b=a-b;    132-121---11
a=a-b;    132-11----121

a=4
b=13

a=a*b  4*13-----52
b=a/b  52/13----4 
a=a/b  52/4-----13


_______________________________________

*/

}
