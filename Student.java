import java.util.ArrayList;
public class Student {
    private String name;
    private String studentID;
    private String grade;
    private ArrayList<Module> modules = new ArrayList<Module>(); //this array will store a bunch of module names

    //methods

    //constructor
public Student(){
    this.modules = new ArrayList<Module>();
}

    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
        this.modules = new ArrayList<Module>();
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    public void printModule(){
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Module: ");
        for(Module module : this.modules){
            System.out.println(module.getName());
            }
    }
//setter
    public void setName(String name){
        this.name = name;
    }
    public void setID(String studentID){
        this.studentID = studentID;
    }

//getter
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.studentID;
    }
//output of the program
    public String toString(){
        String moduleName="";
         for(Module module : this.modules){
            moduleName += module.getName() + " ";
            }
        String  result = this.name  + "\t" + this.studentID + "\t" + moduleName;
        return result;
    }
 
    
    public int getTotalCreditUnits(){
        int marks = 0;
        return  marks;
    }
}
