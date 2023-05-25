# Exception
|Table of Content|
|---|
|[]()|
---
## What is Exception in Java ?
- Problem that arises during the execution of a program
- It occur due to different reasons. For example:
    - invalid data is entered
    - A file that needs to be opened cannot be found
    - Network connection lost
    - JVM has run out of memory

[Back To Top](#exception)

---
## Category of exception
```mermaid
flowchart LR
%% color section %%
classDef blue fill:#6699ff,stroke:#000,stroke-width:2px,color:#fff
classDef red fill: #ff0000,stroke:#000,stroke-width:2px,color:#000

top[Throwable]:::blue
level2.1[Error]:::red
level2.2[Exception]:::blue
level3[RuntimeException]:::red
level4.1[NullPointerException\n NumberFormatException\n ClassCastException\n IndexOutOfBoundException]:::red
level4.2[IOException\n SQLException\n MalformedURLException\n ...]:::blue

level2.1-->top
level2.2-->top
level3-->level2.2
level4.2-->level2.2
level4.1-->level3
```
### Checked Exception
- 
### Unchecked Exception
- 
### Error
- 

[Back To Top](#exception)

---