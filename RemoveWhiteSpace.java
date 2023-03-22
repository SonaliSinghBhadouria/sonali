package Practice;
import java.util.*;
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name"); 
        String name = sc.nextLine();
        name = name.replace(" ", "");
        System.out.println(name);
    }    
}
// remove white space from strings