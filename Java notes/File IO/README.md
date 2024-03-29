# Introduction
- Data stored in variable and arrays are temporary
    - lost when local variable goes out of scope or program terminated
- For long-term retention of data, computers use files
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
            boolean carryOn = true;
            int couter = 0;
            while(carryOn){
                int byteRead = is.read();
                counter++;

                if(byteRead == -1){         // when there is the end of the binary file, is.read() will return us -1
                    carryOn = false;
                }else{
                    System.out.println(byteRead);

                    if(counter <= 3){
                        byte[] bytes = {(byte) byteRead};
                        String str = new String(bytes ,Charset.forName("UTF-8"));
                        System.out.println(str);
                    }
                }
            }
        }catch(IOException ex){
            System.out.println("IO Exception");

        }
    }

}
```

---
## Text File
1. write
```java
import java.io.*;

public class WriteToTextFile{
    public static void main(String[] args){
        String outputFileName = "fruits.txt";

        try{
            PrintWriter pw = new PrintWriter(outputFileName);

            pw.write("Apple\n");
            pw.write("Orange\n");
            pw.write("Pear");

            pw.close();
        }catch(FileNotFoundException ex){
            System.out.println("Unable to open file for writing");
        }
    }
}
```
2. read
```java
import java.util.*;
import java.io.*;

public class ReadFromTextFile{
    public static void main(String[] args){
        String inputFileName = "fruits.txt";
        try{
            File file = new File(inputFileName);
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Unable to open file for reading");
        }
    }
}
```
---
## CSV File
The below is a class needed in order to execute the following example code
```java
public class Student{
    private String studentNumber;
    private String fName;
    private String lName;
    private double score;

    public Student(String studentNumber,String fName,String lName, double score;){
        this.studentNumber = studentNumber;
        this.fName = fName;
        this.lName = lName;
        this.score = score;
    }

    public String computeGrade(double score){
        String grade = "F";
        if(score >= 85){
            grade = "HD";
        }else if(score >= 75){
            grade = "B";
        }else if(score >= 65){
            grade = "C";
        }if(score >= 50){
            grade = "P";
        }
        return grade;
    }

    public String toCSVString(){
        return studentNumber + "," + this.computeGrade(this.score);
    }

    public String toString(){
        return studentNumber + " " + fName + " " + lName + "["+score+"]\n";
    }
}
```
1. write  
```java
import java.io.*;
import java.util.*;

public class WriteToCSVFile{
    private final String OUTPUT_FILENAME = "grades.csv";
    private static Arraylist<Student>students;

    public static void main(String[] args){
        ReadFromCSVFile read = new ReadFromCSVFile();
        students = read.getstudents();  // you can either load student objects from current csv file or create few student object and add them into the ArrayList
        try{
            PrintWriter pw = new PrintWriter(OUTPUT_FILENAME); 
            for(Student studentObj : students){
                pw.write(studentObj.toCSVString()+"\n");
            }
            pw.close();
        }catch(FileNotFoundException ex){
            System.out.println("Unable to find file for reading");
        }

    }


}
```
2. read
```java
import java.io.*;
import java.util.*;

public class ReadFromCSVFile{
    private static ArrayList<Student>students = new ArrayList<Result>();
    public static void main(String[] args){
        String inputFileName = "result.csv";
        try{
            File file = new File(inputFileName);
            Scanner reader = new Scanner(file);

            String header = reader.nextLine();  // read the header (not necessary needed depend on whether there is a header in the csv file or not)

            while(reader.hasNextLine()){
                String line = reader.nextLine().trim(); // to remove exra beginning and ending white spaces
                if(line.equals("")){        // skip empty line
                    continue;               // go back to while loop
                }

                String[] data = line.split(",");
                String studentNumber = data[0].trim();
                String fName = data[1].trim();
                String lName = data[2].trim();
                double score = Double.parseDouble(data[3].trim());

                Student student = new Student(studentNumber,fName,lName,score);
                students.add(student);
            }
        }catch(FileNotFoundException e){
            System.out.println("Unable find file for reading");
        }

        for(Student studentObj : students){
            studentObj.toString();
        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
```
---
## Object Serialization
- read an entire object from / write an entire object to a file
- After serialized object has been written into a file, it can be read by deserialized to recreate the object in memory
- Serializable is an interface, thus a class need to **implement** Serializable.

[Get more Example](https://github.com/BensonNgu/java/tree/main/Java%20notes/File%20IO/src)
