# EXPLAINATION OF THE EXAMPLE
## ANIMAL TYPE (Normal class)
- [Rabbit](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Rabbit.java)
- [Fish](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Fish.java)
- [Hawk](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Hawk.java)
---
## INTERFACE
- [Prey](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Prey.java)
- [Predator](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Predator.java)


---
## Q/A
1. What should we do in our interface ?  
*Declare only the methods name with no content in the body* ([example from Prey class](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Prey.java))

```
    void flee();  
```

2. How to use the interface for my other java class ?  
*Use the keyword **implements** follow by the **interface name** in the classes that we desire to implement the interface* ([example from Rabbit class](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Rabbit.java))
```
public Rabbit implements Prey{ ... }
```

3. How to use the method on the interface ?  
*As we have mentioned in the main page, interface is like a templete. Thus, we need to rewrite or modify (override) the content inside each method* ([example from Rabbit class](https://github.com/BensonNgu/java/blob/main/Java%20notes/Interface/src/Interface/Rabbit.java))
```
public Rabbit implements Prey{
    public void flee(){
        System.out.println("Rabbit is fleeing.");
    }
}
```  
