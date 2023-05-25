

## Inheritance

- Object of diffrent classes may share the common properties and behaviours

- Example : Library System

- Types of items for loans:

- CD

- books

- magazine

- These items share some of the common propertis.

- Thus a [**superclass**](#superclass) "LoanItem" is defined

- CD, Book and Magazine classes inherits from LoanItem class

- Those classes inherit from superclass are called [**subclasses**](#subclass)

---

## Superclass

- defines the common properties and behaviours

## Subclass

- inherits all attributes and methods from its superclass

- has its own special attributes and methods

  

## Relationship between superclass and subclass

- Inheritance establish "is-a(type of)" relationship to them

- CD is a type of LoanItem
- Books is a type of LoanItem
- Magazine is a type of LoanItem

![Class Diagram](img/Screenshot_20230524_100912.png)
---
## How to inherit from a superclass in JAVA?
- Using **extends** keyword
```java
public class LoanItem{
	private String itemID;
	private String title;
	// constructor in a superclass
	public LoanItem(String itemID; String title){
		this.itemID = itemID;
		this.title = title;
	} 

	public void borrow(){
		...
	}
	public void return(){
		...
	}
}
```
```java
public class CD extends LoanItem{
	private String singer;
	//other special attributes and method of CD
	...
}
```
---
## Super Reference
- reserved keyword
- refers to the corresponding superclass
- - used by the subclasses to access members of their superclass
```java
public class CD extends LoanItem{
	private String singer;
	
	// constructor in a subclass
	public CD(String itemID; String title, String singer){
		super(itemID,title); 			// call the constructor of its superclass
		this.singer = singer;
	}
}
```
- When do we use **super** keyword?
	- access super class constructor
	- access an overridden method in super class from subclass (later) 
---
## Constructor in subclasses
- Subclass does to inherit constructor from super constructor
- Subclass must call the super class constructor
- The calling may be 
<details>
<summary>**implicit** when <ins>there is a</ins> default constructor</summary
		
```java
public class SuperConstructor{
	public SuperConstructor(String msg){	//this is not a default constructor as it takes in parameter(s)
		System.out.println(msg);
	}
}
```

```java
public class SubConstructor extends SuperContructor{
	public SubConstructor(){
		// the super class default constructor will be called implicitly
		System.out.println("In SubContructor");
	}
	
	public static void main(String[] args){
		SubConstructor sub = new SubConstructor();
	}
}
```
Output : 
```
In SuperContructor
In SubContructor
```
</details>
<details>
<summary>**explicit** when <ins>there is no</ins> default constructor</summary>

```java
public class SuperConstructor{
	public SuperConstructor(String msg){	//this is not a default constructor as it takes in parameter(s)
		System.out.println(msg);
	}
}
```
```java
public class SubConstructor extends SuperContructor{
	public SubConstructor(){
		super("Calling super class constructor");
		System.out.println("In SubContructor");
	}
	
	public static void main(String[] args){
		SubConstructor sub = new SubConstructor();
	}
}
```
Output : 
```
Calling super class constructor
In SubContructor
```
</details>

---
## Private vs Protected 
<table>
<tr>
<th>Private Mambers</th>
<th></th>
<th>Protected Members</th>
</tr>
<tr>
<td>not accessible by its subclasses</td>
<td>Properties</td>
<td>only accessible by its subclasses</td>
</tr>
<tr>
<td>

```java
public class LoanItem{
	private String itemID;
	private String title;
}
```
```java
public class CD extends LoanItem{
	private String singer;
	
	// constructor in a subclass
	public CD(String itemID; String title, String singer){
		this.itemID = itemID;	// X DIRECT access to superclass's private member is NOT allowed
		this.title = title;		// X DIRECT access to superclass's private member is NOT allowed
		this.singer = singer;
	}
}
```

</td>
<td>Example Code</td>
<td>

```java
public class LoanItem{
	protected String itemID;
	protected String title;
}
```
```java
public class CD extends LoanItem{
	private String singer;
	
	// constructor in a subclass
	public CD(String itemID; String title, String singer){
		this.itemID = itemID;	// DIRECT access to superclass's private member is allowed
		this.title = title;		// DIRECT access to superclass's private member is allowed
		this.singer = singer;
	}
}
```

</td>
</tr>
</table>

---




