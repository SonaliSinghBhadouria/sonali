package Practice;
import java.util.*;
public class Swap2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 10
        int b = sc.nextInt(); //5
        a = b+a; // 15
        b = a-b; // 10
        a = a-b; // 5
        System.out.println(a+ " "+b);

    }
    
}
//swap 2 no. without using 3rd variable