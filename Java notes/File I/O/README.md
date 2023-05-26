# Introduction
- Data stored in variable and arrays are temporary
    - lost when local variable goes out of scope or program terminated
- Fro long-term retention of data, computers use files
- Persistent data 
    - data maintained in files
    - exists beyond the duration of the program execution

## File and stream
- Java views each files as a sequential stream of bytes
- File stream can be used to input or output data as bytes or characters

|Byte-based streams||Character-based streams|
|---|---|---|
|output or input data in binary format|properties|output or input data as a sequence of characters|
|binary file|type of file|text files|

---
## Binary File
1. write
```java
import java.io.*;
public class WriteToBinFile{
    public static void main(String[] args){
        char[] characters = {'a','b','c'};
        int[] ints = {1,2,3};

        String outputFile = "test.bin";

        try{
            OutputStream os = new FileOutputStream(outputFile);
            for(char c : characters){
                os.write(c);
            }
            for(int i : ints){
                os.write(i);
            }
            os.close;
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
```
2. read
```java
import java.io.*;
import java.nio.charset.Charset;

public class ReadFromBinFile{
    public static void main(String[] args){
        String inputFile = "test.bin";
        try{
            InputStream is = new FileInputStream(inputFile);
            boolean carryOnReading = true;
            int couter = 0;
        }
    }
}
```

---
## Text File

---
## CSV File

---
## Object Serialization