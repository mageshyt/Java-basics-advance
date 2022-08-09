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

**Math Class**

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

**If Statement**

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

**Switch Statement**

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

**While Loop**

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

## Printf

```Java
    public static void main(String[] args) {

        // ! printf() is a function that prints the formatted output to the console
        // ! %d -> decimal
        // ! %f -> float
        // ! %s -> string
        // ! %c -> character
        // ! %d -> decimal

        String name = "Magesh";
        int age = 18;
        boolean IsMarried = false;
        char charAt = 'A';
        float wealth = 1000000000.00f;

        System.out.printf("My Name is %s", name);
        System.out.printf("\nMy Age is %d", age);
        System.out.printf("\nMy Wealth is %f", wealth);
        System.out.printf("\nIs Married? %s", IsMarried ? "Yes" : "No");
        System.out.printf("\nMy Character is %c \n", charAt);

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

**Array**

```Java
   // Array is a collection of elements of the same type
   String [] names={"Lara","Ts","Js","Python"};
    System.out.println(names[0]); // Output: Lara
    System.out.println(names[1]); // Output: Ts

    // to print the elements of the array
    for(int i=0;i<names.length;i++){
        System.out.println(names[i]);
    }

    // to print the elements of the array in reverse order
    for(int i=names.length-1;i>=0;i--){
        System.out.println(names[i]);
    }

    // ! to get input from the user

    String [] food=new String[3];

    for(int i=0;i<food.length;i++){
        System.out.println("Enter the name of the food");
        food[i]=sc.nextLine();
    }
```

**String**

```Java
        // String = a reference data type that stores a sequence of characters

        // ! 1. String is immutable
        // ! 2. String is not a primitive data type

        String name = "John";
        String name2 = new String("John");

        boolean isEqual = name.equals(name2); // ! returns true if both strings are equal

        int length = name.length(); // ! returns the length of the string

        char charAt = name.charAt(0); // ! returns the character at the specified index

        String substring = name.substring(0, 3); // ! returns a substring of the string

        String toUpperCase = name.toUpperCase(); // ! returns a string with all characters in uppercase

        String toLowerCase = name.toLowerCase(); // ! returns a string with all characters in lowercase

        String Food = "Grapes";

        String NewFood = Food.replace('G', 'P'); // ! replaces the first occurrence of the specified character with the
                                                 // specified character

```

**Array List**

```Java

// ArrayList= a resizable array that can hold elements of different types
        // ! Element can be added and removed from after compilation phase

        ArrayList<String> food = new ArrayList();

        Scanner sc = new Scanner(System.in);
        food.add("Grapes");
        food.add("Apples");
        food.add("Oranges");
        food.remove(1); // ! remove element at index 1
        for (String string : food) {
            System.out.println("My Favorite Food: " + string);
        }
        ArrayList<String> DrinksList = new ArrayList<String>();
        DrinksList.add("String 😀");
        DrinksList.add("Coke");
        DrinksList.add("Banana");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // ! 2d array

        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

        arrayList.add(food);
        arrayList.add(DrinksList);

        System.out.println(arrayList);

        System.out.println(arrayList.get(0).get(1)); // this will get the 2 nd element of the 1st arraylist
        int n = 4;

        for (int i = 0; i < n; i++) {
            int userInt = sc.nextInt();
            numbers.add(userInt);
        }

        System.out.println("Number of elements: " + numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

```

## Functions

```Java
  public static void main(String[] args) {
        // function is a block of code that performs a specific task
        // function is a block of code that performs a specific task
        sayHello("Magesh & Lara");
        sayHello("Hemanth & Ranjith");
        sayHello("Sathvika");
        sayHello("Nabe &devi");
        sayHello("Amen & sindhu");
        int a = 10;
        int b = 20;

        // ! the variable pass to a function is called Arguments
        System.out.println("the sum of the numbers is " + add(a, b));

    }

    static void sayHello(String name) {
        // ! Function parameters are the names listed in the function's definition
        System.out.println("Hello " + name + " !");
    }

    static int add(int a, int b) {
        return a + b;
    }
```

**Function OverLoading**

```Java
    public static void main(String[] args) {
        // ! function overloading -> function or method that share the same name but
        // have different parameters
        // method name + parameter type = method signature

        System.out.println(" OverLoading - sum of two numbers " + sum(10, 20));
        System.out.println(" OverLoading - sum of three numbers " + sum(10, 20, 30));
        System.out.println(" OverLoading - sum of four numbers " + sum(10, 20, 30, 40));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    // ! sum function with 3 parameters
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum function with 4 parameters
    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
```

# Object Oriented Programming

<h2>Class</h1>

<img src="https://cdn.sanity.io/images/7azvzymu/production/15bb14657ee290df82facebb598a774ac51fea29-4320x5372.png">

<h2>Object</h1>
<img src='https://cdn.sanity.io/images/7azvzymu/production/5b271138b200d2bd73bc053a2fd45c123f99a21e-4320x5372.png'>

**Creating of class**

```Java
public class Monster {

    String MonsterName;

    String MonsterWeapon;

    void power() {
        System.out.printf("%s is using %s to attack 🔋 \n", MonsterName, MonsterWeapon);
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Monster Name: ");
        MonsterName = sc.nextLine();
        System.out.printf("Enter Monster Weapon: ");
        MonsterWeapon = sc.nextLine();
        sc.close();
    }

    void Damage() {
        System.out.printf("%s is doing damage 🔥 \n", MonsterName);
    }

}
```

```Java
public class Main {

    public static void main(String[] args) {

        /*
         * object=instance of class that may contain data and methods
         * class=template for object
         * method are functions that can be performed on object
         */
        Monster m1 = new Monster();
        m1.getData(); // these are
        m1.power();
        m1.Damage();

    }

}
```

**Constructor**

`constructor is a special method that is automatically called when an object`

```Java
public class GameCharacter {

    private String name, weapon;
    private int health;
    private int power;

    GameCharacter(String name, int power, int health, String weapon) {
        // ! constructor is a special method that is automatically called when an object
        // is created
        this.name = name;
        this.power = power;
        this.health = health;
        this.weapon = weapon;
    }

    public void Ability() {

        System.out.printf("The %s Character has a %s Power with the %d Health   \n", name, weapon, health);

    }

}

public class Main {

    public static void main(String[] args) {


        GameCharacter c1 = new GameCharacter("Wizard", 100, 100, "Magical");
        c1.Ability();

    }
}
```

**variable scope**

```Java
  // Local -> variable declared inside a method that are visible only inside that method

  // global -> variable declared outside a method , with in class are visible to the all part of the class

//! Example
public class Main {
    String name="Lara"; // global variable

    public static void main(String[] args) {
        System.out.println("Hello " + name); // name can be accessed inside the the main

        System.out.println("Hello " + programmer); // this will give error because programmer is not defined


    }

    public greet() {
        String programmer="Magesh"; // local variable
        System.out.println("Hello " + programmer); // program can be accessed  the the greet method only

    }
```
