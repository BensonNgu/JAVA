# Object Oriented Programming
##  Real World Object vs Software Object 
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

```
// 
public class Student{
    // Attribute declaration
    private String name;
    private int mark;

    public Student(String studName,int studMark){
        name = studName;
        mark = studMark;
    }

    public String getName(){
        return name;
    }

    public void setName(String studName){
        name = studName;
    }
    
    public int getMark(){
        return mark;
    }

    public void setMark(int studMark){
        mark = studMark;
    }
}
```
#### Explaination

```
public class Student
```
1 Access modifier
- can be public or private

2 Class Name
- unique name to identify the class within a package
- Naming convention
    - Uppercase the first letter of each word

3 Attribute declarations
```
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