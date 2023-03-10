package basicjava;

import java.util.*;

public class Factorial {
    public static void printFactorial(int n) {
        int factorial = 1;
        if (n<=0){
            System.out.println("the given no. is invalid");
            return;
        }
        for(int a=n ; a>=1 ; a--){
            factorial = factorial*a;    
        }
        System.out.println("the factorial of the given no. is "+ factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.");
        int n = sc.nextInt();      
        printFactorial(n);  
    }
    
    
}
