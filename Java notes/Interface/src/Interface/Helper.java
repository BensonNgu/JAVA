package Interface;

import java.util.Scanner;

public class Helper {
    public static void display(String prompt){
        System.out.println(prompt);
    }

    public static String readString(String prompt){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print(prompt);
            return input.next();
        }
    }
}
