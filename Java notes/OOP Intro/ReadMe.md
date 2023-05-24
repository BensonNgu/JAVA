# Object Oriented Programming
|Table of content|
|---|
|[Real World Object vs Software Object ](#real-world-object-vs-software-object)|
|[What is Object Oriented Program](#what-is-object-oriented-program)|
|[Object](#object)|
|[Encapsulation](#encapsulation)|
|[Class](#class)<br />- [Class Declaration](#class-declaration)|
|[]()|
|[]()|
#  Real World Object vs Software Object 
| Real World Object | Software Object |
|---|---|
|state|attribute/property|
|behaviour|method|
---
## What is Object Oriented Program
- made up of a collection of objects cooperating to perform some tasks

---
## Object
- Store its state in variables and exposes its behaviour through method(s)
- Method
    - operate on an object's internal state
    - serve as the primary mechanism for object-to-object communication
- It is more understandable using the uml class diagram

| Staff |
|---|
| - staffId:int<br />- name:String<br />- salary:double<br />- jobTitle:String |
|+ updateProfile(String:name,salary:double,jobTitle:String):void<br />+ getPaid():double<br />+ applyLeaves():void<br />|

---

## Encapsulation
- Putting all related attributes and methods that operate on the attributes, into a single unit(i.e. class)
- Benefits:
    <details>
        <summary>Hiding data</summary>

        - User will have no idea how class are being implemented or stored
        - Only know that values are being passed and initiated
    </details>
    <details>
        <summary>More flexibility</summary>

        - Enable to set variables to read-only or write-only
        - read-only :
            getName() method which only return the value of name 
        - write-only: 
            setName() method which only set the value of the variable but would not return any value
    </details>
    <details>
        <summary>Easy to reuse</summary>

        - easy to change and adapt to new requirement
    </details>

---
## Class
- Blueprint of an object
- establish 'the kind of data an object of the type will hold'
- defines the methods that represent the behaviour of such objects

### Class Declaration
- Every class can contain attribute declaration and method declaration
- Each new class created becomes a new data type in java that can be used to declare variables and create objects

```java
public class Student{
    // Attribute declaration
    private String name;
    private int mark;

    public Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getMark(){
        return mark;
    }

    public void setMark(int mark){
        this.mark = mark;
    }
}
```
#### Explaination

```java
public class Student
```
1. *Access modifier*
    - can be public or private

2. *Class Name*
    - unique name to identify the class within a package
    - Naming convention
        - Uppercase the first letter of each word

3. *Attribute declarations*
    ```java
        // Attribute declaration
        private String name;
        private int mark;
    ```
    - name and marks are called instance variables as memory
    - Each student object has its own name and marks
    - Each instatnce variable has access modifier
        - public -> can be refferenced outside of the object
        - private -> can only be refferenced anywhere within the class 
    - Normally, instance variables are "private" to ensure data [encapsulation](#encapsulation)

4. *Constructor*
    ```java
        public Student(String name,int mark){
            this.name = name;
            this.mark = mark;
        }
    ```
    - Initialize a new instance of the class when the object is created using the "new" keyword
    - **Not necessary needed by a class** -> java compiler provides a default constructor with no parameter for such class
    - **Name of the constructor** -> must be the same as the class name
    - **Return type** -> none
    - **Access modifier** -> public
    - ***this reference***
        - special reference in java, reserverd keyword
        - allows object to <ins>refer to itself</ins> within its class definition
        - can used to <ins>distinguish</ins> the <ins>parameters of the constructor</ins> from their <ins>corresponding instance variables with the same name</ins>


5. Accessors (Getter)
    ```java
    public String getName(){
        return name;
    }
    ```
    - methods that provide read-only access to instance variables
6. Mutators (Setter)
    ```java
    public void setName(String name){
        this.name = name;
    }
    ```
    - methods that allow changes to values of instance variables


### Creating objects
```java
/*
syntax:
ObjectType variableName = new ObjectType(parameter(s))
*/
Student student1 = new Student("Benson",90);
```


## Scope of Instance Variables
<table>
<tr>
<th>Variable</th><th>Scope</th><th>Example</th>
</tr>
<tr>
<td>Instance</td><td>anywhere within the class</td>
<td>

```java
public class Student{
    private String name;
}
```

</td>

</tr>

<tr>
<td>Local</td><td>anywhere within the method</td>
<td>
        
```java
public class Student{
    public String calcGrade(){
        String studGrade;
        ...
        ...
    }
}
```
        
</td>
</tr>
</table>

---
## Static Variable
- known as class variable
- there is only one copy of a static variable for **ALL OBJECT** of the class

```java
public class Student{
    //static variable
    private static int count = 0;

    //non-static variable
    private String name;
    private int marks;

    public Student(String name,int mark){
        this.name = name;
        this.mark = mark;
        count++;
    }

    public static int getCount(){
        return Student.count;
    }

    public static String toString(){
        return name + " [count = "+ count +"]";
    }


    public static void main(String[] args){
        Student stud1 = new Student("Benson",90);
        System.out.println("Before adding another student > " + stud1.toString());

        Student stud2 = new Student("Lily",85);
        System.out.println(stud2.toString());

        System.out.println("After adding another student > " + stud1.toString());
    
        /*
        Output:
        Before adding another student > Benson [count = 1]
        Lily [count = 2]
        After adding another student > Benson [count = 2]
        */
    }
}
```
---
## Static Method
- known as class method
- can be invocked through the class name
- can only access the static variable of the class
- Don't need to instantiate an object of the class in order to invoke the method

---
## ArrayList
- Why to use arraylist but not array
    - size of array is fixed once it is declared
    - no way to increase the size of array during the program execution
- ArrayList Benefits
    - size of arraylist is "dynamic"
    - that means the size can grow or shrink during the program execution
### Declaring ArrayList
```java
ArrayList<String> names = new ArrayList<String>();
```
### Add Objects to ArrayList
```java
names.add("Benson");
names.add("Lily");
```
### Get Object From ArrayList
<details>
    <summary>Using index</summary>

```java
System.out.println(name.get(0));    
System.out.println(name.get(0));    
```
</details>
<details>
    <summary>Using for loop</summary>

```java
for(int i = 0;i < name.size();i++){
    System.out.println(name.get(i));
}
```
</details>
<details>
    <summary>Using advanced for loop</summary>

```java
for(String name : names){
    System.out.println(name);
}
```
</details>

### Remove Object From ArrayList
```java
//obj in the arraylist names which has the index 0 is "Benson"
names.remove(0);    

for(String name : names){
    System.out.println(name);
}

// output : Lily
```

### Set Object in the ArrayList at a specific index
```java
// initial value of object with index 0 in ArrayList names: "Benson"
names.set(0,"John");
System.out.println(names.get(0));
// output : John
```