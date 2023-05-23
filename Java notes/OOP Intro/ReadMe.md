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

--
## Encapsulation
- Putting all related attributes and methods that operate on the attributes, into a single unit(i.e. class)
- Benefits:
    <details>
        <summary>Hiding date</summary>

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
