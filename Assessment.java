import java.util.ArrayList;
public class Assessment {
    private String name; // CA1 CA2 CA3 CA4
    private String description;
    private Module module;
    private double marks;
    private double totalMarks;
    private double weightage;
   
    public Assessment(String name, Module module){
        this.name = name;
        this.module = module;
    }
    
    public void setMarks(double stuMarks){
         marks = stuMarks;
     }
    
    public void setTotalMarks(String name){
        
        switch(name){
            case "CA1": //quiz
            totalMarks = 20.0;
            break;

            case "CA2": 
            totalMarks = 100.0;
            break;
        
            case "CA3":
            totalMarks = 100.0;
            break;

            case "CA4": //quiz
            totalMarks = 20.0;
            break;
        }
    }

    public int getTotalMarks(String name){
        switch(name){
            case "CA1": //quiz
            totalMarks = 20.0;
            break;

            case "CA2": 
            totalMarks = 100.0;
            break;
        
            case "CA3":
            totalMarks = 100.0;
            break;

            case "CA4": //quiz
            totalMarks = 20.0;
            break;
        }
        return (int)totalMarks;
    }
    public  void getWeightage(String name){
        
        switch(name){
            case "CA1":
            weightage = 10.0;
            break;

            case "CA2":
            weightage = 40.0;
            break;
        
            case "CA3":
            weightage = 40.0;
            break;

            case "CA4":
            weightage = 10.0;
            break;
        }
    }

    //main methods
    public double getWeightedMarks(){
        double weightedMarks = (marks / totalMarks) * weightage;
        return weightedMarks;
    }

    public String[] toArrayStrings(){ //this method collect the module name from Module.java and assessment name
        String[] strArray = new String[5];
        for(int i=0; i<strArray.length; i++){  
            if(i == 0){
                strArray[i] = module.toString();
            }else{
                strArray[i] = name;
            }
        }        
        return strArray;
    }
}