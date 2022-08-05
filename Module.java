import java.util.ArrayList;

public class Module{
    private String name; //name of the module
    private String moduleCode;
    private String decription;
    private int creditUnits;
    private String assessmentName; 
    private ArrayList<Assessment> assessments = new ArrayList<Assessment>(); 

    // Constructors
    public Module(String name){
        this.name=name;
    }
    public Module(String name, String moduleCode, String decription, int creditUnits) {
        this.name = name;
        this.moduleCode = moduleCode;
        this.decription = decription;
        this.creditUnits = creditUnits; 
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setModuleCode(String moduleCode) {  
        this.moduleCode = moduleCode; 
    } 
    public void setDecription(String decription) {
        this.decription = decription;
    }
    public void setCreditUnits(int creditUnits) {   
        this.creditUnits = creditUnits;
    }
    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    
    //Method 
   /* public void setAssessment(Assessment assessment){  //the assessment must pre-set before calling this method, the result of toString method at Assessment.java will be written into the ArrayList
        assessments.add(assessment);
    }
    public double getOverallMarks(){                    //not sure\\
        return overallMarks;
    }
    public double getOverallTotalMarks(){               //not sure\\
        return overallTotalMarks;
    }
    public String getOverallGrade(){                    //not sure\\
        //return letter grade
        return overallGrade;
    }
    public double getGradePoint(String grade){          //not sure\\
        //return gpa
        return gradePoint;
    }

    public String toString(){
        return this.name; //return module name
    }

    public int getCreditUnits(){  //this method will return the number of credit units of the particular module 
        
        return;
    }*/
}

//num =4 
//String[] module = new String[2][num];
/*for(row = 0; row < module.length; row++){
    for(col = 0; col < module[row].length; col++){
        if(row == 0){
            System.out.print("Enter name of module")
            Scanner input = new Scanner(System.in);
        }
}
*/
//CA1 CA2 CA3 CA4