package exception;

import java.util.Scanner;

public class Helper{
    public void print(String prompt){System.out.print(prompt);}
    public void printLine(String prompt){System.out.println(prompt);}
    public void printLine(int prompt){System.out.println(prompt);}
    public void printLine(double prompt){System.out.println(prompt);}
    public void printLine(Long prompt){System.out.println(prompt);}
    public void printLine(Boolean prompt){System.out.println(prompt);}


    public String readString(String prompt){
        Scanner input = new Scanner(System.in);
        print(prompt);
        return input.next();
    }

    public int readInt(String prompt){
        String ans = readString(prompt);
        int ansInt = 0;
            try{
                ansInt = Integer.parseInt(ans);
            }catch(IllegalArgumentException e){
                printLine("*** PLEASE ENTER INTEGER ONLY ***");
            }
            return ansInt;
    }

    public boolean readBoolean(String prompt){
        String option = readString(prompt);
        boolean ansBool = true;
        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("q")){  //quit game
            ansBool = true;
        }else if(option.equalsIgnoreCase("n") || option.equalsIgnoreCase("c")){ //con0tinue game
            ansBool = false;
        }else{
            printLine("*** PLEASE ENTER Y/N OR C/Q ONLY ***");
        }
        return ansBool;
    }

    public int askForOption(String title,String[] menu){
        printLine(title);
        display(menu);
        while(true){
            int option = readInt("Enter your option => ");
            if(option > menu.length || option < 0){
                printLine("*** PLEASE ENTER AN VALID OPTION ***");
                option = readInt("Enter your option => ");
            }else{
                return option;
            }
        }
    }

    public void display(String[] menu){
        for(int i = 0;i<=menu.length;i++){
            if(i == menu.length){
                printLine("[0] Quit");
            }else{
                printLine("[" + (i+1) +"] " + menu[i]);
            }
        }
    }
}