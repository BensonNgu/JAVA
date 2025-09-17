// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    private static int[] months_31 ={1, 3, 5, 7, 8, 10, 12};
    private static int[] months_30 = {4, 6, 9, 11}; 
    
    public static void main(String[] args) {
        // Write code 
        
        // Write code here
        // checkMonth(1);
        // checkMonth(9);

        // getMiddleDigit(123);
        
        validTriangle()
        
    }
    
    public static void checkMonth(int N){
        
        int long_month = Arrays.binarySearch(months_31, N);
        int short_month = Arrays.binarySearch(months_30, N);
        if(N == 2) System.out.println(28);
        else if (long_month >= 0) System.out.println(31);
        else if(short_month >= 0) System.out.println(30);
        else System.out.println("Invalid month");
    }
    
    public static void getMiddleDigit(int N){
        int target = ((N - N % 10) / 10)%10;
        System.out.println(target);
    }
    
    public static void validTriangle(String A, String B, String C) {
        // return yes or no
        int a = Integer.parseInt(A);
        
        int b = Integer.parseInt(B);
        
        int c = Integer.parseInt(C);

        int longest = a;

        if(b > longest) longest = b;
        
        if(c > longest) longest = c;

    }
}