# Introduction to Java

## How Java Program look like?
```
public class Main{
    
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

<details>

<summary>Expand to see the explaination</summary>

### Explaination

- Every java file should have a class 
- The 'main' class name should be the same as the current java file name 
- Example, there is a java file call HelloWorld.java and the following is the class declaration for this java file

```ruby
   public class HelloWorld{
    // The above line shows how a java class declaration looks like
   }
```

- A main method is the  starting point from where compiler starts program execution.
- Not every java file should have a main method
```
    public static void main(String[] args){
        System.out.println("Hello World");
    }
```
</details>
---
## Primitive Data Types
- use to represent "simple" values  

| **Data Types** | **Size in Bits** | **Example** |
|---------|--------| --------|
| boolean | 8 | true / false |
| char | 16 | 'a' ,'!' ,'[' |
| byte | 8 | 100 , 20 |
| short | 16 | -32768 ~ 32767 (-2<sup>15</sup> ~ 2<sup>15</sup> - 1) |
| int | 32 | 100000 , 20 |
| long | 64 | 7000000000L |
| float | 32 | 5.75f |
| double | 64 | 19.99d |
[more information about primitive data type](https://www.javatpoint.com/primitive-data-types-in-java#:~:text=Primitive%20data%20types%20in%20Java%20are%20predefined%20by,data%20type.%20int%20data%20type.%20long%20data%20type.)  
---
## String
- An example of non-primitive data type
- it contain a collection of characters surrounded by double 
quotes
```
String name = "Benson";
```
---
## Variable Declaration
- Syntax:
    - type variableName = value;
```
    String name = "Benson";
    int age = 21;
    double weight = 67.5;
    char gender = 'm';
    boolean isStudent = true;
```
---
## Constant Variable Declaration
- To prevent overwriting existing values, use Constant value
- Use the final keyword (read-only)
- Naming Convention
    - Only Uppercase letters
    - seperate each word with an underscore "_"
    - usually declared as a static class variable
```
final static double CONVERT_RATE = 2.4;
``` 
---
## Enumerations
- defines a set of constants that are represented as unique identifiers

```
public class EnumExample{
    enum Status{CONTINUE,WIN.LOST};

    public static void main(String[] main){
        Status myStatus = Status.WIN;
        System.out.println(myStatus);
    }
}
```
---
## Arithmetic operation
|Operator|Meaning|Example|Value of Z|
|---|---|---|---|
| + | Addition | int z = 17 + 4 | 21 |
| - | Subtraction | int z = 17 - 4 | 13 |
| * | Multiplication | int z = 17 * 4 | 68 |
| / | Division | int z = 17 / 4 | 4* |
| % | Modulus | int z = 17 % 4 | 1 |
| - | Unary minus | int z = -17 | -17 |
---
## Increment / Decrement Operators
- Increment operator (++) adds 1 to an integer value.
- Decrement operator (--) subtracts 1 from an integer value.

### Prefix / Postfix
#### example:
    - prefix: ++count
    - postfix: count++
    
* both are same with count = count + 1;
* But can yeild different result depending on the form of used 
```
public class IncOperator{
    public static void main(String[] main){
        int count = 5;
        /*Postfix*/
        System.out.println(count++);    // 5
        System.out.println(count);      // 6
        /*Prefix*/
        System.out.println(++count);    // 7
        System.out.println(count);      // 7
    }
}
```
--- 
## Assignment Operators
| Operator  | Equivalant |
|---|---|
| total += 5; | total = total + 5; |
| total -= 5; | total = total - 5; |
| total *= 5; | total = total * 5; |
| total /= 5; | total = total / 5; |
---
## Data Conversion
-  Java is a strongly typed language, each data is associated with a 
particular type.
- Sometimes there is a need to convert a data value of one type to 
another.
- WAYS OF CONVERSION
    <details>
        <summary>Assignment conversion</summary>

        int(32 bits) -> double(64 bits)
        int value1 = 32;
        double value2 = value1;
        System.out.println(value1);
        System.out.println(value2);
    </details>
    <details>
        <summary>Casting</summary>
        
        int(32 bits) -> double(64 bits)
        int value1 = 32;
        double value2 = value1;
        System.out.println(value1);
        System.out.println(value2);
    </details>