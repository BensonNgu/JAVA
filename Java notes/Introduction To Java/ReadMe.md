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
| **Operator** | **Meaning** | **Example** | **Value of Z** |
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
| **Operator**  | **Equivalant** |
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

        // int(32 bits) -> double(64 bits)
        int value1 = 32;
        double value2 = value1;
        System.out.println(value1);     //32
        System.out.println(value2);     //32.0
    </details>
    <details>
        <summary>Casting</summary>

        // double(64 bits) -> int(32 bits)
        double value1 = 32.5;
        int value2 = (int)value1;
        System.out.println(value1);     //32.5
        System.out.println(value2);     //32
    </details>
    <details>
        <summary>String to numeric type</summary>

        // Convert to int
        String s1 = "32";
        int value1 = Integer.parseInt(s1);
        // Convert to double
        String s2 = "32.5";
        double value2 = double.parseDouble(s2);
    </details>
---
## Get User input
```
// import Scanner class 
import java.util.Scanner;

public class Main(){
    private static Scanner myScanner = new Scanner(System.in); 

    public static void main(String[] args){
        System.out.println("Enter some text: ");
        String text = myScanner.nextLine();
        System.out.println(text);

        System.out.println("Enter a number: ");
        int intNum = myScanner.nextInt();
        System.out.println(intNum);

        System.out.println("Enter a double: ");
        int doubleNum = myScanner.nextDouble();
        System.out.println(doubleNum);
    }
}
```
---
## Condition Operator
| **Operator** | **Meaning** |
|---|---|
| == | Equal to |
| != | Not equal to |
| < | Less than |
| <= | Less than or equal to |
| > | Greater than |
| >= | Greater than or equal to |
---
## Decesion
### If
    // If a condition is true, we enter the if block statement. 
    // Else we skip the if block statement.
    public class IfExample{
        public static void main(String[] args){
            int n = 6;  
            if(n > 5){
                System.out.println("n is more than 5")
            }
        }
    }

### If-Else
    // If a condition is true, we enter the if block statement. 
    // Else we skip the if block statement.
    public class IfElseExample{
        public static void main(String[] args){
            int n = 3;  
            if(n > 5){
                System.out.println("n is more than 5")
            }else{
                System.out.println("n is not more than 5")
            }
        }
    }

### If-Else If-Else
    // If a condition is true, we enter the if block statement. 
    // Else we skip the if block statement.
    public class IfElseExample{
        public static void main(String[] args){
            int n = 0;  
            if(n > 5){
                System.out.println("n is more than 5")
            }else if(n > 3){
                System.out.println("n is more than 3")
            }else{
                System.out.println("n is not more than 3")
            }
        }
    }
### Switch
    // break keyword for each case is necessary to isolate each case
    public class SwitchExample{
        public static void main(String[] args){
            int caseNum = 1;
            switch(caseNum){
                case 1: 
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    // default is use to handle non-defined cases
                    System.out.println("none of Above");
            }
        }
    }
---
## Compound Situation
***AND  &&***
| **Condition A** | **Condition B** | **Result** |
|---|---|---| 
|X|X|X|
|X|/|X|
|/|X|X|
|/|/|/|

***OR ||***
| **Condition A** | **Condition B** | **Result** |
|---|---|---| 
|X|X|X|
|X|/|/|
|/|X|/|
|/|/|/|

---
## Repetition 
<details>
    <summary>For Loop</summary>

    /* Syntax:
    for(initialisation ; terminating condition ; increment/decrement){
        // code goes into here
        statement(s)
    }
    */

    //Example
    public class ForExample{
        public static void main(String[] args){
            for(int i = 1;i <= 5;i++){
                System.out.println("run " + i);
            }
        }
    }
</details>
<details>
    <summary>Advanced For Loop</summary>


</details>
<details>
    <summary>While Loop</summary>

    /*Syntax:
    while(condition){
        statement(s)
    }
    */

    //Example
    
</details>