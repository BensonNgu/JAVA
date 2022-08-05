import java.util.*;
public class GradeTracker{
    //Array List
    private static ArrayList<Student> students = new ArrayList<Student>();
    private static ArrayList<Module> module = new ArrayList<Module>();
    //private static ArrayList<String> stu_module = new ArrayList<String>();
    private static String name;
    private static String studentID;
    public static void main(String[] args){
        int exitKeyword = 0;
        Scanner input = new Scanner (System.in);
        System.out.printf("%30S%n%37s%n%34s%n%33s%n%37s%n%-12s","sim homepage","What service do you want?","1.  Student management","2.  Module management","3.  Assessment management","Your option");//header
        int option = input.nextInt();
        while (option!=exitKeyword){
            switch(option){
                case 1:
                //student management 
                stuManagement();
                break;
                case 2:
                //module management
                moduleManagement();
                case 3:
                //assessment management
            }

            //To prompt the home page to user
            System.out.printf("%n%n%n%30S%n%37s%n%34s%n%33s%n%37s%n%-12s","sim homepage","What service do you want?","1.  Student management","2.  Module management","3.  Assessment management","Your option");//header
            option = input.nextInt();

            }
        } 

        public static void stuManagement(){
            Scanner input = new Scanner (System.in);
            //ask user to select one management
            System.out.printf("%n%n%n%36S%n%28s%n%31s%n%30s%n%29s%n%n","student management page","1.  Add student","2.  Remove student","3.  Calculate GPA","4.  Student List");//header
            int option1 = input.nextInt();
            switch(option1){
                case 1:
                //add student
                System.out.println("Add student");//header
                System.out.print("How many student will be added");
                int numOfStu = input.nextInt();
                for(int counter = 1;counter <= numOfStu;counter++){
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter studentID: ");
                    studentID = input.next();
                    Student stu = new Student(name,studentID);//request name and id from user
                    System.out.println("How many module did he/she takes?");
                    int count = input.nextInt();
                    for(int i = 0; i < count; i++){
                        System.out.print("Enter module name:");
                        String module = input.next();
                        Module modules = new Module(module);
                        stu.addModule(modules);
                    }
                    students.add(stu);
                }
                break;
                case 2:
                //remove student
                System.out.println("Remove Student");//header
                for(Student stuList : students){
                    System.out.printf( "%d. %s%n",students.indexOf(stuList) , stuList);
                }
                System.out.print("Enter the index of the student that you want to remove");
                int indexStu = input.nextInt();
                students.remove(indexStu);
                break;
                case 3:
                //calculate gpa
                break;
                case 4: //test to print the arrayList
                System.out.println("Current ArrayList");
                for(Student stuList : students){
                    System.out.printf( "%d. %s%n",students.indexOf(stuList) , stuList);
                }
                //getname only
                indexStu = input.nextInt();
                System.out.println("Name: " + students.get(indexStu).getName());
                System.out.println("What module did he take");
                for(Module_enum moduleEnum : Module_enum.values()){
                    module.add(moduleEnum.getName());
                }
                for(Module element: module){
                    System.out.println(module);
                }
            }
    }

    public static void moduleManagement(){

        /*ask user to choode a student first
           a. Add any number of Modules to a student 
           b. Remove added Modules from a student 
           c. Calculate the marks a student scored for the Module 
           d. Calculate the grades a student scored for the Module*/
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%n%n%36S%n","Modules Management Page");
        System.out.printf("%49s%n%55s%n%43s%n","1. Edit the Module (Create or Delete)","2. Edit the students' Module(add or delete)","3. Marks/Grade for the students");
        int option2 = input.nextInt();
        switch(option2){
            case 1:
            System.out.println("Module Editing Page");
            System.out.println("Exixting Module");
            for(Module_enum module : Module_enum.values()){
                System.out.print(module.getName());
            }
            System.out.println("Create(1) or Delete(2)");
            int optionInMoule = input.nextInt();
            switch(optionInMoule){  
                case 1:
                System.out.print("Name of module: ");
                break;
                case 2:
                break;
                default:
                break;
            }
        }
    }
    public static void assessmentManagement(){
        /*a. Add  any  number  of  Assessments  to  a  Module  that  is  assigned  to  a Student. 
          b. Remove any Assessment in a Module assigned to a student */
        Scanner input = new Scanner(System.in);
        
    }
}
