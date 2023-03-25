import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      String c = sc.next();
      int d ;
      String e = "+";
      String f = "*";
      String g = "-";
      String h = "/";
      String i = "%";
      if (c.compareTo(e)==0){
        d = a +b;
        System.out.println(d);
      }else if (c.compareTo(f)==0){
        d = a * b;
        System.out.println(d);
      }else if (c.compareTo(g)==0){
        d = a - b;
        System.out.println(d);
      }else if (c.compareTo(h)==0){
        d = a / b;
        System.out.println(d);
      }else if (c.compareTo(i)==0){
        d = a % b;
        System.out.println(d);
      }else {
        System.out.println("Enter valid arithmetic operator");
      }
    }
    
}
