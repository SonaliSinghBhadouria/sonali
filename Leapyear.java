import java.util.*;
public class Leapyear {
    public static void main(String[] args)
    { 
      Scanner sc = new Scanner(System.in);
      int c = sc.nextInt();
      if(((c%4 == 0) && (c%100 != 0)) || (c%400 == 0)){
        System.out.println("Leap Year");        
      }else {
        System.out.println("Not a Leap Year");
      }
        // Write your code here
    }
}
