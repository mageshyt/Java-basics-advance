# Java Cheat Sheet

```
Hello World
    System.out.println("Hello World");
```

**Data Types**

```java
   1.int
   2.double
   3.float
   4.String
   5.boolean
```

**Int Data Type**

```Java
int age=20;
int year=2020;
int month=12;
int day=31;
int totalDays=day+month+year;
System.out.println(totalDays); // Output: 366
```

**Double Data Type**

```Java
double pi=3.14;
double radius=5.0;
double area=pi*radius*radius;
System.out.println(area); // Output: 78.53981633974483
```

**Float Data Type**

```Java
float pi=3.14f;
float radius=5.0f;
float area=pi*radius*radius;
System.out.println(area); // Output: 78.53981633974483
```

**String Data Type**

```Java
String name="John";
String lastName="Doe";
String fullName=name+" "+lastName;
System.out.println(fullName); // Output: John Doe
```

**Boolean Data Type**

```Java
boolean isMale=true;
boolean isTall=false;
System.out.println(isMale); // Output: true
System.out.println(isTall); // Output: false
```

**Expression**

```Java
// expression = operands & operators
// operands = values
// operators = + - * / %
int x=10;
int y=20;
int z=x+y;
System.out.println(z); // Output: 30
```

** Math Class **

```Java
double x=Math.PI;
double y=Math.E;
System.out.println(x); // Output: 3.141592653589793

// to get the square root of a number
double z=Math.sqrt(144); // Output: 12

// to get the power of a number
int w=Math.pow(2,3); // Output: 8

//! to get the absolute value of a number

int a=Math.abs(-10); // Output: 10

//! to get the maximum value of two numbers

int b=Math.max(10,20); // Output: 20

//! to get the minimum value of two numbers

int c=Math.min(10,20); // Output: 10

```

**Random Class**

```Java
import java.util.Random;
Random rand=new Random();
int randomNumber=rand.nextInt(10); // Output: 0 to 9
```

## Conditional Statements

** If Statement **

```Java

// if statement is used to perform an action if a condition is true
/*! syntax

    if(condition){
        // code to be executed if condition is true
    }

*/

int age=20;
if( age >70){
    Sytem.out.println("You are old  👴");
}
else if(age>=18){
    System.out.println("You are An Adult 🧑");
}
else if (age>=13){
    System.out.println("You are a teenager");
}
else if (age>=6){
    System.out.println("You are a kid :🍼");
}
else{
    System.out.println("You are a baby 👶");
}

```

** Switch Statement **

```Java
// switch statement is used to perform an action based on a condition
/*! syntax
    switch(condition){
        case value1:
            // code to be executed if condition is value1
            break;
        case value2:
            // code to be executed if condition is value2
            break;
        default:
            // code to be executed if condition is not value1, value2, value3
            break;
    }
*/

String day="Monday";
switch(day){
    case "Monday":
        System.out.println("Today is Monday");
        break;
    case "Tuesday":
        System.out.println("Today is Tuesday");
        break;
    case "Friday":
        System.out.println("Today is Friday , Its WeekEnd time 🤤");
        break;
    case "Saturday":
        System.out.println("Today is Saturday ");
        break;
    case "Sunday":
        System.out.println("Today is Sunday so take rest 😀");
        break;
    default:
        System.out.println("Invalid Day");
        break;
}
```

** While Loop **

```Java
// while loop is used to perform an action while a condition is true

/*! syntax
    while(condition){
        // code to be executed
    }
*/

int i=0;
while(i<=10){
    System.out.println(i);
    i++;
}
```

## Loops

```In Java , we have 4 types of loops
    1. for loop
    2. while loop
    3. do while loop
    4. for each loop

```

**Do While Loop**

```Java
// do while loop is used to perform an action at least once even if the condition is false
// code to be executed

/*! syntax
    while(condition){
// code to be executed
     }
*/

int i=19;
do{
    System.out.println(i);
    i--;
}while(i>=10); // this will execute till i is greater than 10
```

**For Loop**

```Java
// for loop is used to perform an action for a given number of times

// syntax
for(int i=0;i<=10;i++){
    // code to be executed
}

```

**For Each Loop**

```Java
// for each loop is used to iterate through the elements of an array or a collection
int [] numbers={1,2,3,4,5};
for(int i:numbers){
    System.out.println(i);
}
```
